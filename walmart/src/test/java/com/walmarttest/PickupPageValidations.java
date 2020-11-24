package com.walmarttest;

import com.peoplentech.team1automation.base.TestBase;
import com.walmart.pages.PickupPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PickupPageValidations extends TestBase {

    @Test
    public void validateUserBeingAbleToSearchForAnItem() {
        PickupPage pickupPage = PageFactory.initElements(driver, PickupPage.class);
        pickupPage.searchForAnItem();
    }

    @Test
    public void userBeingAbleToAddToCart() {
        PickupPage pickupPage = PageFactory.initElements(driver, PickupPage.class);
        pickupPage.greenPepper();
    }

    @Test
    public void userBeingAbleToClickOnPickUpBtn() {
        PickupPage pickupPage = PageFactory.initElements(driver, PickupPage.class);
        pickupPage.pickUp();
    }
}