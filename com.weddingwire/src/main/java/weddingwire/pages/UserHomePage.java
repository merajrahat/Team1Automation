package weddingwire.pages;

import com.peoplentech.team1automation.base.TestBase;
import com.peoplentech.team1automation.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class UserHomePage {


    @FindBy(xpath = "//span[contains(text(),'Pippa Kramou')]")
    public WebElement findText;

    @FindBy(xpath = "(//li[@class='pure-u-1-8'])[2]")
    public WebElement clickChecklist;

    @FindBy(xpath = "//a[contains(text(),'Planning Tools')]")
    public WebElement hoverPlanningTools;

    @FindBy(xpath = "//span[contains(text(),'Hashtag Generator')]")
    public WebElement clickHashTagGenerator;

    @FindBy(xpath = "(//li[@class='pure-u-1-8'])[3]")
    public WebElement clickVendorManager;

    @FindBy(xpath = "(//a[@class='vendors-categBox-button app-icon-hover'])[3]")
    public WebElement clickSearchButton;

    @FindBy(xpath = "//p[contains(text(),'Search photographers')]")
    public WebElement clickSearchPhotographers;

    @FindBy(xpath = "//input[@id='app-suggest-vendor-text-input']")
    public WebElement clickPopUpSearchBar;

    @FindBy(xpath = "//li[@class='app-suggest-vendor-item pointer suggest-navigation suggest-item-navigation-0']")
    public WebElement selectPhotographer;

    @FindBy(xpath = "//button[contains(text(),'Save vendor')]")
    public WebElement clickSaveVendor;

    @FindBy(xpath = "//a[@class='btn-flat red app-add-vendor-modal icon-tools icon-tools-plus-white icon-left']")
    public WebElement addVendorButton;

    @FindBy(xpath = "//input[@id='app-suggest-vendor-text-input']")
    public WebElement clickOnSearchField;

    @FindBy(xpath = "//body/div[@id='app-common-layer']/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/ul[1]/li[1]")
    public WebElement hoverFromDropdown;

    @FindBy(xpath = "//body/div[@id='app-common-layer']/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/ul[1]/li[1]")
    public WebElement selectFromDropdown;





    public void validateUserHomePage() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/tools/Main";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated " + actualURL);
    }

    public void clickOnChecklistOnUserHomePage() {
        clickChecklist.click();
    }

    public void validateClickOnChecklistOnUserHomePage() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/tools/Checklist";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated " + actualURL);
    }

    public void userHoverOverPlanningTools() {
        Actions actions = new Actions(TestBase.driver);
        actions.moveToElement(hoverPlanningTools).build().perform();
    }

    public void clickOnHashTagGenerator() {
       userHoverOverPlanningTools();
       clickHashTagGenerator.click();
    }

    public void validateHoverAndClickOnHashagGenerator() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/wedding-hashtag-generator";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated " + actualURL);
    }

    public void accessPhotographerSearchPage() {
        clickVendorManager.click();
        ExtentTestManager.log("User clicks on Vendor Manager button");
        clickSearchButton.click();
        ExtentTestManager.log("User clicks on Search button");
        clickSearchPhotographers.click();
        ExtentTestManager.log("User clicks Search Photographers");
    }

    public void validatePhotographerSearchPage() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated " + actualURL);
    }

    public void addPhotographerFromVendorManagerPage() {
        clickVendorManager.click();
        ExtentTestManager.log("User clicks on Vendor Manager button");
        clickSearchButton.click();
        ExtentTestManager.log("User clicks on Search button");
        addVendorButton.click();
        clickOnSearchField.sendKeys("HMPhotoshoots");
        selectFromDropdown.click();
        clickSaveVendor.click();
    }

    public void validatePhotographerAdded() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated " + actualURL);
    }

}
