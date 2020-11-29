package com.amazontest;

import com.amazon.data.DataProviders;
import com.amazon.pages.HomePage;
import com.peoplentech.team1automation.base.TestBase;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {

    @Test(enabled = false)
    public void validateUserIsAbleToClickOnAmazonLogo() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.validateClickOnLogo();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToClickOnSignInButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.validateSignInButton();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToAccessNewBusinessRegistrationPage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnRegisteringBusinessAccountButton();
        homePage.validateAmazonBusinessURL();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToRefreshHomePage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.refreshHomePage();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToClickOnMenuAndSelectOption() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnNewReleasesFromMenu();
        homePage.validateNewReleasesURL();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToHoverOverTryPrimeLogoAndClickTryPrime() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnTryPrime();
        homePage.validateURLForPrime();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToHoverOverAccountsAndListsAndClickOrders() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverAccountsAndList();
        homePage.clickOnOrders();
        homePage.validateURLForSignIn();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToClickOnCreateNewAccount() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverAccountsAndList();
        homePage.clickOnNewCustomerStartHere();
        homePage.validateCreateAccountURL();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToTypeOnSearchBarAndClickSearchButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBarAndClickOnSearchButton();
        homePage.validateURLForSearchButton();
    }

    @Test(enabled = false)
    public void validateUserInAbleToSelectDeptFromDropdownBoxAndSearchForItem() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnAllDeptAndSelectDept();
        homePage.typeOnSearchBarAndClickOnSearchButton();
        homePage.validateURLForSearchButton();
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "searchData", enabled = false)
    public void validateUserBeingAbleToSearchForMultipleItems(String data) {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeMultipleDataOnSearchBar(data);
        homePage.clickOnSearchButton();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToScrollDownToElementAndScrollBackUp() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToElement();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToScrollDownToElementAndClickOnALink() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollDownAndClickOnLink();
        homePage.validateAboutAmazonURL();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToNavigateToCanadianWebsite() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.navigateToCanadianAmazonWebsite();
        homePage.validateCanadianAmazonURL();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToSelectItemsFromMenuBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnMenuButton();
        homePage.clickOnMoviesMusicGamesButton();
        homePage.clickOnVideoGamesButton();
        homePage.validateVideoGamesPage();
    }
}
