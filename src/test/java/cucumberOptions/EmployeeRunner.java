package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Feature/Employee.feature",
        glue = {"stepDefinitions"},
        plugin = { "pretty","html:target/cucumber/cucumber-pretty","rerun:target/rerun/EmployeeStep.txt",
                "json:target/cucumber/EmployeeStep.json"})
public class EmployeeRunner extends AbstractTestNGCucumberTests {
}
