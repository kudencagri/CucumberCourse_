package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountrySteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Navigate to country")
    public void navigateToCountry() {
        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.countries);

    }

    @When("create country")
    public void createCountry() {                        // apache random kütüphane pom.xml e ekledik
        String ulkeAdi= RandomStringUtils.randomAlphabetic(8);//8 harf
        String ulkeCode=RandomStringUtils.randomAlphanumeric(4);//4 rakam

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,ulkeAdi);
        dc.mySendKeys(dc.codeInput,ulkeCode);
        dc.myClick(dc.saveButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        //success yazısını çıktımı kontrol et
        dc.verifyContainsText(dc.successMessage, "success");

    }

    @When("create country name as {string} code as {string}")
    public void createCountryNameAsCodeAs(String name, String code) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,name);
        dc.mySendKeys(dc.codeInput,code);
        dc.myClick(dc.saveButton);
    }
}
