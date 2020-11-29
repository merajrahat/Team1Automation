package com.test;

import com.peoplentech.team1automation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import weddingwire.pages.HomePage;
import weddingwire.pages.SignInPage;

public class SignInPageTest extends TestBase {


    @Test(enabled = false)
    public void validateUserIsAbleToLoginWithValidCredentials() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);

        homePage.validateSignInButton();
        signInPage.validateURLForSignIn();
        signInPage.enterValidEmailInEmailField();
        signInPage.enterValidPasswordInPasswordField();
        signInPage.clickSignInButton();
        signInPage.validateSignInHomePage();
    }

    @Test(enabled = false)
    public void validateUserIsNotAbleToLoginWithInvalidEmail() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);

        homePage.validateSignInButton();
        signInPage.validateURLForSignIn();
        signInPage.enterInvalidEmailInEmailField();
        signInPage.enterValidPasswordInPasswordField();
        signInPage.clickSignInButton();
        signInPage.validateFailedLogin();
    }

    @Test(enabled = false)
    public void validateUserIsNotAbleToLoginWithInvalidPassword() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);

        homePage.validateSignInButton();
        signInPage.validateURLForSignIn();
        signInPage.enterValidEmailInEmailField();
        signInPage.enterInvalidPasswordInPasswordField();
        signInPage.clickSignInButton();
        signInPage.validateFailedLogin();
    }

    @Test(enabled = false)
    public void validateUserCanClickJoinFromLoginPage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);

        homePage.validateSignInButton();
        signInPage.validateURLForSignIn();
        signInPage.clickJoinFromLoginPage();
        signInPage.validateJoinFromLogin();
    }

    @Test(enabled = false)
    public void validateUserCanClickBackToHomePageFromLoginPage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);

        homePage.validateSignInButton();
        signInPage.validateURLForSignIn();
        signInPage.clickBackToHomePageFromLoginPage();
        signInPage.validateReturnFromLoginHeader();
    }

    @Test(enabled = false)
    public void validateUserCanForgotPassWordButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);

        homePage.validateSignInButton();
        signInPage.validateURLForSignIn();
        signInPage.clickForgotPasswordLink();
        signInPage.validateForgottenPasswordButton();
    }

    @Test(enabled = false)
    public void validateVendorLoginButtonFromLoginPage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);

        homePage.validateSignInButton();
        signInPage.validateURLForSignIn();
        signInPage.clickVendorLogin();
        signInPage.validateVendorLoginButton();
    }

    @Test(enabled = false)
    public void validateUserCanLoginWithFacebookFromLoginPage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);

        homePage.validateSignInButton();
        signInPage.validateURLForSignIn();
        signInPage.userCanClickLoginByFacebook();
        signInPage.validateFacebookLoginLink();
    }
}
