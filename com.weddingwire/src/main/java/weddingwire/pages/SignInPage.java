package weddingwire.pages;

import com.peoplentech.team1automation.base.TestBase;
import com.peoplentech.team1automation.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SignInPage {


    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    private WebElement homePageSignInLink;

    @FindBy(xpath = "//input[@id='Mail']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='Password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    private WebElement signInButton;

    @FindBy(xpath = "e//span[contains(text(),'The email address or password is incorrect.')]")
    private WebElement incorrectCredentials;

    @FindBy(xpath = "//a[contains(text(),'Join now')]")
    private WebElement joinFromLoginPage;

    @FindBy(xpath = "//body/div[1]/div[1]/a[1]/img[1]")
    private WebElement returnToHomePageFromHeaderImage;

    @FindBy(xpath = "//a[contains(text(),'Forgot your password?')]")
    private WebElement forgotPasswordButton;

    @FindBy(xpath = "//a[contains(text(),'Vendor login')]")
    private WebElement vendorLoginButton;

    @FindBy(xpath = "//body/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")
    private WebElement loginWithFacebook;

    @FindBy(xpath = "//html[@id='facebook']")
    private WebElement facebookElement;

    @FindBy(xpath = "//button[@class='close icon icon-close-grey']")
    private WebElement closePopup;


    public void validateURLForSignIn() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/users-login.php";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated " + actualURL);
    }

    public void enterValidEmailInEmailField() {
        emailField.sendKeys("philippakramou@gmail.com");
        ExtentTestManager.log("Entered a valid email in the email field");
    }

    public void enterValidPasswordInPasswordField() {
        passwordField.sendKeys("abc123");
        ExtentTestManager.log("Entered a valid password in the password field");
    }

    public void clickSignInButton() {
        signInButton.click();
        ExtentTestManager.log("Clicked on Login button");
    }

    public void handlePopup() {
        closePopup.click();
        ExtentTestManager.log("Clicked closed popup");
    }

    public void validateSignInHomePage() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/tools/Main";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated " + actualURL);
    }

    public void enterInvalidEmailInEmailField() {
        emailField.sendKeys("abc123@gmail.com");
        ExtentTestManager.log("Entered an invalid email in the email field");
    }

    public void enterInvalidPasswordInPasswordField() {
        passwordField.sendKeys("abc1234");
        ExtentTestManager.log("Entered an invalid password in the password field");
    }

    public void validateFailedLogin() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/users-login.php";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated " + actualURL);
    }

    public void clickJoinFromLoginPage() {
        joinFromLoginPage.click();
        ExtentTestManager.log("Join link has been clicked");
    }

    public void validateJoinFromLogin() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/users-signup.php";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated " + actualURL);
    }

    public void clickBackToHomePageFromLoginPage() {
        returnToHomePageFromHeaderImage.click();
        ExtentTestManager.log("Browser navigates back to home from header page");
    }

    public void validateReturnFromLoginHeader() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated " + actualURL);
    }

    public void clickForgotPasswordLink() {
        forgotPasswordButton.click();
        ExtentTestManager.log("Forgot Password link is clicked");
    }

    public void validateForgottenPasswordButton() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/users-recover-password.php";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated " + actualURL);
    }

    public void clickVendorLogin() {
        vendorLoginButton.click();
        ExtentTestManager.log("Vendor Login button is clicked");
    }

    public void validateVendorLoginButton() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/vendors/home";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated " + actualURL);
    }

    public void userCanClickLoginByFacebook() {
        loginWithFacebook.click();
        ExtentTestManager.log("Facebook Login button is clicked");
    }

    public void validateFacebookLoginLink() {
//        String actualURL= TestBase.driver.getCurrentUrl();
//        String expectedURL = "https://www.facebook.com/v7.0/dialog/oauth?app_id=258399401573410&cbt=1606630289214&channel_url=https%3A%2F%2Fstaticxx.facebook.com%2Fx%2Fconnect%2Fxd_arbiter%2F%3Fversion%3D46%23cb%3Df2db8d592716898%26domain%3Dwww.weddingwire.com%26origin%3Dhttps%253A%252F%252Fwww.weddingwire.com%252Ff36ff8ce02215cc%26relation%3Dopener&client_id=258399401573410&display=popup&domain=www.weddingwire.com&e2e=%7B%7D&fallback_redirect_uri=https%3A%2F%2Fwww.weddingwire.com%2Fusers-login.php&locale=en_US&logger_id=f2b309861cfe8d&origin=1&redirect_uri=https%3A%2F%2Fstaticxx.facebook.com%2Fx%2Fconnect%2Fxd_arbiter%2F%3Fversion%3D46%23cb%3Df272d5a81a0b62%26domain%3Dwww.weddingwire.com%26origin%3Dhttps%253A%252F%252Fwww.weddingwire.com%252Ff36ff8ce02215cc%26relation%3Dopener%26frame%3Dfccd8a0531b0b&response_type=token%2Csigned_request%2Cgraph_domain&scope=user_location%2C%20email&sdk=joey&version=v7.0";
//
//        Assert.assertTrue(actualURL.contains(expectedURL));
//        ExtentTestManager.log("URL has been validated "+ actualURL);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(facebookElement.isDisplayed());
//        softAssert.assertTrue(passwordField.isDisplayed());
//        ExtentTestManager.log("Validated password field is displayed");
        softAssert.assertAll();
        ExtentTestManager.log("Facebook login pop-up displays");
    }
    // goal is to repeat with Google and Apple and also handle the pop ups
}
