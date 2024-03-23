package runner_class;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\hp\\eclipse-workspace\\cucumbersample1\\feature\\login.feature", glue = "step_definition", dryRun = false, plugin = {
		"pretty", "html:Report/facebook" })

public class Login_class {
}
