package com.test;

import com.peoplentech.team1automation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import weddingwire.pages.DressesPage;
import weddingwire.pages.HomePage;

public class DressesPageTest extends TestBase {

    //1
    @Test(enabled = false)
    public void validateUserCanClickOnDesignerTile() {
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        DressesPage dressPage = PageFactory.initElements(driver, DressesPage.class);
        homePage.userCanClickOnDressesLinkFromHomePage();
        dressPage.viewDesignerCollectionFromGrid();
        dressPage.validateDesignerPage();
    }

    //2
    @Test(enabled = false)
    public void validateUserCanViewAllDesigners() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        DressesPage dressPage = PageFactory.initElements(driver, DressesPage.class);
        homePage.userCanClickOnDressesLinkFromHomePage();
        dressPage.clickAllDesigners();
        dressPage.validateAllDesignersPage();
    }

    //3
    @Test(enabled = false)
    public void validateUserCanViewFavorites() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        DressesPage dressPage = PageFactory.initElements(driver, DressesPage.class);
        homePage.userCanClickOnDressesLinkFromHomePage();
        dressPage.clickOnFavorites();
        dressPage.handleSignInPopup();
    }

    //4
    @Test(enabled = false)
    public void validateFindYourDressLink() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        DressesPage dressPage = PageFactory.initElements(driver, DressesPage.class);
        homePage.userCanClickOnDressesLinkFromHomePage();
        dressPage.userClicksFindYourDress();
        dressPage.validateFindYourDressTool();
    }

    //5
    @Test(enabled = false)
    public void validateUserCanClickTheNextButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        DressesPage dressPage = PageFactory.initElements(driver, DressesPage.class);
        homePage.userCanClickOnDressesLinkFromHomePage();
        dressPage.userClicksNextButton();
        dressPage.validateNextButton();
    }
}
