package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "feature",
		glue = {"stepdefinition"},
//		dryRun = true,
		tags = "@pom",
//		tags = "@google and @uat",
//		tags = "@regression or @uat or @smoke",
//		tags = "@regression and not @uat",
		plugin = {"pretty", "junit:target/JunitReports/reports.xml",
							"json:target/JsonReports/reports.json",
							"html:target/HTMLReports/reports.html"}
)
public class TestRunner {

}
