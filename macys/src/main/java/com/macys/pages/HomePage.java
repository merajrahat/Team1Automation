package com.macys.pages;

import com.peoplentech.team1automation.base.TestBase;
import com.peoplentech.team1automation.report.ExtentManager;
import com.peoplentech.team1automation.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

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


    public void typeOnSearchBar(String data) {

        searchBar.sendKeys(data);
    }

    public void clickOnSearch(){

        searchBar.sendKeys("table");
    }

    public void filterAChoiceForTable(){
        searchBar.sendKeys("table");
        searchAndClick.click();
        sleepFor(2);
        fileterASpecificChoice.click();
    }

    public void setPickATable() {
        searchBar.sendKeys("table");
        searchAndClick.click();
        pickATable.click();
        sleepFor(2);
    }

    public void setGoToFeacturedItemOption() {
        searchBar.sendKeys("table");
        searchAndClick.click();
        goToFeacturedItemOption.click();
    }

    public void searchThenClick(){

        searchAndClick.click();
    }

    public void clickList(){

        clickOnDeals.click();
    }

    public void setClickOnGifts(){

        clickOnGiftCards.click();
    }

    public void setClickOnBag(){

        clickOnBag.click();
    }



    public void scrollDownAndUp(){
        JavascriptExecutor js = (JavascriptExecutor)TestBase.driver;
        js.executeScript("window.scrollBy(0,10000)");

        sleepFor(2);

        js.executeScript("window.scrollBy(0,-10000)");

        sleepFor(2);
    }

    public void hoverOvevGiftCard(){
        WebElement gifts = driver.findElement(By.xpath("//span[@id=\"giftsLink\"]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(gifts).build().perform();

        sleepFor(2);
    }

    public void actualTextAndExpectedTextMatchesOfAWord(){
        WebElement searchedItem = driver.findElement(By.xpath("//span[text()='table']"));
        String actualText = searchedItem.getText();
        LOGGER.info(actualText);
        Assert.assertEquals(actualText,"table");
        sleepFor(2);
        boolean validate = searchedItem.isDisplayed();
        LOGGER.info(validate);
    }

    public void scrollToElementAndClick(){
        WebElement element = driver.findElement(By.linkText("Help & FAQs"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        sleepFor(2);
        clickScrollElement.click();
        sleepFor(2);
    }

    public void actualTextAndExpectedTextMatchesOfURL(){

        String currentUrl= TestBase.driver.getCurrentUrl();
        String expectedURL="https://www.macys.com/";
        Assert.assertTrue(currentUrl.contains(expectedURL));
    }

    public void scrollAllTheWayDownAndUP(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        sleepFor(2);
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
    }

    public void setScrollTopUsingMacysIcon(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        sleepFor(2);
        scrollTopUsingMacysIcon.click();
        sleepFor(2);
    }


}
