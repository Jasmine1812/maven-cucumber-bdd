package stepDefinitions;

import cucumberOptions.Hooks;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.pageObjects.DashboardPageObject;
import pages.pageObjects.EmployeeListPageObject;
import pages.pageObjects.LoginPageObject;
import pages.pageObjects.PageGenerator;

public class HomeStep {
    public HomeStep(){
        this.driver = Hooks.openAndQuitBrowser();
        homepage = PageGenerator.getHomepage(driver);
    }
    private WebDriver driver;
    private LoginPageObject loginPage;
    private DashboardPageObject homepage;
    private String loginPageUrl;
    private EmployeeListPageObject employeeListPage;
    @When("Open Employee List Page")
    public void openEmployeeListPage() {
        employeeListPage = homepage.openEmployeeListPage();
    }
}
