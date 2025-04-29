BROWSER=$1
ENVIRONMENT=$2
HEADLESS=$3

sbt clean -Dbrowser="${BROWSER:=chrome}" -Dbrowser.option.headless="${HEADLESS:=true}" -Denvironment="${ENVIRONMENT:=local}" "testOnly uk.gov.hmrc.test.ui.runner.Runner" testReport