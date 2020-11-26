package com.macystest;


import com.macys.pages.HomePage;
import com.macys.pages.LoginPage;
import com.peoplentech.team1automation.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {

    @Test (enabled = false)
    public void validateUserCanTypeOnSearchBar(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSearch();
    }

    @Test (enabled = false)
    public void validateAfterTypingUserCanClickSearchButton(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSearch();
        homePage.searchThenClick();
        sleepFor(5);

    }

    @Test (enabled = false)//this test failed, try slickdeadls website
    public void validateActualTextAndExpectedTextMatchesOfAWord(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.actualTextAndExpectedTextMatchesOfAWord();
    }



  /* @Test (dataProviderClass = DataProviders.class,dataProvider = "searchData")
    public void validateUserBeingAbleToTypeAndSearchThreeDifferentItems(String data) {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar(data);
        homePage.searchThenClick();*//*
}*/

    @Test (enabled = false)
    public void validateClickOnDeals() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickList();
        sleepFor(2);
    }

    @Test (enabled = false)
    public void validateUserHoverOnGifts(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOvevGiftCard();

    }

    @Test (enabled = false)
    public void validateTablePageScrollDownAndUp(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollDownAndUp();
    }

    @Test (enabled = false)
    public void validateScrollToElementAndClick(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToElementAndClick();
    }

    @Test (enabled = false)
    public void validateClickOnBagIcon() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.setClickOnBag();
        sleepFor(2);
    }
    ////up to this point test done

    @Test (enabled = false) //this test failed, try slickdeadls website
    public void validateActualTextAndExpectedTextMatchesUsingURL(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.actualTextAndExpectedTextMatchesOfURL();

    }




}