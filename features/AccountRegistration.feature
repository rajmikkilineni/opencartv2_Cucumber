Feature: Account Registration
  @regression
  Scenario: Successful Account Registration with Valid user details
    Given user Launch browser
    And opens URL "https://demo.opencart.com/"
    When User navigate to MyAccount menu
    And User click on Register
    Then User navigates to Register Account page
    When User provide valid details
    And click on continue
    Then User should see "Your Account Has Been Created!" message