package com.amazon.pages;

import com.peoplentech.team1automation.base.TestBase;
import com.peoplentech.team1automation.report.ExtentTestManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ProductPage {
    @FindBy (xpath = "//span[text()='Black Friday deals']")
    WebElement blackFridayButton;

    @FindBy(xpath = "//span[text()='$10 to $15']")
    WebElement priceRangeButton;

    @FindBy (xpath = "//span[text()='PlayStation 5 Consoles, Games & Accessories']")
    WebElement ps5Button;

    @FindBy (xpath = "//a[text()='Next']")
    WebElement nextPageButton;

    @FindBy (xpath = "//span[text()='DualSense Wireless Controller']")
    WebElement productButton;

    @FindBy (xpath = "//input[@id=\"add-to-cart-button\"]")
    WebElement addToCartButton;

    @FindBy(xpath = "//div[@id=\"attachDisplayAddBaseAlert\"]")
    private WebElement addedToCart;

    @FindBy(xpath = "//span[@id=\"attach-sidesheet-checkout-button\"]")
    private WebElement checkoutButton;

    public void clickOnBlackFridayDeals(){
        blackFridayButton.click();
        ExtentTestManager.log("Used Filter Black Friday Deals");
    }

    public void clickOn$10to$15PriceRange(){
        priceRangeButton.click();
        ExtentTestManager.log("Selected $10 to $15 price range");
    }

    public void clickOnPlayStation5Filter(){
        ps5Button.click();
        ExtentTestManager.log("Filtered to select PlayStation 5 Consoles and Games");
    }

    public void scrollDownToElementAndClickOnNextButton(){
        JavascriptExecutor js= (JavascriptExecutor) TestBase.driver;

        js.executeScript("arguments[0].scrollIntoView(true);",nextPageButton);
        ExtentTestManager.log("The page scrolled down to Next page button");

        nextPageButton.click();
        ExtentTestManager.log("Clicked on Next");
    }

    public void clickOnPsControllerProduct(){
        productButton.click();
        ExtentTestManager.log("Clicked on a product: Wireless Controller");
    }

    public void validateProductURL(){
        String actualURL= TestBase.driver.getCurrentUrl();
        String expectedURL= "amazon.com/DualSense";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for product: "+actualURL);
    }

    public void clickOnAddToCartButton(){
        addToCartButton.click();
        ExtentTestManager.log("Clicked on add item to cart button");

    }

    public void clickOnCheckoutButton(){
        checkoutButton.click();
        ExtentTestManager.log("Clicked on checkout button");
    }





}