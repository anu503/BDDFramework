$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Danda/selenium/FreeCRMBDDFramework/src/main/java/com/Features/dealsmap.Feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Dealsmap Feature",
  "description": "",
  "id": "free-crm-dealsmap-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Dealsmap Test Scenario",
  "description": "",
  "id": "free-crm-dealsmap-feature;free-crm-dealsmap-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "anudanda",
        "test@123"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user mouse over on deals link",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user clicks on New deal link",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user enters new deal details",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probability",
        "commission"
      ],
      "line": 16
    },
    {
      "cells": [
        "deal123",
        "3000",
        "20",
        "25"
      ],
      "line": 17
    },
    {
      "cells": [
        "deal234",
        "4000",
        "30",
        "35"
      ],
      "line": 18
    },
    {
      "cells": [
        "deal345",
        "5000",
        "40",
        "45"
      ],
      "line": 19
    },
    {
      "cells": [
        "deal456",
        "6000",
        "50",
        "55"
      ],
      "line": 20
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "dealsmapStepDefinition.user_is_already_on_Login_page()"
});
formatter.result({
  "duration": 6691429915,
  "status": "passed"
});
formatter.match({
  "location": "dealsmapStepDefinition.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 47022646,
  "status": "passed"
});
formatter.match({
  "location": "dealsmapStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 741512559,
  "status": "passed"
});
formatter.match({
  "location": "dealsmapStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 5199686578,
  "status": "passed"
});
formatter.match({
  "location": "dealsmapStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 9080440,
  "status": "passed"
});
formatter.match({
  "location": "dealsmapStepDefinition.user_mouse_over_on_deals_link()"
});
formatter.result({
  "duration": 272412324,
  "status": "passed"
});
formatter.match({
  "location": "dealsmapStepDefinition.user_clicks_on_New_deal_link()"
});
formatter.result({
  "duration": 163643927,
  "status": "passed"
});
formatter.match({
  "location": "dealsmapStepDefinition.user_enters_new_deal_details(DataTable)"
});
formatter.result({
  "duration": 24794201869,
  "status": "passed"
});
});