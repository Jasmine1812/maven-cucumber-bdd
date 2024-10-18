package stepDefinitions;

import cucumberOptions.Hooks;
import org.openqa.selenium.WebDriver;
import pages.pageObjects.CommonPageObject;
import pages.pageObjects.PageGenerator;

public class CommonPageSteps {
    public CommonPageSteps(){
        this.driver = Hooks.openAndQuitBrowser();
        commonPage = PageGenerator.getCommonPage(driver);
    }
    private WebDriver driver;
    private CommonPageObject commonPage;

//    When User open Personal Details by edit icon

}
