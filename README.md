# affordability-acceptance-tests

### This is the acceptance test suite for online payments the new Affordability screens within the Self Assessment SUPP Service (Affordability) service.

## Running the tests

Prior to executing the tests ensure you have the appropriate [drivers installed](#installing-local-driver-binaries), install [MongoDB](https://docs.mongodb.com/manual/installation/) and install/configure [service manager](https://github.com/hmrc/service-manager).  

Run the following command to start services locally:

    sudo mongod
    sm --start SSTTP
    
