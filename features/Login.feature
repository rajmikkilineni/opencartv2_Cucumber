Feature: Login
  @sanity
  Scenario: Successful Login with Valid Credentials
    Given user Launch browser
    And opens URL "https://demo.opencart.com/"
    When User navigate to MyAccount menu
    And click on Login
    And User enters Email as "rajmikkilineni@yahoo.com" and Password as "Raj15903"
    And Click on Login button
    Then User navigates to MyAccount Page
