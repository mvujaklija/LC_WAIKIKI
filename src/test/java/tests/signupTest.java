package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.SignupPage;
import pages.Strings;
import java.time.Duration;


/**
 * TEST FOR SIGNUP TO LC WAIKIKI
 * Steps
 * 1. Navigate to a main page
 * 2. On start page click profile icon in tob right corner (it is look like little person)
 * 3. Click on the option OTVORITE NALOG
 * 4. Click on enter email field
 * 5. Click on the enter password field
 * 6. Click on the icon to show hide password
 * 7. Click on the enter phone number field
 * 8. Click on checkbox to receive email notification about promotions
 * 9. Click on the checkbox to receive sms notification about promotions
 * 10. click on the checkbox for accepting general conditions
 * 11. Click on the checkbox to verify that it is human and not robot registering
 * 12. Click on the verification code field and enter verification code
 * 13. click on the button Otvorite nalog
 * <p>
 * Expected results
 * 8 User is successfully registered and can go to start shopping by click on button
 */

public class signupTest extends BaseTest {

    @Test

    public void signUpToLcWaikiki() {

        //Invoking Chrome driver

        ChromeDriver driver = openChromeDriver();

        try {

            driver.get(Strings.START_PAGE_URL);
            String currentURL = driver.getCurrentUrl();
            assert currentURL.equals(Strings.START_PAGE_URL) : "User is on the wrong page. " + "  Actual: " + currentURL;

            //Text

            text("Clicking on the profile icon and redirecting to signup page of the LC WAIKIKI");

            //Test of Otvorite nalog

            text( "Select profile icon");
            SignupPage signupPage  = new SignupPage( driver );
            signupPage.choseProfileIcon();

            //Test of entering data and registering on the page LC WAIKIKI

            text( "Click on the option OTVORITE NALOG");
            signupPage.choseSignUpButton();
            String currentURL1 = driver.getCurrentUrl();
            assert currentURL1.equals(Strings.REGISTER_PAGE_URL) : "User is on the wrong page. " + "  Actual: " + currentURL;

            text( "Input email that you use to register and login to LC WAIKIKI page");
            signupPage.inputEmail();

            text( "Input password that you use to register and login to LC WAIKIKI page");
            signupPage.inputPassword();

            text( "Input phone number where you will get verification code for validate registration on LC WAIKIKI page");
            signupPage.inputPhoneNumber();

            //Test of check boxes

            text( "Click on checkbox to receive promotions over email that you provided to LC WAIKIKI page");
            signupPage.emaiCheckBoxlInfo();

            text( "click on checkbox to receive promotion over sms to a number that you provided to LC WAIKIKI page");
           // signupPage.smsCheckBoxInfo();

            text( "Click on the checkbox to accept general terms and conditions of LC WAIKIKI page");
            signupPage.generalConditionsCheckBox();

            text( "Click on the checkbox to approve that you are not a robot and that is human registering on LC WAIKIKI page");
            sleep();
            signupPage.notABotCheckBox();

            text( "Click on the button Otvorite nalog");
            sleep();
            signupPage.confirmButton();

            //Waiting for verification code and WE NEED TO ENTER IT MANUALY BECAUSE IT IS COMING TO PHONE AND IT IS RANDOM

            text( "Entering verification code");
            WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(30))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//input [ @id = 'activationCode135 ym-disable-keys TLeaf-Mask valid' ]")));
            signupPage.confirmButton();

            text( "User is registered successfully and can go to shopping by clicking button Zapocnite kupovinu");
            signupPage.startShopping();


        } finally {

            driver.quit();

        }

    }













}
