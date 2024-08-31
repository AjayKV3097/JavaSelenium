$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\java\\features\\searchUser.feature");
formatter.feature({
  "name": "Addactin Application tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Search Users",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "when user enters username as \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "when user enters password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks login button",
  "keyword": "When "
});
formatter.step({
  "name": "user search for \"\u003chotel\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "hotel name should be retrived and logged out",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "hotel"
      ]
    },
    {
      "cells": [
        "AjayVcetEceb",
        "Ajasou@1430",
        "Hotel Sunshine"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search Users",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "when user enters username as \"AjayVcetEceb\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSeps.whenUserEntersUsernameAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "when user enters password as \"Ajasou@1430\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSeps.whenUserEntersPasswordAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSeps.userClicksLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user search for \"Hotel Sunshine\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSeps.userSearchFor(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate option with value: Sydne\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027AJAY\u0027, ip: \u0027192.168.29.143\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.9\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.findOptionsByValue(Select.java:283)\r\n\tat org.openqa.selenium.support.ui.Select.selectByValue(Select.java:186)\r\n\tat steps.LoginSeps.userSearchFor(LoginSeps.java:76)\r\n\tat ✽.user search for \"Hotel Sunshine\"(src\\test\\java\\features\\searchUser.feature:8)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "hotel name should be retrived and logged out",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSeps.hotelNameShouldBeRetrivedAndLoggedOut()"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded4.png");
formatter.after({
  "status": "passed"
});
});