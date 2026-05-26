- Added isClusterLeader(contextInstanceId) to ContextMachineCache — consults ZooKeeper via a registered LeaderProvider rather than inferring leadership from stale cache state
  - Wired LeaderProvider registration into ContextMachineClusterConfiguration
  - Replaced all unsafe getLocalByContextInstanceId != null guard-pattern usages in SplitContextInstanceVisualisation, ContextInstanceTreeViewWidget, and ContextInstanceWidget with isClusterLeader
  - Updated ContextMachineController REST endpoints to gate on isClusterLeader, preventing a stale former-leader from serving stale data to peers
  - Left ScheduleProcessInboundProducer unchanged — event processing is local-only by design


