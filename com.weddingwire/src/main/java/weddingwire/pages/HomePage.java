package weddingwire.pages;

import com.peoplentech.team1automation.base.TestBase;
import com.peoplentech.team1automation.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {

    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    private WebElement homePageSignInLink;

    @FindBy(xpath = "//p[contains(text(),'Log in to your account')]")
    private WebElement signInHeading;


    public void validateURLForHomePage() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated " + actualURL);
    }

    public void validateSignInButton() {
        homePageSignInLink.click();
        ExtentTestManager.log("Clicked on SignIn Button");
        Assert.assertTrue(signInHeading.isDisplayed());
        ExtentTestManager.log("Validated SignIn header is displayed");
    }
}
