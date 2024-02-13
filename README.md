# affordability-acceptance-tests

### This is the acceptance test suite for online payments the new Affordability screens within the Self Assessment SUPP Service (Affordability) service.

## Running the tests

Prior to executing the tests ensure you have the appropriate [drivers installed](#installing-local-driver-binaries), install [MongoDB](https://docs.mongodb.com/manual/installation/) and install/configure [service manager](https://github.com/hmrc/service-manager).  

Run the following command to start services locally:

    sudo mongod
    sm --start SSTTP
    
All tests are run against dockerised environments. You must have [docker-selenium-grid](https://github.com/hmrc/docker-selenium-grid) installed.

Start the dockerised environments through the `start.sh` script in docker-selenium-grid.

Then execute the `run_tests.sh` script in the affordability-acceptance-tests repo:

    ./run_tests.sh <environment> <browser-driver>

The `run_tests.sh` script defaults to the `local` environment with the dockerised `chrome` browser.  For a complete list of supported param values, see:
 - [docker-selenium-grid](https://github.com/hmrc/docker-selenium-grid)  for **browser**
