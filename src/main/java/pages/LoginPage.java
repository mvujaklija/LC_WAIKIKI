package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    //Looking for web elements

    @FindBy( xpath = "//i [ @class = 'header-profile-icon' ]" )
    WebElement profileIcon;

    @FindBy( xpath = "//*[@class='dropdown-menu'] //a[@class='dd-button blue'][normalize-space()='Prijava']" )
    WebElement signInButton;

    @FindBy( xpath = "//input[@id='LoginEmail']" )
    WebElement inputEmail;

    @FindBy( xpath = "//input[@id='Password']" )
    WebElement inputPassword;

    @FindBy( xpath = "//a[@id='loginLink'][@class='button bc-blue login-button-link']" )
    WebElement signIn;

    //Invoking Chrome driver

    public ChromeDriver driver = null;


    //Constructor

    public LoginPage(ChromeDriver driver) {

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

    public void choseSignIpButton( ) {

        signInButton.click( );

    }

    /**
     * THIS Method input user email to signup page of LC WAIKIKI
     */

    public void inputEmail( ) {

        inputEmail.click( );

        inputEmail.sendKeys( Strings.EMAIL_FOR_SIGNIN_ANA );

    }

    /**
     * THIS Method input user password to signup page of LC WAIKIKI
     */

    public void inputPassword( ) {

        inputPassword.click( );

        inputPassword.sendKeys( Strings.PASSWORD_FOR_SIGNIN_ANA );

    }

    public void signIn( ) {

        signIn.click();

    }


}
