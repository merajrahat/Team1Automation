package com.amazontest;

import com.amazon.pages.BusinessAccountPage;
import com.amazon.pages.HomePage;
import com.peoplentech.team1automation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BusinessAccountPageValidation extends TestBase {
    @Test(enabled = false)
    public void validateUserIsAbleToNavigateToTheBusinessAccountPageAndClickOnCreateAccount() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        BusinessAccountPage businessAccountPage = PageFactory.initElements(driver, BusinessAccountPage.class);

        homePage.clickOnRegisteringBusinessAccountButton();
        homePage.validateAmazonBusinessURL();
        businessAccountPage.clickOnCreateAFreeAccount();
        businessAccountPage.validatedURLForBusinessRegistration();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToClickOnFindSolutionsAndSelectITProducts() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        BusinessAccountPage businessAccountPage = PageFactory.initElements(driver, BusinessAccountPage.class);

        homePage.clickOnRegisteringBusinessAccountButton();
        homePage.validateAmazonBusinessURL();

        businessAccountPage.clickOnFindSolutionsButton();
        businessAccountPage.clickOnITProductsButton();
        businessAccountPage.validateURLForITProducts();
    }

    @Test(enabled = true)
    public void validateUserIsAbleToClickOnCareers() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        BusinessAccountPage businessAccountPage = PageFactory.initElements(driver, BusinessAccountPage.class);

        homePage.clickOnRegisteringBusinessAccountButton();
        homePage.validateAmazonBusinessURL();

        businessAccountPage.scrollToCareersAndClick();
        businessAccountPage.validateURLForCareersPage();
    }

}
