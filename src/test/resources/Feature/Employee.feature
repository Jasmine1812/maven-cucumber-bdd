Feature: Employee

  @UpdatePersonalDetails
  Scenario: Update Personal Details
    Given User login to OrangeHRM page
    When Open Employee List Page
    And User enter to EmployeeID textbox with value "0036"
    And User click to Search button
    When User open Personal Details "0036" by edit icon
    And User enter to "Other Id" textbox with value "100491"
    And User enter to "License Number" textbox with value "A129-456-8899"
    And User enter to "License Expiry Date" date with value "2028-10-27"
    And User enter to "Date of Birth" date with value "1991-08-10"
    And User select to "Nationality" dropdown with value "American"
    And User select to "Marital Status" dropdown with value "Single"
    And User click to submit button
    And User wait 2s

  @UpdatePersonalDetails02
  Scenario Outline: Update Personal Details 02
    Given User login to OrangeHRM page
    When Open Employee List Page
    And User enter to EmployeeID textbox with value "<EmployeeID>"
    And User click to Search button
    And User open Personal Details "<EmployeeID>" by edit icon
    And User enter to "Other Id" textbox with value "<Other Id>"
    And User enter to "License Number" textbox with value "<License Number>"
    And User enter to "License Expiry Date" date with value "<License Expiry Date>"
    And User enter to "Date of Birth" date with value "<Date of Birth>"
    And User select to "Nationality" dropdown with value "<Nationality>"
    And User select to "Marital Status" dropdown with value "<Marital Status>"
    And User click to submit button
    And User wait 2s
    Examples:
      | EmployeeID | Other Id | License Number | License Expiry Date | Date of Birth | Nationality | Marital Status |
      | 0057       | 100491   | A129-456-8899  | 2028-10-27          | 1991-08-10    | American    | Single         |
#      | 0046       | 100491   | A129-456-8899  | 2028-10-27          | 1991-08-10    | American    | Single         |


