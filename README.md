Cluster/follower node work (multi-node ZooKeeper setup):
  - Follower nodes now show "Operation Not Supported" dialog for enable/disable, reset job plan, synchronise jobs,
  and create new instance — previously these operations silently executed or did nothing
  - Fixed ContextMachineRestImpl to query ZooKeeper for the current leader directly (with configurable
  retries/interval) rather than broadcasting to all nodes — reduces cluster chattiness
  - DLQ (DeadLetterQueueManagement) exposed via REST so follower nodes proxy DLQ display and resubmit operations to
  the leader

  Job Plan Template Management screen:
  - Status changes (skip/hold/enable/release) on one node now broadcast across cluster nodes
  - Fixed icons disappearing (skip, hold, enable, release, download, delete) after a broadcast update

  Misc:
  - Fixed encryption facility error handling to log properly and show a user-friendly message
  - Added explanatory code comment to ScheduleProcessInboundProducer re: why getLocalByContextInstanceId is safe
