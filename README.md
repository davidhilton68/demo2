  Done:
  - Fixed 9 broadcaster test files failing with IllegalAccessException — Java 17 blocks reflective writes to static final fields; switched from replacing the field to
  calling .clear() on the existing instance.
  - Fixed UnnecessaryStubbingException in ContextMachineTest with lenient().when(...).
  - Added junit-vintage-engine to rest-dashboard pom so pre-existing JUnit 4 tests aren't silently skipped.
  - Converted ClusterEventControllerTest to JUnit 5.
  - Added tests to ContextMachineControllerTest and created ContextMachineRestImplTest (18 tests) for the doWrite/doRead retry logic.
  - Added 16 tests to ClusterPeerRestServiceImplTest and rewrote ContextMachineRestServiceImplTest (42 tests) with full WireMock coverage.

  In progress:
  - ikasan-dashboard module has 455 test errors all caused by one issue: Docker Desktop only shares /home, but UITest was bind-mounting /tmp/solr-data. Fixed the path
  to ~/solr-data — fix applied but test re-run was not confirmed before end of session.

  Blocked/parking:
  - ContextMachineControllerTest has a pre-existing NoSuchMethodError on ContextMachineCache.isLeaderForContextInstance — stale installed jar from before Mick added
  that method. Needs job-orchestration/core to be rebuilt; leaving for Mick.

