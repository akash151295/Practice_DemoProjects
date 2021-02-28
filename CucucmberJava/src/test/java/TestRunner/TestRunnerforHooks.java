package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/loginwithHooks.feature", glue="StepDefinitionsforHooks",
monochrome=true,
plugin = {"pretty","junit:target/Reports/junit.xml",
		"json:target/Reports/jsonreport.json",
		"html:target/Reports/index.html"}
		//tags="@NegativeTestCases"
		)
     
public class TestRunnerforHooks {


}
