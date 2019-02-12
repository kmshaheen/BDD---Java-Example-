$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("socks.feature");
formatter.feature({
  "line": 2,
  "name": "socks",
  "description": "",
  "id": "socks",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@run"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#search amazon website for socks"
    }
  ],
  "line": 5,
  "name": "search for socks",
  "description": "",
  "id": "socks;search-for-socks",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "that i am on the amazon website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "i enter \u0027socks\u0027 in search",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "i submit search",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "i click on the first item listed",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "i can validate that I am on the selected item page",
  "keyword": "Then "
});
formatter.match({
  "location": "SockDefinition.that_i_am_on_the_amazon_website()"
});
formatter.result({
  "duration": 7008564903,
  "status": "passed"
});
formatter.match({
  "location": "SockDefinition.i_enter_socks_in_search()"
});
formatter.result({
  "duration": 2120714346,
  "status": "passed"
});
formatter.match({
  "location": "SockDefinition.i_submit_search()"
});
formatter.result({
  "duration": 4468660571,
  "status": "passed"
});
formatter.match({
  "location": "SockDefinition.i_click_on_the_first_item_listed()"
});
formatter.result({
  "duration": 4603064949,
  "status": "passed"
});
formatter.match({
  "location": "SockDefinition.i_can_validate_that_I_am_on_the_selected_item_page()"
});
formatter.result({
  "duration": 2040179657,
  "status": "passed"
});
formatter.after({
  "duration": 154893440,
  "status": "passed"
});
});