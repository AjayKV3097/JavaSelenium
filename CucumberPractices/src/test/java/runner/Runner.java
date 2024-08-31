package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {
		"src/test/java/features/login.feature" }, glue = {"steps","hooks"}, dryRun = false, monochrome = true, plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")
public class Runner extends AbstractTestNGCucumberTests {

}
