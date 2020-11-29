package com.walmarttest;

import com.peoplentech.team1automation.base.TestBase;
import com.walmart.pages.PickupPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PickupPageValidations extends TestBase {

    @Test(enabled = false)
    public void validateUserBeingAbleToGoToPickupPage() {
        PickupPage pickupPage = PageFactory.initElements(driver, PickupPage.class);
        pickupPage.userBeingAbleToGoToPickupPage();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToViewDepartments() {
        PickupPage pickupPage = PageFactory.initElements(driver, PickupPage.class);
        pickupPage.userBeingAbleToChooseDepartment();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToChooseDepartment() {
        PickupPage pickupPage = PageFactory.initElements(driver, PickupPage.class);
        pickupPage.userBeingAbleToChooseDepartment();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToAddEarbudsToCart() {
        PickupPage pickupPage = PageFactory.initElements(driver, PickupPage.class);
        pickupPage.userBeingAbleToAddEarbudsToCart();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToCheckOutThreeEarBuds() {
        PickupPage pickupPage = PageFactory.initElements(driver, PickupPage.class);
        pickupPage.userBeingAbleToCheckOutThreeEarBuds();
    }


}
