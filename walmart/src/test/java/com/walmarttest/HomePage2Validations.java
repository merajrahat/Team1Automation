package com.walmarttest;

import com.peoplentech.team1automation.base.TestBase;
import com.walmart.pages.HomePage2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePage2Validations extends TestBase {

    @Test
    public void validateUserBeingAbleToTypeOnSearchBar() {
        HomePage2 homePage2 = PageFactory.initElements(driver, HomePage2.class);
        homePage2.userBeingAbleToTypeOnSearchBar();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToDisplayDepartment() {
        HomePage2 homePage2 = PageFactory.initElements(driver, HomePage2.class);
        homePage2.userBeingAbleToDisplayDepartment();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToScrollDownToElectronics() {
        HomePage2 homePage2 = PageFactory.initElements(driver, HomePage2.class);
        homePage2.userBeingAbleToScrollDownToElectronics();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToHoverToTvAndVideo() {
        HomePage2 homePage2 = PageFactory.initElements(driver, HomePage2.class);
        homePage2.userBeingAbleToHoverToTvAndVideo();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToChooseTv() {
        HomePage2 homePage2 = PageFactory.initElements(driver, HomePage2.class);
        homePage2.userBeingAbleToChooseTv();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToAddToCart() {
        HomePage2 homePage2 = PageFactory.initElements(driver, HomePage2.class);
        homePage2.userBeingAbleToAddToCart();
    }

}
