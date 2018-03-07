package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src\\test\\java\\featureFiles",
		glue ="stepDef",
		monochrome =true,
		dryRun =false,
		tags= {"@collection"},
		plugin = {"pretty","html:target/cucumber-report",
				"json:target/cucumber-report/c.json",
				"junit:target/cucumber-reports/Cucumber.xml",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report2.html"}
		)

public class Runner {

}
