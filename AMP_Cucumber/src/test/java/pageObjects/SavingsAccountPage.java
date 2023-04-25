package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SavingsAccountPage {

    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor je;

    public SavingsAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        je = (JavascriptExecutor) driver;
        wait= new WebDriverWait(driver,20);
    }
    @FindBy(xpath = "//a[@href='https://www.amp.com.au/banking/savings-accounts/amp-saver-account']")
    WebElement learnmore;

    public void clickOnLearmore() {
        wait.until(ExpectedConditions.elementToBeClickable(learnmore));
        je.executeScript("arguments[0].scrollIntoView(true);", learnmore);
        je.executeScript("arguments[0].click();", learnmore);
    }
}
