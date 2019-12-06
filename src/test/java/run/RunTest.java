package run;

import com.MyStepdefs;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/features/firstCucumber.feature",
        format={
                "pretty",
                "html:target/site/cucumber-pretty",
                "rerun:target/rerun.txt",
                "json:target/cucumber.json"
               },
        tags={"@Automation"},
        glue={"com.MyStepdefs"}
)
public class RunTest extends AbstractTestNGCucumberTests{
}
