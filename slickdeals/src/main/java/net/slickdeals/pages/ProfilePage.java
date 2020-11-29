package net.slickdeals.pages;

import com.peoplentech.team1automation.base.TestBase;
import com.peoplentech.team1automation.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class ProfilePage extends TestBase{
    private static org.apache.log4j.Logger LOGGER = Logger.getLogger(ProfilePage.class);

    @FindBy(linkText = "Log In")
    private WebElement pressLogInButton;

    @FindBy(id = "email")
    private WebElement typeEmail;

    @FindBy(id = "passwordInput")
    private WebElement typePassword;

    @FindBy(linkText = "Settings & Options")
    private WebElement clickSettingAndOptions;

    @FindBy(linkText = "Reset password")
    private WebElement clickResetPassword;

    public void userAbleToResetPassword(){

        pressLogInButton.click();
        sleepFor(3);
        ExtentTestManager.log("Log In Button Pressed");
        typeEmail.sendKeys("merajrahat@Yahoo.com", Keys.RETURN);
        ExtentTestManager.log("User put email and pressed enter");
        sleepFor(2);
        typePassword.sendKeys("Kkkrrish@18",Keys.RETURN);
        ExtentTestManager.log("User put password and pressed enter");
        sleepFor(3);
        WebElement user = driver.findElement(By.linkText("merajrahat"));
        Actions actions = new Actions(driver);
        actions.moveToElement(user).build().perform();
        ExtentTestManager.log("User hover over username");
        sleepFor(3);
        clickSettingAndOptions.click();
        ExtentTestManager.log("Able to click on Setting & Options");
        sleepFor(3);
        clickResetPassword.click();
        sleepFor(3);
        ExtentTestManager.log("Able to click on reset password");
        typeEmail.sendKeys("merajrahat@Yahoo.com", Keys.RETURN);
        ExtentTestManager.log("User put email and pressed enter");
        sleepFor(3);

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://slickdeals.net/forums/login.php?do=lostpw";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the url is correct");
    }

}
