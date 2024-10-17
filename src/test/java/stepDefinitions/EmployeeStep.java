package stepDefinitions;

import cucumberOptions.Hooks;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.pageObjects.DashboardPageObject;
import pages.pageObjects.LoginPageObject;
import pages.pageObjects.PageGenerator;

public class EmployeeStep {
    public EmployeeStep(){
        this.driver = Hooks.openAndQuitBrowser();
        loginPage = PageGenerator.getLoginPage(driver);
    }
    private WebDriver driver;
    private LoginPageObject loginPage;
    private DashboardPageObject homepage;
    private String loginPageUrl;
    @Given("User login to OrangeHRM page")
    public void getUrlLoginPageOrangehrm() {
        loginPageUrl = loginPage.getLoginpageUrl();
    }
}
