package test_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"org.example.step_definition"},
        tags = ""
)

public class TestRunner extends AbstractTestNGCucumberTests {

}