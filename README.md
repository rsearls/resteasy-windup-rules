# resteasy-windup-rules
Windup rules to move from RestEasy to JBossws-jaxrs

####testing setup
  - install Windup 
  - set WINDUP_HOME
  - cp resteasy-windup-rules/rules/*.xml ~/.windup/rules/.
  - run cmd-line:

${WINDUP_HOME}/bin/windup -sourceMode --target eap --overwrite \
--input ${USER_PATH}/resteasy-windup-rules/test-data \
--output ${USER_PATH}/resteasy-windup-rules/report

