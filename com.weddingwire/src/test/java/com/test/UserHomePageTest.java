package com.test;

import com.peoplentech.team1automation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import weddingwire.pages.HomePage;
import weddingwire.pages.SignInPage;
import weddingwire.pages.UserHomePage;

public class UserHomePageTest extends TestBase {

    //1
    @Test(enabled = false)
    public void validateUserHomePageDisplays() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        UserHomePage userHomePage = PageFactory.initElements(driver, UserHomePage.class);
        homePage.clickSignInButton();
        signInPage.enterValidEmailInEmailField();
        signInPage.enterValidPasswordInPasswordField();
        signInPage.clickSignInButton();
        signInPage.handlePopup();
        userHomePage.validateUserHomePage();
    }

    //2
    @Test(enabled = false)
    public void validateUserCanClickOnChecklistOnUserHomePage() {
        validateUserHomePageDisplays();
        UserHomePage userHomePage = PageFactory.initElements(driver, UserHomePage.class);
        userHomePage.clickOnChecklistOnUserHomePage();
        userHomePage.validateClickOnChecklistOnUserHomePage();
    }

    //3
    @Test(enabled = false)
    public void validateUserCanHoverAndClickLinkFromDropDown() {
        validateUserHomePageDisplays();
        UserHomePage userHomePage = PageFactory.initElements(driver, UserHomePage.class);
        userHomePage.userHoverOverPlanningTools();
        userHomePage.clickOnHashTagGenerator();
        userHomePage.validateHoverAndClickOnHashagGenerator();
    }

    //4
    @Test(enabled = false)
    public void validateUserCanAddPhotographerFromUserHomePage() {
        validateUserHomePageDisplays();
        UserHomePage userHomePage = PageFactory.initElements(driver, UserHomePage.class);
        userHomePage.accessPhotographerSearchPage();
        userHomePage.validatePhotographerSearchPage();
    }

    //5
//    @Test(enabled = true)
//    public void validateUserCanAddPhotographer() {
//        validateUserHomePageDisplays();
//        UserHomePage userHomePage = PageFactory.initElements(driver, UserHomePage.class);
//        userHomePage.addPhotographerFromVendorManagerPage();
//        userHomePage.validatePhotographerAdded();
//    }
}
