package com.macystest;

import com.macys.pages.HomePage;
import com.macys.pages.LoginPage;
import com.peoplentech.team1automation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {

    @Test (enabled = false)
    public void validateUserBeingAbleToTypeOnSearchBar() {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar("Men Shoes");
    }

    @Test
    public void validateSearchAndClick(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnSearch();
        homePage.searchThenClick();
    }

    @Test (enabled = false)
    public void validateClickOnDeals(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.clickList();
    }
    @Test (enabled = false)
    public void validateClickOnSignIn() {
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.clickList();

    }
    @Test (enabled = false)
    public void validateLoopUpOrder() {
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.setLookUpMyOrder();

    }
}