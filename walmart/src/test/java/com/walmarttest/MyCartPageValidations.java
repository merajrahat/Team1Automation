package com.walmarttest;

import com.peoplentech.team1automation.base.TestBase;
import com.walmart.pages.MyCartPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MyCartPageValidations extends TestBase {

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnMyCart() {
        MyCartPage myCartPage = PageFactory.initElements(driver, MyCartPage.class);
        myCartPage.userBeingAbleToClickOnMyCart();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToViewServices() {
        MyCartPage myCartPage = PageFactory.initElements(driver, MyCartPage.class);
        myCartPage.userBeingAbleToViewServices();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToAddProtectionPlan() {
        MyCartPage myCartPage = PageFactory.initElements(driver, MyCartPage.class);
        myCartPage.userBeingAbleToAddProtectionPlan();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToCheckOut() {
        MyCartPage myCartPage = PageFactory.initElements(driver, MyCartPage.class);
        myCartPage.userBeingAbleToCheckOut();
    }
}
