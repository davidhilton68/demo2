Readme.md
● Dashboard cluster (node1/node2) fixes:

  1. "Cannot locate job plan" error on node2 — made ContextMachineCache.containsInstanceIdentifier() consult the REST proxy fallback, so follower nodes can act on leader-owned instances.
  2. Navigation crash opening a leader instance from follower — audited ~20 UI components that called getContext() / queue methods through the proxy (which throws); switched them to
  getLocalByContextInstanceId() to skip local-only operations when the instance is remote.
  3. "ENDED" status not reflected on node2 after a reset — the reset code set status to ENDED before firing the state-change event, causing the guard to suppress the broadcast; fixed by capturing
  the previous status and broadcasting explicitly.

✻ Worked for 17s

❯ can you do the same for the Monday, if your memory does not go that far back, don't worry.                                                                                                         

● Based on the conversation history I have (prior session summary), Monday's work was:

  1. Five threading fixes to ContextTemplateWidget — fixed the core node1→node2 enable/disable broadcast not updating the UI, including a missing init() call before refreshAll() and missing
  ui.access() wrappers.
  2. 108-second push delay investigation — ruled out Atmosphere PoolableBroadcasterFactory and Vaadin heartbeat interval as causes; both changes were reverted. Root cause remains unresolved.
  3. ContextMachineCache.containsInstanceIdentifier() fix — extended it to consult the cluster fallback provider, enabling follower nodes to recognise instances owned by the leader.
