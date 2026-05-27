Investigated why job BF_MD_CR_CURVE in the MARKET_DATA_LOAD_MHI child context of MUREX_MHI_BATCH_prd was showing as
   skipped on Tuesday with no audit trail. Ruled out stale template data and prepared-instance pre-seeding via Solr
  queries. Identified that the skip likely originated from a template-level skip set on Monday (bank holiday), which
  propagated to Tuesday's instance at creation time without triggering any runtime log or system event. Next step:
  confirm by checking the body text of Monday's system event entry.
