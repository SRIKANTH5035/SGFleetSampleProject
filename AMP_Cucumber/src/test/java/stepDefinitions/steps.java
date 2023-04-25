package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.*;

import java.time.Duration;


public class steps {

    WebDriver driver;

    HomePage hp;
    BankingPage bp;
    SavingsAccountPage sap;

    AMPSaverAccountPage ampSaverAccountPage;

    AccountRegistrationPage regpage;



    @Given("User Launch browser")
    public void user_launch_browser() throws InterruptedException {
        //  WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\E_Drive\\AMP_Cucumber\\src\\main\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    @Given("opens URL {string}")
    public void opens_url(String url){
        driver.get(url);
        driver.manage().window().maximize();
    }

    @When("User navigate to Banking tab")
    public void user_navigate_to_Banking_tab() {
        hp = new HomePage(driver);
        hp.clickBanking();
    }

    @When("click on savings")
    public void click_on_savings() {
        bp = new BankingPage(driver);
        bp.clickSavings();


    }

    @When("Click on Learnmore AMP Saver account")
    public void Click_on_Learnmore_AMP_Saver_account() throws InterruptedException {
        //Savings Page
        sap = new SavingsAccountPage(driver);
        Thread.sleep(5000);
        sap.clickOnLearmore();
        //AmpSaver_accountPage
        ampSaverAccountPage = new AMPSaverAccountPage(driver);
        ampSaverAccountPage.clickOnOpenAccount();
    }


    @Then("User Provides information to create account")
    public void User_Provides_information_to_create_account() {
        // Account Regestration
        regpage = new AccountRegistrationPage(driver);
        regpage.Click_on_New_Account();
        regpage.Click_on_New_Customer();
        regpage.Click_on_Justme();
        regpage.Click_on_proceed();
        regpage.Click_on_tittle("Mr");
        regpage.setFirstName("Sam");
        regpage.setMiddleName("John");
        regpage.setLastName("Nick");
        regpage.setDOB("15", "10", "1991");
        regpage.ok4TellUsYourself();
        regpage.setAddress_txt("7-9 Short st, went", "Unit 1  7-9 Short Street, WENTWORTHVILLE  NSW  2145");
        regpage.setContactDetails("abc.gmail.com", "0423232388", "");
        regpage.setTfnConformation("yes", "");
        regpage.setresedentalStatus("No");
        regpage.setExtraDetails("Income from employment (regular and/or bonus)",
                "Income from employment (regular and/or bonus)",
                "Everyday banking (e.g. regular deposits and withdrawals for everyday expenses)");
        regpage.setverifyIdentity();
        regpage.CheckPrivacyDisclosures();

    }


}
