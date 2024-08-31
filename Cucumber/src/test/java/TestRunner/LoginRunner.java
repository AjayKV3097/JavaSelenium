package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/java/features/login.feature"},
		//dryRun=true,
		snippets = SnippetType.CAMELCASE,
		//glue = {"steps","hooks","addactInnApplication"},
		glue = {"hooks","addactInnApplication"},
		plugin =  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				
		//plugin = {"pretty","html:CucumberReports"}
//		tags  ={"@prod and @reg"}
		)

public class LoginRunner extends AbstractTestNGCucumberTests{

}