package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        plugin={"pretty",
                "html:target/cucumber-report2",
                "json:target/cucumber.json"
        },

        tags = "@Regression",

        features = {"src/test/java/resources"},

        glue={"stepDefinition"},

        dryRun=false
)

public class smokeTestRunner extends AbstractTestNGCucumberTests {

}
