package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _09_DataTableSteps {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();


    @And("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable linkler) {

        List<String> strlinkList=linkler.asList(String.class);

        for (String strLink:strlinkList)

            ln.myClick(ln.getWebElement(strLink));

        //2. yol
//        for (String strLink:strlinkList){
//            WebElement linkliWebelement= ln.getWebElement(strLink);
//            ln.myClick(linkliWebelement);
//        }
    }

    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable Link) {
        List<String> strLinkList=Link.asList(String.class);
        for (String strLink: strLinkList) {
            dc.myClick(dc.getWebElement(strLink));
        }
    }

    @And("User sending the keys in Dialog")
    public void userSendingTheKeysInDialog(DataTable dt) {
        List<List<String>> items=dt.asLists(String.class);
        for (int i = 0; i <items.size() ; i++) {
            WebElement e=dc.getWebElement(items.get(i).get(0)); // 0. web element
            String yazi=items.get(i).get(1);               // 1. string
            dc.mySendKeys(e,yazi);
        }

    }

    @And("user Delete item from Dialog Content")
    public void userDeleteItemFromDialogContent(DataTable Link) {
        List<String> silinecekler=Link.asList(String.class);

        for (int i = 0; i <silinecekler.size() ; i++) {
            dc.deleteItem(silinecekler.get(i));
        }
    }
}
