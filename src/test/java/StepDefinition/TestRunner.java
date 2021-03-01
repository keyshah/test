package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/GoogleSearch.feature", glue = { "StepDefinition" }, monochrome = true, plugin = {
		"pretty", "html:target/htmlreports/htmlreports.html" }
//, tags = "@smoketest"
//plugin = { "pretty", "json:target/jsonreports/cucumber.json"}

)
public class TestRunner {
}
