package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

public class _09_DataTableSteps {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();


    @And("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav() {

//        for (WebElement e:elementlerim)
//            dc.myClick(e);
    }
}
