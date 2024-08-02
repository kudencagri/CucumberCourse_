package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        // aşağıdaki bütün testlerden @SmokeTest tag i olanları çalıştır
        tags = "@SmokeTest or @Regression",              // smoke yada regregresion testi çalıştır...
        features = {"src/test/java/FeatureFiles"},
        glue={"StepDefinitions","Utilities"}


)
public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}