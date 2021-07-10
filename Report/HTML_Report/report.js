$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Login Functionality of adactin application",
  "description": "",
  "id": "login-functionality-of-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "User enters the valid username and password",
  "description": "",
  "id": "login-functionality-of-adactin-application;user-enters-the-valid-username-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@mani"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user launches the url of adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters \"\u003cusername\u003e\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters \"\u003cpassword\u003e\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks the login button",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "login-functionality-of-adactin-application;user-enters-the-valid-username-and-password;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "login-functionality-of-adactin-application;user-enters-the-valid-username-and-password;;1"
    },
    {
      "cells": [
        "MAni",
        "0000"
      ],
      "line": 13,
      "id": "login-functionality-of-adactin-application;user-enters-the-valid-username-and-password;;2"
    },
    {
      "cells": [
        "mnb",
        "...."
      ],
      "line": 14,
      "id": "login-functionality-of-adactin-application;user-enters-the-valid-username-and-password;;3"
    },
    {
      "cells": [
        "nnn",
        "mmmm"
      ],
      "line": 15,
      "id": "login-functionality-of-adactin-application;user-enters-the-valid-username-and-password;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5455400,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User enters the valid username and password",
  "description": "",
  "id": "login-functionality-of-adactin-application;user-enters-the-valid-username-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@mani"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user launches the url of adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters \"MAni\" as username",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters \"0000\" as password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_launches_the_url_of_adactin_application()"
});
formatter.result({
  "duration": 11551688700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MAni",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_enters_as_username(String)"
});
formatter.result({
  "duration": 316497800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0000",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_enters_as_password(String)"
});
formatter.result({
  "duration": 205309800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_the_login_button()"
});
formatter.result({
  "duration": 525594200,
  "status": "passed"
});
formatter.after({
  "duration": 793200,
  "status": "passed"
});
formatter.before({
  "duration": 859400,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User enters the valid username and password",
  "description": "",
  "id": "login-functionality-of-adactin-application;user-enters-the-valid-username-and-password;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@mani"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user launches the url of adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters \"mnb\" as username",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters \"....\" as password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_launches_the_url_of_adactin_application()"
});
formatter.result({
  "duration": 341931400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mnb",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_enters_as_username(String)"
});
formatter.result({
  "duration": 197407900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "....",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_enters_as_password(String)"
});
formatter.result({
  "duration": 178223200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_the_login_button()"
});
formatter.result({
  "duration": 466202100,
  "status": "passed"
});
formatter.after({
  "duration": 183900,
  "status": "passed"
});
formatter.before({
  "duration": 358200,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User enters the valid username and password",
  "description": "",
  "id": "login-functionality-of-adactin-application;user-enters-the-valid-username-and-password;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@mani"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user launches the url of adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters \"nnn\" as username",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters \"mmmm\" as password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_launches_the_url_of_adactin_application()"
});
formatter.result({
  "duration": 340994400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nnn",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_enters_as_username(String)"
});
formatter.result({
  "duration": 195856300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mmmm",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_enters_as_password(String)"
});
formatter.result({
  "duration": 183506400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_the_login_button()"
});
formatter.result({
  "duration": 549669900,
  "status": "passed"
});
formatter.after({
  "duration": 282800,
  "status": "passed"
});
});