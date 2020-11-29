package com.macystest;

import com.macys.data.DataProviders;
import com.macys.pages.HomePage;
import com.peoplentech.team1automation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {

    @Test(enabled = false)
    public void validateUserCanTypeOnSearchBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSearch();
    }

    @Test(enabled = false)
    public void validateAfterTypingUserCanClickSearchButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSearch();
        homePage.searchThenClick();
        sleepFor(5);
    }

    @Test(enabled = false)
    public void viladateUserCanFilterSepcificChoiceForTable() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.filterAChoiceForTable();
    }

    @Test(enabled = false)
    public void viladateUserCanPickATable() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.setPickATable();
    }

    @Test(enabled = false)
    public void viladateUserCanGoToFeaturedItemsOption() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.setGoToFeacturedItemOption();
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "searchData", enabled = false)
    public void validateUserBeingAbleToTypeAndSearchThreeDifferentItems(String data) {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar(data);
        homePage.searchThenClick();
    }

    @Test(enabled = false)
    public void validateClickOnDeals() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickList();
        sleepFor(2);
    }

    @Test(enabled = false)
    public void validateUserHoverOnGifts() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOvevGiftCard();

    }

    @Test(enabled = false)
    public void validateTablePageScrollDownAndUp() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollDownAndUp();
    }

    @Test(enabled = false)
    public void validateScrollToElementAndClick() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToElementAndClick();
    }

    @Test(enabled = false)
    public void validateClickOnBagIcon() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.setClickOnBag();
        sleepFor(2);
    }

    @Test(enabled = false)
    public void validateScrollAllTheWayDownAndUp() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollAllTheWayDownAndUP();
    }

    @Test(enabled = false)
    public void validatefeatureUrlActualMatchesExpected() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.actualTextAndExpectedTextMatchesOfURL();
    }

    @Test(enabled = false)
    public void validateUserCanScrollTopUsingMacysIcon() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.setScrollTopUsingMacysIcon();
    }

}
