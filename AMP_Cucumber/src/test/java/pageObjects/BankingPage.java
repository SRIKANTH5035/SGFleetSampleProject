package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankingPage {

    WebDriver driver;
    JavascriptExecutor je;

    public BankingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        je = (JavascriptExecutor) driver;
    }


    @FindBy(xpath = "//*[@id='products']/div[2]/div[1]/div/div/div/ul/li[1]/a[@class='icon-arrow-right']")
    WebElement SavingsAccount;

    public void clickSavings() {
        je.executeScript("arguments[0].scrollIntoView(true);", SavingsAccount);
        je.executeScript("arguments[0].click();", SavingsAccount);

    }


}





