
# affordability-acceptance-tests

### This is the acceptance test suite for online payments the new Affordability screens within the Self Assessment SUPP Service (Affordability) service.

System properties can be used to specify the browser type and environment against which the tests should be run.
The following options are currently supported:

```
browser = chrome / headless-chrome
environment = local / dev / qa / staging
```

To test the service locally, use the following service manager profile to run the required services
```
sm --restart SSTTP -r
```

As an example, to run tests locally using chrome, the following can be run from a shell script
```
driver_path=/usr/local/bin/chromedriver
sbt -Denvironment=local -Dbrowser=chrome -Dwebdriver.chrome.driver=${driver_path} 'testOnly affordability-acceptance-tests.runner.Runner'
```

