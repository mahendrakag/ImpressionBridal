$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CollectionHome.feature");
formatter.feature({
  "line": 1,
  "name": "to verify Login page scenarios.",
  "description": "",
  "id": "to-verify-login-page-scenarios.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User Login with correct details",
  "description": "",
  "id": "to-verify-login-page-scenarios.;user-login-with-correct-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@collection"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "launch \"chrome\" browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "launch url \"http://localhost/impression/\"",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "verify page by \"url\" with \"http://localhost/impression/\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "verify page by \"title\" with \"Impression Bridal\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Close The Popup Window",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on menu link on \"Collections\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify page by \"url\" with \"http://localhost/impression/impression/collection\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "MouseOver on menu \"Collections\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click on DropDown Menu Collection in \"Wedding Gowns\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Click on CollectionPanel Category Gowns \"Collections\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Select the checkbox type \"Ashley \u0026 Justin Bride\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Select the checkbox type \"Victor Harper\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Click on CollectionPanel Category Gowns \"Collections\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Click on CollectionPanel Category Gowns \"Fabric\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 8
    }
  ],
  "location": "HomeStepDef.launch_browser(String)"
});
formatter.result({
  "duration": 4927677191,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost/impression/",
      "offset": 12
    }
  ],
  "location": "HomeStepDef.launch_url(String)"
});
formatter.result({
  "duration": 3372011987,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "url",
      "offset": 16
    },
    {
      "val": "http://localhost/impression/",
      "offset": 27
    }
  ],
  "location": "HomeStepDef.verify_page_by_with(String,String)"
});
formatter.result({
  "duration": 25508592,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "title",
      "offset": 16
    },
    {
      "val": "Impression Bridal",
      "offset": 29
    }
  ],
  "location": "HomeStepDef.verify_page_by_with(String,String)"
});
formatter.result({
  "duration": 7324868,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDef.close_The_Popup_Window()"
});
formatter.result({
  "duration": 5109700412,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Collections",
      "offset": 23
    }
  ],
  "location": "CollectionStepDef.click_on_menu_link_on(String)"
});
formatter.result({
  "duration": 6151944362,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "url",
      "offset": 16
    },
    {
      "val": "http://localhost/impression/impression/collection",
      "offset": 27
    }
  ],
  "location": "HomeStepDef.verify_page_by_with(String,String)"
});
formatter.result({
  "duration": 13152231,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Collections",
      "offset": 19
    }
  ],
  "location": "CollectionStepDef.mouseover_on_menu(String)"
});
formatter.result({
  "duration": 5063601825,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Wedding Gowns",
      "offset": 38
    }
  ],
  "location": "CollectionStepDef.click_on_DropDown_Menu_Collection_in(String)"
});
formatter.result({
  "duration": 5366855781,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Collections",
      "offset": 41
    }
  ],
  "location": "CollectionStepDef.click_on_CollectionPanel_Category_Gowns(String)"
});
formatter.result({
  "duration": 5126979101,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ashley \u0026 Justin Bride",
      "offset": 26
    }
  ],
  "location": "CollectionStepDef.select_the_checkbox_type(String)"
});
formatter.result({
  "duration": 5104563488,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Victor Harper",
      "offset": 26
    }
  ],
  "location": "CollectionStepDef.select_the_checkbox_type(String)"
});
formatter.result({
  "duration": 5072866452,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Collections",
      "offset": 41
    }
  ],
  "location": "CollectionStepDef.click_on_CollectionPanel_Category_Gowns(String)"
});
formatter.result({
  "duration": 5072197473,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Fabric",
      "offset": 41
    }
  ],
  "location": "CollectionStepDef.click_on_CollectionPanel_Category_Gowns(String)"
});
formatter.result({
  "duration": 5078429458,
  "status": "passed"
});
formatter.after({
  "duration": 325659618,
  "status": "passed"
});
});