package weddingwire.pages;

import com.peoplentech.team1automation.base.TestBase;
import com.peoplentech.team1automation.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DressesPage {

    @FindBy(xpath = " (//div[@class='pure-u-1-5 item app-link'])[5]")
    public WebElement dressImageClick;

    @FindBy(xpath = "//a[contains(text(),'All designers')]")
    public WebElement clickAllDesignerLink;

    @FindBy(xpath = "//p[contains(text(),'Favorites')]")
    public WebElement favoritesButton;

    @FindBy(xpath = "//button[contains(text(),'×')]")
    public WebElement xOut;

    @FindBy(xpath = "//a[contains(text(),'Find your dress')]")
    public WebElement findYourDress;

    @FindBy(xpath = "//a[contains(text(),'Next')]")
    public WebElement nextButton;


    public void viewDesignerCollectionFromGrid(){
        dressImageClick.click();
        ExtentTestManager.log("User can click on the designer image");
    }

    public void validateDesignerPage() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/wedding-photos/dresses/maggie-sottero";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated: " + actualURL);
    }

    public void clickAllDesigners(){
        clickAllDesignerLink.click();
        ExtentTestManager.log("User clicks on All Designers");
    }

    public void validateAllDesignersPage() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/cat-DressDesigners.php?type=1";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated: " + actualURL);
    }

    public void clickOnFavorites() {
        favoritesButton.click();
        ExtentTestManager.log("User clicks on Favorites button");
    }

    public void handleSignInPopup() {
        xOut.click();
        ExtentTestManager.log("User x's out of pop-up");
    }

    public void validateFavoritesPage() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/cat-DressDesigners.php?type=1";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated: " + actualURL);
    }

    public void userClicksFindYourDress(){
        findYourDress.click();
        ExtentTestManager.log("User clicks Find Your Dress");
    }

    public void validateFindYourDressTool() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/wedding-photos/dresses";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated: " + actualURL);
    }

    public void userClicksNextButton() {
        nextButton.click();
        ExtentTestManager.log("User clicks the Next button");
    }

    public void validateNextButton() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/cat-DressList";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated: " + actualURL);
    }
}
