Extended ContextMachine interface with getDlqMessages, deleteDlqMessage, and deleteAllDlqMessages; implemented in ContextMachineRestImpl proxy so follower nodes can access the leader's DLQ via REST
  - Refactored DeadLetterQueueManagementWidget to use getByContextInstanceId so both leader and follower can display and manage DLQ entries
  - Fixed cross-cluster UI sync on Job Plan Template Management — added missing ContextTemplateSavedEventBroadcaster.broadcast() calls after all mutating operations
  - Fixed action icons disappearing on the receiving node after a broadcast — SecurityContextHolder is null on background threads; switched to captured authentication
  - Fixed encryption dialog — added null guard for spring.config.server.url and improved error logging
