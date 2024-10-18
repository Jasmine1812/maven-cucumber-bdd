Feature: Employee
  @UpdatePersonalDetails
  Scenario: Update Personal Details
    Given User login to OrangeHRM page
    When User open Personal Details by edit icon
    And User enter to "" textbox with value ""
    And User wait 10000s
#  personalDetailsPage.enterToOtherIdTextbox(otherId);
#  personalDetailsPage.enterToDriversLicenseNumberTextbox(driversLicenseNumber);
#  personalDetailsPage.enterTolicenseExpiryDateDatePicker(licenseExpiryDate);
#  personalDetailsPage.enterToDateOfBirthteDatePicker(dateOfBirth);
#  personalDetailsPage.selectToNationalityDropdown(nationality);
#  personalDetailsPage.selectToMaritalStatusDropdown(maritalStatus);
#  personalDetailsPage.clickToRadioButtonByLabelName(gender);
#  personalDetailsPage.clickToSaveButtonOnPersonalDetails();
#  Assert.assertTrue(personalDetailsPage.isSuccessMessageDisplayed("Successfully Updated"));
#  personalDetailsPage.waitForSpinnerIconInvisible();
#  Assert.assertEquals(personalDetailsPage.getNationalityDropdownSelectedText(), nationality);
#  Assert.assertEquals(personalDetailsPage.getMaritalStatusDropdownSelectedText(), maritalStatus);
#  Assert.assertTrue(personalDetailsPage.isRadioButtonSelectedByLabelName(gender));


