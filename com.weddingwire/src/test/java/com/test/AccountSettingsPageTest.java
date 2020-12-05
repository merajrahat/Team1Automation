package com.test;

import com.peoplentech.team1automation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import weddingwire.pages.AccountSettingsPage;
import weddingwire.pages.HomePage;
import weddingwire.pages.SignInPage;

public class AccountSettingsPageTest extends TestBase {


    //1
    @Test(enabled = false)
    public void validateUserCanAccessAccountSettingsInUserHomePage() {
        AccountSettingsPage accountSettingsPage = PageFactory.initElements(driver, AccountSettingsPage.class);
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.clickSignInButton();
        signInPage.enterValidEmailInEmailField();
        signInPage.enterValidPasswordInPasswordField();
        signInPage.clickSignInButton();
        signInPage.handlePopup();
        accountSettingsPage.userCanAccessAccountSettings();
        accountSettingsPage.validateUserCanAccessAccountSettings();
    }

    // 2
    @Test(enabled = false)
    public void validateUserCanAccessUserInformationPageInAccountSettings() {
        validateUserCanAccessAccountSettingsInUserHomePage();
        AccountSettingsPage accountSettingsPage = PageFactory.initElements(driver, AccountSettingsPage.class);

        accountSettingsPage.userClicksUserInfo();
        accountSettingsPage.validateUserInformationPageDisplays();
    }

    //3
    @Test(enabled = false)
    public void validateUserCanAccessNotificationsPageInAccountSettings() {
        validateUserCanAccessAccountSettingsInUserHomePage();
        AccountSettingsPage accountSettingsPage = PageFactory.initElements(driver, AccountSettingsPage.class);

        accountSettingsPage.userClicksNotificationLink();
        accountSettingsPage.validateUserNotificationsPageDisplays();
    }

    //4
    @Test(enabled = false)
    public void validateUserUpdateNotificationSettings() {
        validateUserCanAccessAccountSettingsInUserHomePage();
        AccountSettingsPage accountSettingsPage = PageFactory.initElements(driver, AccountSettingsPage.class);

        accountSettingsPage.userClicksNotificationLink();
        accountSettingsPage.checkUpdatesBoxAndSaveChanges();
        accountSettingsPage.validateUserSavedChanges();
    }
}
