package com.walmarttest;

import com.peoplentech.team1automation.base.TestBase;
import com.walmart.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {


    @Test

    public void validateUserBeingAbleToTypeOnSearchBar() {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToSearchForAnItem() {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSearchBtn();
    }
}
