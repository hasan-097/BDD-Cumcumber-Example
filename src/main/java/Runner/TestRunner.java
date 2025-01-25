package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\SHARUKH\\eclipse-workspace\\CogmentoCRM-BDD-Cucumber\\src\\main\\java\\Features\\Login.feature",
		glue= {"StepDefinitions"},
		plugin= {"pretty","html:target/cucumber-reports.html"},
		monochrome=true,
		stepNotifications=true
		)


public class TestRunner {
	
}