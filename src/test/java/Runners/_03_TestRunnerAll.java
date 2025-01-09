package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles"},//klasördeki bütün featurelar
        glue={"StepDefinitions","Utilities"}
        ,plugin= {"json:target/cucumber/cucumber.json"} // Jenkins için JSON report
)
public class _03_TestRunnerAll extends AbstractTestNGCucumberTests {
}