package com.amazontest;

import com.amazon.pages.HomePage;
import com.amazon.pages.ProductPage;
import com.amazon.pages.SignInPage;
import com.peoplentech.team1automation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ProductPageValidation extends TestBase {

    @Test(enabled = false)
    public void validateUserIsAbleToSearchForAnItemAndClickOnBlackFridayDeals() {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

        homePage.clickOnAllDeptAndSelectDept();
        homePage.typeOnSearchBarAndClickOnSearchButton();
        homePage.validateURLForSearchButton();

        productPage.clickOnBlackFridayDeals();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToSelectPriceRange() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

        homePage.clickOnAllDeptAndSelectDept();
        homePage.typeOnSearchBarAndClickOnSearchButton();
        homePage.validateURLForSearchButton();

        productPage.clickOnBlackFridayDeals();
        productPage.clickOn$10to$15PriceRange();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToScrollDownAndSelectNextPage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        homePage.clickOnAllDeptAndSelectDept();
        homePage.typeOnSearchBarAndClickOnSearchButton();
        homePage.validateURLForSearchButton();

        productPage.clickOnBlackFridayDeals();
        productPage.clickOn$10to$15PriceRange();
        productPage.scrollDownToElementAndClickOnNextButton();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToFilterResults() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

        homePage.clickOnAllDeptAndSelectDept();
        homePage.typeOnSearchBarAndClickOnSearchButton();
        homePage.validateURLForSearchButton();

        productPage.clickOnBlackFridayDeals();
        productPage.clickOn$10to$15PriceRange();
        productPage.clickOnPlayStation5Filter();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToSelectAProductFromSearchResults() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

        homePage.clickOnAllDeptAndSelectDept();
        homePage.typeOnSearchBarAndClickOnSearchButton();
        homePage.validateURLForSearchButton();

        productPage.clickOnPsControllerProduct();
        productPage.validateProductURL();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToAddItemToCart() {
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);

        validateUserIsAbleToSelectAProductFromSearchResults();
        productPage.clickOnAddToCartButton();
        productPage.clickOnCheckoutButton();
        signInPage.validateURLForSignIn();

    }
}