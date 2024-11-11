package Others.StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "Others/StepDefinitions",
        monochrome = true,
        plugin = { "pretty", "html:target/Report/HTMLReports" }

)
public class CucumberTest {
}
