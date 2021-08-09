package runners;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        plugin={"pretty",

                "html:target/cucumber-report2",

                "json:target/cucumber2.json"
        },

        tags = "@Regression",

        features = {"src/test/java/resources"},

        glue={"stepDefinition"},

        dryRun=false)

public class regressionTestRunner extends AbstractTestNGCucumberTests { }


