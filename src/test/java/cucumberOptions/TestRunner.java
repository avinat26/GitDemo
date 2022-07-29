package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefinitions",
		stepNotifications=true,
		plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cukes.xml"},
		monochrome=true
		//dryRun = true
		//tags="@mobiletest"
		//tags="@smoketest"
		//tags="@smoketest or @regtest"
		//tags="not @smoketest"
		//tags="@smoketest and @regtest"
		)
public class TestRunner {
	
	

}
