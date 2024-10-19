package stepDefinitions;

import cucumberOptions.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.pageObjects.*;

public class EmployeeStep {
    public EmployeeStep() {
        this.driver = Hooks.openAndQuitBrowser();
        employeeListPage = PageGenerator.getEmployeeListPage(driver);
    }

    private WebDriver driver;
    private LoginPageObject loginPage;
    private DashboardPageObject homepage;
    private String loginPageUrl;
    private PersonalDetailsPageObject personalDetailsPage;
    private EmployeeListPageObject employeeListPage;






    @And("User enter to EmployeeID textbox with value {string}")
    public void userEnterToEmployeeIDTextboxWithValue(String employeeID) {
        employeeListPage.enterToEmployeeIDTextbox(employeeID);
    }

    @And("User click to Search button")
    public void userClickToSearchButton() {
        employeeListPage.clickToSearchButton();
    }
    @When("User open Personal Details {string} by edit icon")
    public void userOpenPersonalDetailsByEditIcon(String employeeID) {
        personalDetailsPage = employeeListPage.openPersonalDetailsByEditIcon("1", "Id", employeeID);
    }
}
