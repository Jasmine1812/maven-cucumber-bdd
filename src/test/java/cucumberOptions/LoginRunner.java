package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Feature",
        glue = {"stepDefinitions"},
        plugin = { "pretty","html:target/cucumber/cucumber-pretty","rerun:target/rerun/login.txt",
                "json:target/cucumber/login.json"})
public class LoginRunner extends AbstractTestNGCucumberTests {
}
