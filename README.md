• - Fixed SchedulerJob compile failure by installing fresh local ikasan5 snapshot artifacts.
  - Added a null-module guard to avoid ModuleControlApplication.getFlow() NPEs.
  - Downgraded noisy non-Bearer auth logging from WARN to DEBUG.
  - Found PEER2 was advertising localhost:9095 because public.service.address was missing.
  - Added public.service.address for PEER1 and PEER2 configs.
  - Deleted stale Solr moduleMetaData for ikasan-dashboard-node2.
  - Confirmed PEER2 now advertises http://127.0.0.2:9095.
7.
