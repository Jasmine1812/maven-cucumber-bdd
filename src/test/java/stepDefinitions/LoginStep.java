package stepDefinitions;

import cucumberOptions.Hooks;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import pages.commons.BaseTest;
import pages.pageObjects.DashboardPageObject;
import pages.pageObjects.LoginPageObject;
import pages.pageObjects.PageGenerator;
import utilities.DataFakerConfig;

public class LoginStep {
    public LoginStep(){
        this.driver = Hooks.openAndQuitBrowser();
        loginPage = PageGenerator.getLoginPage(driver);
    }
    private WebDriver driver;
    private LoginPageObject loginPage;
    private DashboardPageObject homepage;
    private String loginPageUrl;


    @Given("Get url login page orangehrm")
    public void getUrlLoginPageOrangehrm() {
        loginPageUrl = loginPage.getLoginpageUrl();
    }

    @When("User enter to User Name")
    public void userEnterToUserName(){
        loginPage.enterToUserNameTextBox("Admin");
    }



    @And("User enter to Password")
    public void userEnterToPassword() {
        loginPage.enterToPasswordTextBox("Admin@admin123");
    }

    @And("User click Login Button")
    public void userClickLoginButton() {
        homepage = loginPage.clickToLoginButton();
    }

    @And("User wait {int}s")
    public void userWaitS(int timeSecond) {
        try {
            Thread.sleep(timeSecond * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Given("User login to OrangeHRM page")
    public void userLoginToOrangeHRMPage() {
        loginPage.enterToUserNameTextBox("Admin");
        loginPage.enterToPasswordTextBox("Admin@admin123");
        homepage = loginPage.clickToLoginButton();
    }



}
