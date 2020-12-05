package com.test;

import com.peoplentech.team1automation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import weddingwire.pages.HomePage;
import weddingwire.pages.SignUpPage;

public class SignUpPageTest extends TestBase {

    //1
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
        sleepFor(3);
        signUpPage.userClicksFromVenueDropdown();
        sleepFor(3);
        signUpPage.userClicksIntoCalendar();
        signUpPage.userSelectsCalendarYear();
        signUpPage.userSelectsCalendarMonth();
        signUpPage.userSelectsCalendarDay();
        signUpPage.userClicksSignUpButton();
        signUpPage.validateSignUp();
    }

    //2
    @Test(enabled = false)
    public void validateUserCannotJoinSiteWithInvalidCredentials() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);

        homePage.validateURLForHomePage();
        signUpPage.userCanClickOnJoinButton();
        signUpPage.validateURLForJoin();
        signUpPage.userEntersValidName();
        signUpPage.userEntersInvalidEmail();
        signUpPage.userEntersValidPassword();
        signUpPage.userEntersVenueLocation();
        sleepFor(3);
        signUpPage.userClicksFromVenueDropdown();
        sleepFor(3);
        signUpPage.userClicksIntoCalendar();
        signUpPage.userSelectsCalendarYear();
        signUpPage.userSelectsCalendarMonth();
        signUpPage.userSelectsCalendarDay();
        signUpPage.userClicksSignUpButton();
        signUpPage.validateSignUpFailure();
    }

    // continue to confirm that a user cannot sign up with invalid credentials in another test
}
