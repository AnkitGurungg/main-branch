### Log levels
```md
TRACE
DEBUG
INFO
WARN
ERROR

Ordered from lowest severity to highest severity.
```

### Workflow
1. Spring first finds the most specific log level configured for the package. 
```md
logging.level.com.mainbranch=DEBUG
```

2. Then it prints logs of the mentioned level and all higher-severity levels, while ignoring lower-severity levels.
```md
In code:
log.trace("trace");
log.debug("debug");
log.info("info");
log.warn("warn");
log.error("error");

Output:
DEBUG debug
INFO info
WARN warn
ERROR error

-> Because TRACE is below the configured threshold (DEBUG), so it gets filtered out.
```
