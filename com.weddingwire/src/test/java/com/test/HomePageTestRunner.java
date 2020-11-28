package com.test;

import com.WeddingWire_HomePage;
import com.peoplentech.team1automation.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePageTestRunner extends TestBase {
    WeddingWire_HomePage weddingWire_homePage;

    // 1
    @Test(enabled = false)
    public void navigateToHomePageValidation() {
        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
        weddingWire_homePage.assertionNavigateToHomePageValidation();
    }

    // 2
    @Test(enabled = false)
    public void joinNowValidation() {
        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
        weddingWire_homePage.joinNowElement();
        weddingWire_homePage.assertionJinNowElement();
    }

    // 3 - assert
    @Test(enabled = false)
    public void enterInformationValidation() {
        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
        weddingWire_homePage.sendValidInformation();
//        weddingWire_homePage.assertionValidInformation();
    }

    // 4
    @Test(enabled = false)
    public void searchBarValidation() {
        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
        weddingWire_homePage.accessSearchBar();
        weddingWire_homePage.assertionAccessSearchBar();
    }

    // 5
    @Test(enabled = false) // passes but does not assert?
    public void venueFiltersValidation() {
        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
        weddingWire_homePage.accessVenueFilters();
        weddingWire_homePage.assertionAccessVenueFilters();
    }

    // 6
    @Test(enabled = false) // FAILS WHY
    public void resultsViewsValidation() {
        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
        weddingWire_homePage.resultsViewOptions();
        weddingWire_homePage.assertionResultsViewOptions();
    }

    // 7
    @Test(enabled = false) // PASSES BUT DOES NOT ASSERT
    public void LoginValidation() {
        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
        weddingWire_homePage.userLogin();
        weddingWire_homePage.assertionUserLogin();
    }

    // 8
    @Test(enabled = false)
    public void checklistValidation() {
        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
        weddingWire_homePage.checklistAccess();
        weddingWire_homePage.assertionChecklistAccess();
    }

    // 9
    @Test(enabled = false) // Sometimes passes sometimes fails always at the Planning Tools part
    public void dropdownClickValidation() {
        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
        weddingWire_homePage.dropdownClickTools();
        weddingWire_homePage.assertionDropdownClickTools();
    }

    // 10
    @Test(enabled = false) // PASSES BUT ASSERTION FAILS (OPENS INTO A NEW BROWSER)
    public void headerClickValidation() {
        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
        weddingWire_homePage.headerLinkClick();
        weddingWire_homePage.assertionHeaderLinkClick();
    }

    // 11
    @Test(enabled = false) // PASSES BUT ASSERTION FAILS (OPENS INTO A NEW BROWSER)
    public void navigateBackValidation() {
        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
        weddingWire_homePage.goBackClick();
        navigateBack();
        weddingWire_homePage.assertionGoBackClick();
    }

    // 12
    @Test(enabled = false)
    public void scrollElementValidation() {
        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1500)");
        weddingWire_homePage.scrollElementClick();
        weddingWire_homePage.assertionScrollElementClick();
    }

    // 13
    @Test(enabled = false)
    public void visibleTextValidation() {
        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
        weddingWire_homePage.findingVisibleText();
        weddingWire_homePage.assertionFindingVisibleText();
    }

    // 19
    @Test(enabled = false) // Assertion fails
    public void guestListClickValidation() {
        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
        weddingWire_homePage.clickGuestListElement();
        weddingWire_homePage.assertionClickGuestListElement();
    }

    // 20
    @Test(enabled = true)
    public void addGuestListClickValidation() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
        weddingWire_homePage.addGuestLinkElement();
        weddingWire_homePage.assertionAddGuestLinkElement();
    }

    // 21
    @Test(enabled = false) // h-t-assert-th?
    public void conciergeClickValidation() throws InterruptedException {
        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
        weddingWire_homePage.conciergeClockElement();
        weddingWire_homePage.assertionConciergeClockElement();
    }

    // 22
    @Test(enabled = false)
    public void buttonAndPopUpValidation() throws InterruptedException {
        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
        weddingWire_homePage.buttonAndPopupELement();
        weddingWire_homePage.assertionButtonAndPopupELement();
    }

    // 23
    @Test(enabled = false)
    public void photographerSelectionValidation() throws InterruptedException {
        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
        weddingWire_homePage.photographerSearchELement();
        weddingWire_homePage.assertionPhotographerSearchELement();
    }

    //24
    @Test(enabled = false)
    public void favoriteButtonValidation() throws InterruptedException {
        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
        weddingWire_homePage.favoriteButtonELement();
        weddingWire_homePage.assertionFavoriteButtonELement();
    }

//    // 25
//    @Test(enabled = false) // help handling that popup. doesn't work
//    public void removeFavoriteValidation() throws InterruptedException {
//        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
//        weddingWire_homePage.removeFavoritePhotographerClick();
//        String expectedResult = "Pippa | Weddingwire";
//        String actualResult = driver.getTitle();
//        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
//    }

    // 26
    @Test(enabled = false)
    public void profileAccessValidation() throws InterruptedException {
        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
        weddingWire_homePage.profileViewELement();
        weddingWire_homePage.assertionProfileViewELement();
    }

    // 27
    @Test(enabled = false)
    public void mailboxAccessValidation() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
        weddingWire_homePage.viewMailboxELement();
        weddingWire_homePage.assertionViewMailboxELement();
    }

    // 28
    @Test(enabled = false)
    public void settingsAccessValidation() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
        weddingWire_homePage.viewSettingsELement();
        weddingWire_homePage.assertionViewSettingsELement();
    }

    // 29
    @Test(enabled = true)
    public void changeNotificationSettingValidation() throws InterruptedException {
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
        weddingWire_homePage.viewNotificationELement();
        String expectedResult = "Weddings, Wedding - WeddingWire.com";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }

    // 30
    @Test(enabled = false)
    public void accessShopPageValidation() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        weddingWire_homePage = PageFactory.initElements(driver, WeddingWire_HomePage.class);
        weddingWire_homePage.clickShopLinkELement();
        weddingWire_homePage.assertionClickShopLinkELement();
    }

// add to cart, remove from cart, search for item, dropdown, check for hover options, etc
    // iframe on regular website
}
