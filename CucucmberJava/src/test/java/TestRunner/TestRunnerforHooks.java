package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
//@CucumberOptions(features="src/test/resources/Features/loginwithHooks.feature", glue="StepDefinitionsforHooks",
//monochrome=true,
//plugin = {"pretty","junit:target/Reports/junit.xml",
//		"json:target/Reports/json.xml",
//		"html:target/Reports/index.html"},
//		tags="(@NegativeTestCases and @PositiveTestCases) or @SmokeTest"
//		)

@RunWith(Cucumber.class)
@CucumberOptions(
         features="src/test/resources/Features/loginwithHooks.feature",
         glue="StepDefinitionsforHooks",
         plugin={"pretty","html:target/jsonreport/cucumber-html-report.html", "json:target/jsonreport/cucumber.json",
 "pretty:target/jsonreport/cucumber-pretty.txt","usage:target/jsonreport/cucumber-usage.json", 
"junit:target/jsonreport/cucumber-results.xml"},
        dryRun = false,
        strict = true,
       // tags={"(@NegativeTestCases and @PositiveTestCases) or @SmokeTest"},
        monochrome = true
      //  snippets=SnippetType.CAMELCASE
)
public class TestRunnerforHooks {


}
