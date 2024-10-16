Feature: Login
  @Login
  Scenario: Check Login
    Given Get url login page orangehrm
    When User enter to User Name
    And User enter to Password
    And User click Login Button
    And User wait 5s
    