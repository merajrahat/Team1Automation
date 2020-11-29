package com.test;

import com.peoplentech.team1automation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import weddingwire.pages.HomePage;
import weddingwire.pages.SignUpPage;

public class SignUpPageTest extends TestBase {


    @Test(enabled = false)
    public void validateUserCanJoinSiteWithValidCredentials() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);

        homePage.validateURLForHomePage();
        signUpPage.userCanClickOnJoinButton();
        signUpPage.validateURLForJoin();
        signUpPage.userEntersValidName();
        signUpPage.userEntersValidEmail();
        signUpPage.userEntersValidPassword();
        signUpPage.userEntersVenueLocation();
        signUpPage.userClicksFromVenueDropdown(); // this is where it is failing again - fix it
        signUpPage.userClicksIntoCalendar();
        signUpPage.userSelectsCalendarYear();
        signUpPage.userSelectsCalendarMonth();
        signUpPage.userSelectsCalendarDay();
        signUpPage.userClicksSignUpButton();
        signUpPage.validateSignUp();
    }

    // continue to confirm that a user cannot sign up with invalid credentials in another test
}
