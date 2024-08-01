package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy(xpath = "//span[text()='Setup'][1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    public WebElement countries;

    @FindBy(xpath = "(//span[text()='Citizenships'])[1]")
    public WebElement citizenship;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;
    @FindBy(xpath = "//*[text()='Fees']")
    private WebElement fees;
    @FindBy(xpath="(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsOne;

    @FindBy(xpath="(//span[text()='Setup'])[2]")
    private WebElement setupTwo;

    @FindBy(xpath="(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamsTwo;

    @FindBy(xpath="(//span[text()='States'])[1]")
    private WebElement states;

    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "setup"               :return this.setup;
            case "parameters"          :return this.parameters;
            case "countries"           :return this.countries;
            case "citizenship"         :return this.citizenship;
            case "nationalities"       :return this.nationalities;
            case "fees"                :return this.fees;
            case "entranceExamsOne"    : return this.entranceExamsOne;
            case "setupTwo"            : return this.setupTwo;
            case "entranceExamsTwo"    : return this.entranceExamsTwo;
            case "states"              : return this.states;
        }
        return null;
    }



}
