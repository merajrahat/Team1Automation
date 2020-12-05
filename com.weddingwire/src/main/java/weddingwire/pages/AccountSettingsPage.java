package weddingwire.pages;

import com.peoplentech.team1automation.base.TestBase;
import com.peoplentech.team1automation.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AccountSettingsPage {

    @FindBy(xpath = "//body/div[@id='menu']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]")
    private WebElement clickOnProfile;

    @FindBy(xpath = "(//div[@class='pure-u-1-3'])[3]")
    private WebElement clickOnSettings;

    @FindBy(xpath = "//a[contains(text(),'User Information')]")
    private WebElement clickOnUserInfo;

    @FindBy(xpath = "//a[contains(text(),'Notifications')]")
    private WebElement clickOnNotificationsLink;

    @FindBy(xpath = "//input[@name='Formacion']")
    private WebElement checkUpdatesBox;

    @FindBy(xpath = "//button[contains(text(),'Save changes')]")
    private WebElement clickSaveChanges;


    public void userCanAccessAccountSettings() {
        clickOnProfile.click();
        ExtentTestManager.log("User clicks on profile dropdown");
        clickOnSettings.click();
        ExtentTestManager.log("User clicks on Settings");
    }

    public void validateUserCanAccessAccountSettings() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/users-preferences.php";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated: " + actualURL);
    }

    public void userClicksUserInfo() {
        clickOnUserInfo.click();
        ExtentTestManager.log("User clicks on User Information");
    }

    public void validateUserInformationPageDisplays() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/users-update.php";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated: " + actualURL);
    }

    public void userClicksNotificationLink() {
        clickOnNotificationsLink.click();
        ExtentTestManager.log("User clicks on Notifications link");
    }

    public void validateUserNotificationsPageDisplays() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/users-notifications.php";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated: " + actualURL);
    }

    public void checkUpdatesBoxAndSaveChanges() {
        checkUpdatesBox.click();
        ExtentTestManager.log("User checks the box under Updates.");
        clickSaveChanges.click();
        ExtentTestManager.log("User clicks Save Changes button.");
    }

    public void validateUserSavedChanges() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated: " + actualURL);
    }
}
