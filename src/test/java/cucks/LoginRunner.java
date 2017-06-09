package cucks;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/FeaturesFiles/Login.Features",
        glue = {"StepDef"}, format = {
        "json:cucumber-html-reports/cucumber.json",
        "html:cucumber-html-reports/Assignment_With_CC_Task"})
public class LoginRunner {
}


