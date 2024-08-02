package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature"},// çalıştırılacak olan feature filesın pathını verilecek
        glue = {"StepDefinitions","Utilities"}//stepdefinitions ve Utilities ın klasörünü yazılıyor.
)
public class _01_TestRunner extends AbstractTestNGCucumberTests {              // pom.xml de testng ve cucumber klasörünün içinde class var onu entegre edeceksins

}
