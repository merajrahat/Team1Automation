package net.slickdeals.pages;

import com.peoplentech.team1automation.base.TestBase;
import com.peoplentech.team1automation.extent.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class InstagramPage extends TestBase {
    private static org.apache.log4j.Logger LOGGER = Logger.getLogger(InstagramPage.class);


    @FindBy(linkText = "Instagram")
    private WebElement instagram;

    @FindBy(linkText = "See All")
    private WebElement relatedAccounts;

    public void seeRelatedInstagramAccountForTheWebsite() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        ExtentTestManager.log("Able to scroll bottom of the page");
        sleepFor(1);
        instagram.click();
        ExtentTestManager.log("Able to click on instagram");
        sleepFor(2);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        ExtentTestManager.log("Able to scroll bottom of the page");
        sleepFor(2);
        relatedAccounts.click();
        ExtentTestManager.log("Able to click on related accounts");
        sleepFor(2);

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.instagram.com/slickdeals/related_profiles/";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the url is correct");
    }


}
