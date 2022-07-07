
Feature: To check the Amazon web application
 
  @tag1
  Scenario: To validate the add to cart funtionality
    Given user opens google chrome and launches amazon url
    When user search for a pen in the search bar
    And user clicks on search button
    And In search result page user clicks on the first item
    Then user will be navigated to product details page
    And user clicks on add to cart button
    Then product should be added to cart


