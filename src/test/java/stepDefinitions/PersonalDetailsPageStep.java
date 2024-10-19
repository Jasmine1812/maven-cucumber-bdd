package stepDefinitions;

import cucumberOptions.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.pageObjects.*;

public class PersonalDetailsPageStep {
    public PersonalDetailsPageStep() {
        this.driver = Hooks.openAndQuitBrowser();
        personalDetailsPage = PageGenerator.getPersonalDetailsPage(driver);
    }

    private WebDriver driver;
    private LoginPageObject loginPage;
    private DashboardPageObject homepage;
    private String loginPageUrl;
    private PersonalDetailsPageObject personalDetailsPage;
    private EmployeeListPageObject employeeListPage;



    @And("User click to submit button")
    public void userClickToSubmitButton() {
        personalDetailsPage.clickToSaveButtonOnPersonalDetails();
    }
}
