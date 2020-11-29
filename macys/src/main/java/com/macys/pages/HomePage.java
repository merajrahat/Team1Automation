package com.macys.pages;

import com.peoplentech.team1automation.base.TestBase;
import com.peoplentech.team1automation.extent.ExtentTestManager;
import com.peoplentech.team1automation.extent.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class HomePage extends TestBase {
    private static Logger LOGGER = Logger.getLogger(HomePage.class);


    @FindBy(id = "globalSearchInputField")
    private WebElement searchBar;

    @FindBy(id = "searchSubmit")
    private WebElement searchAndClick;

    @FindBy(linkText = "DEALS")
    private WebElement clickOnDeals;

    @FindBy(linkText = "Gift Cards")
    private WebElement clickOnGiftCards;

    @FindBy(id = "bagCount")
    private WebElement clickOnBag;

    @FindBy(linkText = "Help & FAQs")
    private WebElement clickScrollElement;

    @FindBy(xpath = "//input[@id='sddChkBoxLeft']")
    private WebElement fileterASpecificChoice;

    @FindBy(id = "img_5886943")
    private WebElement pickATable;

    @FindBy(id = "sortBy")
    private WebElement goToFeacturedItemOption;

    @FindBy(xpath = "//a[@id=\"backToTop_3\"]")
    private WebElement scrollTopUsingMacysIcon;

    @FindBy(id = "storeName")
    private WebElement pickADifferentAddress;


    public void typeOnSearchBar(String data) {

        searchBar.sendKeys(data);
        ExtentTestManager.log("Able to type on search bar");

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://slickdeals.net/";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the url is correct");
    }

    public void clickOnSearch() {

        searchBar.sendKeys("table");
        ExtentTestManager.log("Able to click on search bar");
    }

    public void filterAChoiceForTable() {
        searchBar.sendKeys("table");
        ExtentTestManager.log("Able to write table on search bar");
        sleepFor(2);
        searchAndClick.click();
        ExtentTestManager.log("Able to search the item");
        sleepFor(2);
        fileterASpecificChoice.click();
        ExtentTestManager.log("Able to filter choice");
    }

    public void setPickATable() {
        searchBar.sendKeys("table");
        ExtentTestManager.log("Able to write table on search bar");
        sleepFor(2);
        searchAndClick.click();
        ExtentTestManager.log("Able to search the item");
        sleepFor(2);
        pickATable.click();
        ExtentTestManager.log("Able to pick one");
        sleepFor(2);
    }

    public void setGoToFeacturedItemOption() {
        searchBar.sendKeys("table");
        ExtentTestManager.log("Able to write table on search bar");
        sleepFor(2);
        searchAndClick.click();
        ExtentTestManager.log("Able to search the item");
        sleepFor(2);
        goToFeacturedItemOption.click();
        ExtentTestManager.log("Able to click feature item to see ways of displaying items");
        sleepFor(2);
    }

    public void searchThenClick() {

        searchAndClick.click();
        ExtentTestManager.log("Able to search and click");
    }

    public void clickList() {

        clickOnDeals.click();
        ExtentTestManager.log("Able to click on deals");
    }

    public void setClickOnGifts() {

        clickOnGiftCards.click();
        ExtentTestManager.log("Able to click on Gifts");
    }

    public void setClickOnBag() {

        clickOnBag.click();
        ExtentTestManager.log("Able to click on bag icon");
    }


    public void scrollDownAndUp() {
        JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;
        js.executeScript("window.scrollBy(0,-10000)");
        ExtentTestManager.log("Able to scroll down to specifi part of the page");
        sleepFor(2);
    }

    public void hoverOvevGiftCard() {
        WebElement gifts = driver.findElement(By.xpath("//span[@id=\"giftsLink\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(gifts).build().perform();
        ExtentTestManager.log("Able to hover on Gift Card");
        sleepFor(2);
    }

    public void scrollToElementAndClick() {
        WebElement element = driver.findElement(By.linkText("Help & FAQs"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        ExtentTestManager.log("Able to scroll down to an element");
        sleepFor(2);
        clickScrollElement.click();
        ExtentTestManager.log("Able to click the element");
        sleepFor(2);
    }

    public void actualTextAndExpectedTextMatchesOfURL() {

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.macys.com/";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the url is correct");
    }

    public void scrollAllTheWayDownAndUP() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        ExtentTestManager.log("Able to scroll all the way to the bottom of the page");
        sleepFor(2);
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
        ExtentTestManager.log("Able to scroll all the way to the top of the page");
        sleepFor(2);
    }

    public void setScrollTopUsingMacysIcon() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        ExtentTestManager.log("Able to scroll all the way to the bottom of the page");
        sleepFor(2);
        scrollTopUsingMacysIcon.click();
        ExtentTestManager.log("Able to scroll all the way to the top of the page using website top icon");
        sleepFor(2);
    }

}