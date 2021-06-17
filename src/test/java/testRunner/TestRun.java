package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                //features= {".//features"},
                features= {".//features/Login.feature", ".//features/AccountRegistration.feature"},
               //features= {".//features/LoginDDT.feature"},
               // features= {".//features/AccountRegistration.feature"},
               //features="@target/rerun.txt",
                glue="stepDefinitions",
                dryRun = false,
                //tags="@sanity"
                //tags="@sanity and @regression"
                //tags="@sanity or @regression",
                //tags="@sanity and not @regression"
                 plugin ={"pretty",
                         "html:reports/myreport.html",
                         "rerun:target/rerun.txt",

                         }

        )


public class TestRun {
}
