package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AccountRegistrationPage {

    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor je;

    public AccountRegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        je = (JavascriptExecutor) driver;
        wait = new WebDriverWait(driver, 20);
    }

    @FindBy(xpath = "//button[normalize-space()='New application']")
    WebElement NewAPlication_btn;
    @FindBy(xpath = "//label[normalize-space()='New customer']")
    WebElement NewCustomer_btn;

    @FindBy(xpath = "//label[normalize-space()='Just me']")
    WebElement Justme_btn;

    @FindBy(xpath = "//button[normalize-space()='Proceed']")
    WebElement Proceed_btn;

    @FindBy(xpath = "//label[@id='dropdown-applicants-0-personalDetails-basicInfo-title']//span[@class='amp-dropdown-icon icon icon--chevron-down']")
    WebElement titledropdown;

    @FindBy(xpath = "//*[@id='applicants-0-personalDetails-basicInfo-block']/div/amp-grid[1]/amp-titles/div[2]/div/div/ul/li[2]")
    WebElement mr;
    @FindBy(xpath = "//*[@id='applicants-0-personalDetails-basicInfo-block']/div/amp-grid[1]/amp-titles/div[2]/div/div/ul/li[3]")
    WebElement mrs;
    @FindBy(xpath = "//*[@id='applicants-0-personalDetails-basicInfo-block']/div/amp-grid[1]/amp-titles/div[2]/div/div/ul/li[4]")
    WebElement miss;
    @FindBy(xpath = "//*[@id='applicants-0-personalDetails-basicInfo-block']/div/amp-grid[1]/amp-titles/div[2]/div/div/ul/li[5]")
    WebElement ms;
    @FindBy(xpath = "//*[@id='applicants-0-personalDetails-basicInfo-block']/div/amp-grid[1]/amp-titles/div[2]/div/div/ul/li[6]")
    WebElement dr;

    @FindBy(xpath = "//input[@id='applicants-0-personalDetails-basicInfo-firstName']")
    WebElement txtFirstName;
    @FindBy(xpath = "//input[@id='applicants-0-personalDetails-basicInfo-middleName']")
    WebElement txtMiddleName;
    @FindBy(xpath = "//input[@id='applicants-0-personalDetails-basicInfo-surName']")
    WebElement txtLastName;
    @FindBy(xpath = "//input[@id='dayapplicants-0-personalDetails-basicInfo-dateOfBirth']")
    WebElement txtDay;
    @FindBy(xpath = "//input[@id='monthapplicants-0-personalDetails-basicInfo-dateOfBirth']")
    WebElement txtMonth;
    @FindBy(xpath = "//input[@id='yearapplicants-0-personalDetails-basicInfo-dateOfBirth']")
    WebElement txtYear;
    //@FindBy(xpath = "//amp-form-block[@id='applicants-0-personalDetails-basicInfo-block']//button[@type='button'][normalize-space()='OK']")

    @FindBy(xpath = "//*[@id='applicants-0-personalDetails-basicInfo-block']/div/amp-grid[6]/amp-button/button")
    WebElement btn_Conformation_yourdata;
    @FindBy(xpath = "//input[@id='applicants-0-personalDetails-address-addresses-residentialAddress-TypeAhead-query']")
    WebElement address_txt;

    @FindBy(xpath = "//*[@id='TypeAhead']/div/div[2]/ul/li")
    WebElement dynamic_address;
    @FindBy(xpath = "//a[normalize-space()='here']")
    WebElement Click_Manual_adress;

    @FindBy(xpath = "//label[@id='dropdown-applicants-0-personalDetails-address-addresses-residentialAddress-ManualAddressExtended-country']")
    WebElement Country_dropdown;
    @FindBy(xpath = "//*[@id='ManualAddressExtended']/amp-grid[1]/amp-country/div[2]/div/div/ul/li")
    WebElement Dynmaic_xpath_country;

    @FindBy(xpath = "//input[@id='applicants-0-personalDetails-address-addresses-residentialAddress-ManualAddressExtended-buildingName']")
    WebElement Buildno;

    @FindBy(xpath = "//label[@for='applicants-0-personalDetails-address-addresses-postalAndResidentialAreSame']//i[@class='amp-checkbox__icon icon icon--tick']")
    WebElement CheckBok_PostalAddress;

    @FindBy(xpath = "//amp-form-block[@id='applicants-0-personalDetails-address-block']//button[@type='button'][normalize-space()='OK']")
    WebElement ClickOkForAddress;
    @FindBy(xpath = "//input[@id='applicants-0-personalDetails-contactDetails-emailAddress']")
    WebElement Email_txt;
    @FindBy(xpath = "//input[@id='applicants-0-personalDetails-contactDetails-mobilePhone']")
    WebElement MobileNO_txt;
    @FindBy(xpath = "//input[@id='applicants-0-personalDetails-contactDetails-homePhone']")
    WebElement HomePhone_Txt;
    @FindBy(xpath = "//amp-form-block[@id='applicants-0-personalDetails-contactDetails-block']//button[@type='button'][normalize-space()='OK']")
    WebElement Contact_Ok_btn;
    @FindBy(xpath = "//label[@for='applicants-0-furtherQuestions-taxFileNumber-hasTaxFileNumber-Yes']")
    WebElement tfn_yes_btn;
    @FindBy(xpath = "//label[@for='applicants-0-furtherQuestions-taxFileNumber-hasTaxFileNumber-No']")
    WebElement tfn_NO_btn;
    @FindBy(xpath = "//input[@id='applicants-0-furtherQuestions-taxFileNumber-taxFileNumber']")
    WebElement tfn_txt;
    @FindBy(xpath = "//amp-form-block[@id='applicants-0-furtherQuestions-taxFileNumber-block']//button[@type='button'][normalize-space()='OK']")
    WebElement tfn_ok_btn;
    @FindBy(xpath = "//label[@for='applicants-0-furtherQuestions-foreignTaxResident-isForeignTaxResident-No']")
    WebElement foreign_REsedence_no_btn;
    @FindBy(xpath = "//label[@for='applicants-0-furtherQuestions-foreignTaxResident-isForeignTaxResident-Yes']")
    WebElement foreign_REsedence_yes_btn;
    @FindBy(xpath = "//amp-form-block[@id='applicants-0-furtherQuestions-foreignTaxResident-block']//button[@type='button'][normalize-space()='OK']")
    WebElement resdence_conformation_ok;

    @FindBy(xpath = "//label[@id='dropdown-applicants-0-furtherQuestions-amlQuestions-primarySourceOfWealth']")
    WebElement Primary_income_source_drp;

    @FindBy(xpath = "//label[@id='dropdown-applicants-0-furtherQuestions-amlQuestions-sourceOfFundsForAccount']")
    WebElement SourcofFund_drp;

    @FindBy(xpath = "//label[@id='dropdown-applicants-0-furtherQuestions-amlQuestions-reasonForOpeningAccount']")
    WebElement NatureAndPurpose_drp;


    @FindBy(xpath = "//amp-form-block[@id='applicants-0-furtherQuestions-amlQuestions-block']//button[@type='button'][normalize-space()='OK']")
    WebElement extraDetailsConfirm_btn;

    @FindBy(xpath = "//label[@for='applicants-0-identityCheck-identity-creditHeaderCheckbox']//span[@class='amp-checkbox__box']")
    WebElement Authorise_identity_Checkbox;
    @FindBy(xpath = "//div[@class='ng-star-inserted']//button[@type='button'][normalize-space()='OK']")
    WebElement Confirm_identity_ok;
    @FindBy(xpath = "//button[@id='greenid-source-cancel']")
    WebElement Skip_Id;
    @FindBy(xpath = "//button[@class='btn btn-ok palm-1/1']")
    WebElement skip_ID_COnformation_ok;
    @FindBy(xpath = "//label[@for='accountDetails-declarations-lastStep-privacyDeclaration']//span[@class='amp-checkbox__box']")
    WebElement privacy_Declaration;
    @FindBy(xpath = "//label[@for='accountDetails-declarations-lastStep-acceptTandCsDeclaration']//span[@class='amp-checkbox__box']")
    WebElement Amp_disclosure;
    @FindBy(xpath = "//label[@for='accountDetails-declarations-lastStep-acceptCRSDeclaration']//span[@class='amp-checkbox__box']")
    WebElement Amp_Consent;
    @FindBy(xpath = "//button[@data-automation-id='btn-accountDetails-declarations-lastStep-OK']")
    WebElement declarations_ok;

    public void Click_on_New_Account() {

        je.executeScript("arguments[0].click();", NewAPlication_btn);
    }

    public void Click_on_New_Customer() {

        je.executeScript("arguments[0].click();", NewCustomer_btn);
    }

    public void Click_on_Justme() {

        je.executeScript("arguments[0].click();", Justme_btn);
    }

    public void Click_on_proceed() {

        je.executeScript("arguments[0].click();", Proceed_btn);
    }

    public void Click_on_tittle(String title) {

        je.executeScript("arguments[0].click();", titledropdown);
        switch (title) {
            case "MR":
                mr.click();
                break;
            case "Mrs":
                mrs.click();
                break;
            case "Miss":
                miss.click();
                break;
            case "DR":
                dr.click();
                break;
            case "Ms":
                ms.click();
                break;
            default:
                mr.click();
        }

    }

    public void setFirstName(String fname) {
        txtFirstName.clear();
        je.executeScript("arguments[0].value='" + fname + "';", txtFirstName);
        //txtFirstName.sendKeys(fname);
    }

    public void setLastName(String lname) {
        txtLastName.clear();
        je.executeScript("arguments[0].value='" + lname + "';", txtLastName);
    }

    public void setMiddleName(String mname) {
        txtMiddleName.clear();
        je.executeScript("arguments[0].value='" + mname + "';", txtMiddleName);
    }

    public void setDOB(String day, String month, String year) {

//        je.executeScript("arguments[0].value='" + day + "';", txtDay);
//        je.executeScript("arguments[0].value='" + month + "';", txtMonth);
//        je.executeScript("arguments[0].value='" + year + "';", txtYear);

        txtDay.sendKeys(day);
        txtMonth.sendKeys(month);
        txtYear.sendKeys(year);


    }

    public void ok4TellUsYourself() {

//        btn_Conformation_yourdata.click();
//        je.executeScript("arguments[0].click();", btn_Conformation_yourdata);

        txtFirstName.sendKeys(Keys.TAB);
        txtMiddleName.sendKeys(Keys.TAB);
        txtLastName.sendKeys(Keys.TAB);
        txtDay.sendKeys(Keys.TAB);
        txtMonth.sendKeys(Keys.TAB);
        txtYear.sendKeys(Keys.TAB);

        txtYear.sendKeys(Keys.ENTER);
    }


    public void setAddress_txt(String address, String full_address) {

        address_txt.sendKeys(address);
        List<WebElement> add = driver.findElements(By.xpath("//*[@id='TypeAhead']/div/div[2]/ul/li"));
        System.out.println(add.size());
        System.out.println("Full address is" + full_address);
        for (WebElement OptionAdd : add) {
            System.out.println(OptionAdd.getText());
            if (OptionAdd.getText().trim().equalsIgnoreCase(full_address.trim())) {
                je.executeScript("arguments[0].click();", OptionAdd);
                OptionAdd.click();
                break;
            }
        }
    }

    public void setContactDetails(String email, String mobilenumber, String homephone) {
        Email_txt.sendKeys(email);
        MobileNO_txt.sendKeys(mobilenumber);
        HomePhone_Txt.sendKeys(homephone);
        Contact_Ok_btn.click();
    }

    public void setTfnConformation(String cnfm, String tfn) {

        if (cnfm.equalsIgnoreCase("yes")) {
            tfn_yes_btn.click();
            if (!tfn.isEmpty()) {
                tfn_txt.sendKeys(tfn);
            }
        } else {
            tfn_NO_btn.click();
        }

        tfn_ok_btn.click();

    }

    public void setresedentalStatus(String a) {
        if (a.equalsIgnoreCase("yes")) {
            foreign_REsedence_yes_btn.click();
        } else {
            foreign_REsedence_no_btn.click();
        }
        resdence_conformation_ok.click();
    }

    public void setExtraDetails(String PrimaryIncomeSource, String FundsUSedtoOpenAccount, String BusinessRelation) {
        //Primary Source of Wealth drp
        Primary_income_source_drp.click();
        List<WebElement> add = driver.findElements(By.xpath("//*[@id='applicants-0-furtherQuestions-amlQuestions-block']/div/amp-grid[1]/amp-dropdown/div[2]/div/div/ul/li[3]"));
        System.out.println(add.size());
        for (WebElement OptionAdd : add) {
            if (OptionAdd.getText().trim().equalsIgnoreCase(PrimaryIncomeSource.trim())) {
                OptionAdd.click();
                break;
            }
        }

        // Source of fund drp

        SourcofFund_drp.click();
        List<WebElement> source = driver.findElements(By.xpath("//*[@id='applicants-0-furtherQuestions-amlQuestions-block']/div/amp-grid[2]/amp-dropdown/div[2]/div/div/ul/li[4]"));
        System.out.println(add.size());
        for (WebElement OptionAdd : source) {
            if (OptionAdd.getText().trim().equalsIgnoreCase(FundsUSedtoOpenAccount.trim())) {
                OptionAdd.click();
                break;
            }
        }

        // Business Relationship Drp

        NatureAndPurpose_drp.click();
        List<WebElement> relatioship = driver.findElements(By.xpath("//*[@id='applicants-0-furtherQuestions-amlQuestions-block']/div/amp-grid[3]/amp-dropdown/div[2]/div/div/ul/li"));
        System.out.println(add.size());
        for (WebElement OptionAdd : relatioship) {
            if (OptionAdd.getText().trim().equalsIgnoreCase(BusinessRelation.trim())) {
                OptionAdd.click();
                break;
            }
        }
        extraDetailsConfirm_btn.click();

    }

    public void setverifyIdentity() {

        if (Authorise_identity_Checkbox.isEnabled()) {
            Authorise_identity_Checkbox.click();
            Confirm_identity_ok.click();
        }
    }

    public void CheckPrivacyDisclosures() {
        privacy_Declaration.click();
        Amp_Consent.click();
        Amp_disclosure.click();
        declarations_ok.click();
    }
}






