package com.amazontest;

import com.amazon.data.DataProviders;
import com.amazon.pages.HomePage;
import com.amazon.pages.SignInPage;
import com.peoplentech.team1automation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignInPageValidations extends TestBase {

    @Test(enabled = false)
    public void validateUserIsAbleToInputCredentialsAndSignIn(){
        HomePage homePage= PageFactory.initElements(driver,HomePage.class);
        SignInPage signInPage= PageFactory.initElements(driver,SignInPage.class);

        homePage.validateSignInButton();
        signInPage.validateURLForSignIn();
        signInPage.typeOnEmailFieldAndClickContinue();
        signInPage.typeOnPasswordFieldAndClickSignIn();
        signInPage.validateSignInFieldsUsingSoftAssert();
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "signInCredentials",enabled = false)
    public void validateMultipleUsersAreAbleToInputCredentialsAndSignIn(String username,String password){
        HomePage homePage= PageFactory.initElements(driver,HomePage.class);
        SignInPage signInPage= PageFactory.initElements(driver,SignInPage.class);

        homePage.validateSignInButton();
        signInPage.validateURLForSignIn();
        signInPage.typeOnUserIdField(username);
        signInPage.clickOnContinueButton();
        signInPage.inputPasswordValues(password);
        signInPage.clickOnSignInButton();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToClickOnSignInButtonThenClickOnCreateAccountButton(){
        HomePage homePage= PageFactory.initElements(driver,HomePage.class);
        SignInPage signInPage= PageFactory.initElements(driver,SignInPage.class);

        homePage.validateSignInButton();
        signInPage.validateURLForSignIn();
        signInPage.clickOnCreateAccountFromSignInPage();
        signInPage.validateCreateAccountURL();
    }
}
