$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/amazon.feature");
formatter.feature({
  "name": "To check the Amazon web application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the add to cart funtionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "user opens google chrome and launches amazon url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.user_opens_google_chrome_and_launches_amazon_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search for a pen in the search bar",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.user_search_for_a_pen_in_the_search_bar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In search result page user clicks on the first item",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.in_search_result_page_user_clicks_on_the_first_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will be navigated to product details page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_will_be_navigated_to_product_details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on add to cart button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_add_to_cart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "product should be added to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.product_should_be_added_to_cart()"
});
formatter.result({
  "status": "passed"
});
});