package Runners;
// aşağıdaki bütün testlerden @SmokeTest tag i olanları çalıştır

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        // aşağıdaki bütün testlerden @SmokeTest tag i olanları çalıştır
        features = {"src/test/java/FeatureFiles/_01_Login.feature",
                "src/test/java/FeatureFiles/_02_Country.feature",
                "src/test/java/FeatureFiles/_03_CountryMultipleScenarios.feature",
                "src/test/java/FeatureFiles/_04_CitizenShip.feature",


        },
        glue = {"StepDefinitions","Utilities"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}                      //************** busatır eklendi


)
public class _06_TestRunnerSmokeWithPlugin extends AbstractTestNGCucumberTests {
}
