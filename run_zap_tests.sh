#!/usr/bin/env bash


#sm --stop ASSETS_FRONTEND
#sleep 5
#sm --start ASSETS_FRONTEND -r 4.22.0

sbt clean -Denvironment=local -Dbrowserchrome -Dbrowser.option.headless=false 'testOnly uk.gov.hmrc.test.ui.runner.ZapRunner'

