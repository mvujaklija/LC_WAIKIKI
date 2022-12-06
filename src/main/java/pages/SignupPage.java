package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

    //Looking for web elements

    @FindBy( xpath = "//i [ @class = 'header-profile-icon' ]" )
    WebElement profileIcon;

    @FindBy( xpath = "//a [ @href = 'https://www.lcwaikiki.rs/sr-RS/RS/register' ]" )
    WebElement signUpButton;

    @FindBy ( xpath = "//input [ @id = 'RegisterFormView_RegisterEmail' ]" )
    WebElement inputEmail;

    @FindBy ( xpath = "//input [ @id = 'RegisterFormView_Password' ]" )
    WebElement inputPassword;

    @FindBy ( xpath = "//input [ @id = 'RegisterPhoneNumberTR' ]")
    WebElement inputPhoneNumber;

    @FindBy ( xpath = "//input [ @id = 'RegisterFormView_IsEmailChecked' ]" )
    WebElement emaiCheckBoxlInfo;

    @FindBy ( xpath =  "//input [ @id = 'RegisterFormView_IsSmsChecked' ]" )
    WebElement smsCheckBoxInfo;

    @FindBy ( xpath = "//input [ @id = 'member-privacy-approve' ]" )
    WebElement generalConditionsCheckBox;

    @FindBy ( xpath = "//span [ @cid = 'recaptcha-anchor' ]" )
    WebElement notABotCheckBox;

    @FindBy ( xpath ="//a [ @class = 'activationCode135 ym-disable-keys TLeaf-Mask valid' ]")
    WebElement confirmButton;

    @FindBy ( xpath = "//input [ @id = 'activationCode135 ym-disable-keys TLeaf-Mask valid' ]")
    WebElement verificationCode;

    @FindBy ( xpath = "//a [ @class = 'button bc-blue bw200 center go-shopping' ]")
    WebElement startShopping;


    //Invoking Chrome driver

    public ChromeDriver driver = null;


    //Constructor

    public SignupPage(ChromeDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

        //Methods

        /**
         * THIS Method give user options for signup and sign in on page of LC WAIKIKI
         */

        public void choseProfileIcon() {

            assert profileIcon.isDisplayed( ) : "Profile icon is not present. Expected to be there";

            Actions action = new Actions(driver);
            action.moveToElement(profileIcon).perform();

        }

        /**
         * THIS Method redirects user to signup page of LC WAIKIKI
         */

        public void choseSignUpButton( ) {

            signUpButton.click( );

        }

    /**
     * THIS Method input user email to signup page of LC WAIKIKI
     */

    public void inputEmail( ) {

        inputEmail.click( );

        inputEmail.sendKeys( Strings.EMAIL_FOR_SIGNUP );
    }

    /**
     * THIS Method input user password to signup page of LC WAIKIKI
     */

    public void inputPassword( ) {

        inputPassword.click( );

        inputPassword.sendKeys( Strings.PASSWORD_FOR_SIGNUP );
    }

    /**
     * THIS Method input user phone number to signup page of LC WAIKIKI
     */

    public void inputPhoneNumber( ) {

        inputPhoneNumber.sendKeys( Strings.PHONE_NUMBER_FOR_SIGNUP);

    }

    /**
     * THIS Method click on check box to receive email info from LC WAIKIKI
     */

    public void emaiCheckBoxlInfo( ) {

        Actions action = new Actions(driver);
        action.moveToElement(emaiCheckBoxlInfo).click();

    }

    /**
     * THIS Method click on check box to receive sms info from LC WAIKIKI
     */

    public void smsCheckBoxInfo( ) {

        Actions action = new Actions(driver);
        action.moveToElement(smsCheckBoxInfo).click();


    }

    /**
     * THIS Method click on check box to general conditions and terms from LC WAIKIKI
     */

    public void generalConditionsCheckBox( ) {

        Actions action = new Actions(driver);
        action.moveToElement(generalConditionsCheckBox).click();

    }

    /**
     * THIS click on check box to verify that it is human and not a bot for registering on LC WAIKIKI
     */

    public void notABotCheckBox( ) {

        Actions action = new Actions(driver);
        action.moveToElement(notABotCheckBox).click();

    }

    /**
     * THIS Method confirms entered data and register user on page of LC WAIKIKI
     */

    public void confirmButton( ) {


        confirmButton.click( );

    }

    /**
     * THIS Method input verification code that user get on provided phone number to LC WAIKIKI
     */

    public void verificationCode( ) {

        verificationCode.sendKeys( );

    }

    /**
     * THIS Method confirms entered data and register user on page of LC WAIKIKI
     */

    public void startShopping( ) {

        startShopping.click( );

    }

}
