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

    @FindBy(xpath = "//a[contains(text(),'Join now')]")
    public WebElement clickOnJoinButton;

    @FindBy(xpath = "//input[@id='txtStrSearch']")
    public WebElement clearSearchBar;

    @FindBy(xpath = "//input[@id='txtStrSearch']")
    public WebElement enterTextInSearchBar;

    @FindBy(xpath = "//input[@aria-label='NEAR city or region']")
    public WebElement clearAgainInSearchBar;

    @FindBy(xpath = "//input[@aria-label='NEAR city or region']")
    public WebElement enterTextAgainInSearchBar;

    @FindBy(xpath = "//input[@id='mainSearchBtn']")
    public WebElement clickSearchButton;

    @FindBy(xpath = "//body/div[@id='app-chat-container']/div[@id='app-bot-bot']/div[1]/div[1]/img[1]")
    public WebElement clickConciergeButton;

    @FindBy(xpath = "//span[contains(text(),'No, thanks.')]")
    public WebElement clickNoThanks;

    @FindBy(xpath = "//span[contains(text(),'Not yet.')]")
    public WebElement clickNotYet;

    @FindBy(xpath = "//body/div[@id='app-chat-container']/div[@id='app-bot-bot']/div[2]/div[1]/div[3]/span[1]/span[1]")
    public WebElement minimizeBot;

    @FindBy(xpath = "//a[contains(text(),'Nondiscrimination')]")
    public WebElement scrollToElement;

    @FindBy(xpath = "//span[contains(text(),'Shop')]")
    public WebElement clickShopLink;

    @FindBy(xpath = "(//a[contains(text(),'Dresses')])[1]")
    public WebElement clickDressesLink;



    public void validateURLForHomePage() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated " + actualURL);
    }

    public void clickSignInButton() {
        homePageSignInLink.click();
    }

    public void validateSignInButton() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/users-login.php";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated " + actualURL);
    }

    public void userClickJoinButton() {
        clickOnJoinButton.click();
    }

    public void validateJoinButton() {
        ExtentTestManager.log("Clicked on Join Now Button");
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/users-signup.php";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated " + actualURL);
    }

    public void accessToSearchBar() {
        clearSearchBar.clear();
        ExtentTestManager.log("First search bar is cleared");
        enterTextInSearchBar.sendKeys("Waterfront");
        ExtentTestManager.log("User enters 'Waterfront' in the search field");
        clearAgainInSearchBar.clear();
        ExtentTestManager.log("Second search bar is cleared");
        enterTextAgainInSearchBar.sendKeys("San Diego");
        ExtentTestManager.log("User enters 'San Diego' in second search field");
        clickSearchButton.click();
        ExtentTestManager.log("User clicks the search button");
    }

    public void validateAccessToSearchBar() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/shared/search";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated: " + actualURL);
    }

    public void scrollToElementOnHomePage() {
        scrollToElement.isDisplayed();
        ExtentTestManager.log("User scrolls to the Non-Descrimination link");
    }

    public void initiateConciergeConversation() {
        scrollToElementOnHomePage();
        ExtentTestManager.log("User scrolls to the Non-Descrimination Link");
       clickConciergeButton.click();
       ExtentTestManager.log("User clicks Concierge button");
        clickNoThanks.click();
        ExtentTestManager.log("User clicks 'No Thanks' button");
        clickNotYet.click();
        ExtentTestManager.log("User clicks 'Not yet' button");
        minimizeBot.click();
        ExtentTestManager.log("User minimizes Concierge bot");
    }

    public void validateScrollToElementAndSelectBot() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated: " + actualURL);
    }

    public void userCanClickOnShopLinkFromHomePage() {
        clickShopLink.click();
        ExtentTestManager.log("User clicks Shop link from the Homepage");
    }

    public void validateShopPage() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated: " + actualURL);
    }

    public void userCanClickOnDressesLinkFromHomePage() {
        clickDressesLink.click();
        ExtentTestManager.log("User clicks Dresses link from the Homepage");
    }

    public void validateDressesPage() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/wedding-photos/dresses";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated: " + actualURL);
    }

}
