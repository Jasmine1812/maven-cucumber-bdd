package stepDefinitions;

import cucumberOptions.Hooks;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.pageObjects.CommonPageObject;
import pages.pageObjects.PageGenerator;

public class CommonPageStep {
    public CommonPageStep(){
        this.driver = Hooks.openAndQuitBrowser();
        commonPage = PageGenerator.getCommonPage(driver);
    }
    private WebDriver driver;
    private CommonPageObject commonPage;

    @And("User enter to {string} textbox with value {string}")
    public void userEnterToTextboxWithValue(String fieldName, String value) {
        commonPage.enterToDynamicTextboxByLabel(fieldName, value);
    }

    @And("User enter to {string} date with value {string}")
    public void userEnterToDateWithValue(String fieldName, String value) {
        commonPage.enterToDynamicDatePicker(fieldName, value);
    }

    @And("User select to {string} dropdown with value {string}")
    public void userSelectToDropdownWithValue(String fieldName, String value) {
        commonPage.selectToDynamicDropdown(fieldName, value);
     }
}
