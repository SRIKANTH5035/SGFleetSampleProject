package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AMPSaverAccountPage {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor je;

    public AMPSaverAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        je = (JavascriptExecutor) driver;
        wait = new WebDriverWait(driver, 20);
    }

    @FindBy(xpath = "//a[@class='btn pagebanner__btn']")
    WebElement openAccount;

    public void clickOnOpenAccount() {
        wait.until(ExpectedConditions.elementToBeClickable(openAccount));
        je.executeScript("arguments[0].click();", openAccount);
    }


}
