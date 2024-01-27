package StepRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features="feature",
        glue={"StepDefiniation"},
        monochrome=true,
        plugin = { "pretty","html:target/cucumber-reports" }

)
public class TestRunner {

}
