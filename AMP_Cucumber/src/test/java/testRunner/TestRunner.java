package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (

                features= {".//Features/AccountRegistration.feature"},
                glue="stepDefinitions",
                dryRun=false,
                monochrome=true

        )

public class TestRunner {

}

