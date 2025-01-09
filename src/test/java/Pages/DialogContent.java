package Pages;

import Utilities.GWD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }



    @FindBy(xpath = "//*[@formcontrolname='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@formcontrolname='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@class='mdc-button__label']")
    public WebElement loginButton;
    @FindBy(xpath = "//*[@class='nav-link-title ng-tns-c1153576442-6 ng-star-inserted']")
    public WebElement txtTechnoStudyDashboard;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    public WebElement codeInput;
    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']//button")
    public WebElement saveButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortname;
    @FindBy(xpath="//div[contains(text(),'already exists')]")
    public WebElement alreadyExist;
    @FindBy(xpath ="//ms-text-field[contains(@placeholder,'NAME')]/input[@placeholder='Name']")
    public WebElement searchInput;
    @FindBy(xpath = "//ms-search-button")
    public WebElement searchButton;
    @FindBy(xpath = "//ms-delete-button[@class='ng-star-inserted']/button[1]")
    public WebElement deleteImgBttn;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBttn;
    @FindBy(xpath="//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement integrationCode;
    @FindBy(xpath="//ms-integer-field[@formcontrolname='priority']/input")
    private WebElement priorityCode;
    @FindBy(xpath="//*[text()='Active'][@class]")
    private WebElement toggleBar;
    @FindBy(xpath="//mat-select//span[text()='Academic Period']")
    private WebElement academicPeriod;
    @FindBy(xpath="//mat-option/span")
    private WebElement academicPeriod1;
    @FindBy(xpath="(//span[text()='Grade Level'])[1]")
    private WebElement gradeLevel;
    @FindBy(xpath = "(//*[@role='option'])[4]")
    private WebElement gradeLevel2;
    @FindBy(xpath="//mat-select//span[text()='Test 2024']")
    private WebElement searchAcademicPeriod;
    @FindBy(xpath = "//tbody[@role='rowgroup']//tr//td[2]")
    public List<WebElement> nameList;





    public void deleteItem(String searchText){
        mySendKeys(searchInput,searchText);
        myClick(searchButton);
        // 1. yol %90 çözüm
        //        wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        // 2. yol %100 çözüm
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//*[contains(@class,'loading-shade')]/*"),0));
        myClick(deleteImgBttn);
        myClick(deleteDialogBttn);}

    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "addButton"              :return this.addButton;
            case "saveButton"             :return this.saveButton;
            case "nameInput"              :return this.nameInput;
            case "codeInput"              :return this.codeInput;
            case "shortname"              :return this.shortname;
            case "integrationCode"        :return this.integrationCode;
            case "priorityCode"           :return this.priorityCode;
            case "toggleBar"              :return this.toggleBar;
            case "academicPeriod"         : return this.academicPeriod;
            case "academicPeriod1"        : return this.academicPeriod1;
            case "gradeLevel"             : return this.gradeLevel;
            case "gradeLevel2"            : return this.gradeLevel2;
            case "searchAcademicPeriod"   : return this.searchAcademicPeriod;



        }
        return null;

    }




}
