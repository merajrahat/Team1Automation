package com.test;

import com.peoplentech.team1automation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import weddingwire.pages.HomePage;

public class HomePageTest extends TestBase {


    //1
    @Test(enabled = false)
    public void validateHomePageLink() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.validateURLForHomePage();
    }

    //2
    @Test(enabled = false)
    public void validateSignInLinkOnHomePage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickSignInButton();
        sleepFor(3);
        homePage.validateSignInButton();
    }

    //3
    @Test(enabled = false)
    public void validateJoinNowLinkOnHomePage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.userClickJoinButton();
        homePage.validateJoinButton();
    }

    //4
    @Test(enabled = false)
    public void validateUserCanTypeAndSearchWithSearchBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.accessToSearchBar();
        homePage.validateAccessToSearchBar();
    }

    //5
    @Test(enabled = false)
    public void validateUserScrollAndAccessConciergeChat() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.initiateConciergeConversation();
        homePage.validateScrollToElementAndSelectBot();
    }

    //6
    @Test(enabled = false)
    public void validateUserCanClickOnShopPageFromHomePage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.userCanClickOnShopLinkFromHomePage();
        homePage.validateShopPage();
    }

    //7
    @Test(enabled = false)
    public void validateUserCanClickOnDressesPageFromHomePage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.userCanClickOnDressesLinkFromHomePage();
        homePage.validateDressesPage();
    }
}
