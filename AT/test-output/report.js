$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/Features/NDTV.feature");
formatter.feature({
  "name": "Automation testing webpage validations",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify that Automation Testing web application menu item is working fine.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.step({
  "name": "Open \"chrome\" Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.NDTVweatherUI.open_Browser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Launch \"https://www.ndtv.com/\" with expected page title \"Get Latest News, India News, Breaking News, Today\u0027s News - NDTV.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.NDTVweatherUI.enter_URL(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \"WEATHER\" tab with expected page title \"NDTV Weather - Weather in your Indian City\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.NDTVweatherUI.clickTab(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search \"Ajmer\" city and check the checkbox",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.NDTVweatherUI.searchAndCheckCity(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fetch all data shown for \"Ajmer\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.NDTVweatherUI.fetchDataForCity(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.NDTVweatherUI.closeBrowsr()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fetch data for \"Ajmer\" from API using \"64d62235e7b5b4d48030c8cdd4d62981\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.APIDataFetch.fetchAPIData(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});