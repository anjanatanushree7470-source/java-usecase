package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="cucumber/src/test/resources/feature/login.feature" ,
glue="cucumberTest",
plugin={"pretty", "html:target/cucumber-report.html"},
monochrome=true
)
public class RunCucumberTest {

	
}
