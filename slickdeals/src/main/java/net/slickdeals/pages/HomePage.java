package net.slickdeals.pages;

import com.peoplentech.team1automation.base.TestBase;
import com.peoplentech.team1automation.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class HomePage extends TestBase {
    private static org.apache.log4j.Logger LOGGER = Logger.getLogger(HomePage.class);

    @FindBy(linkText = "Sign Up")
    private WebElement creatAnAccount;

    @FindBy(linkText = "Create an Account")
    private WebElement clickCreateAnAccount;

    @FindBy(id = "email")
    private WebElement typeEmail;

    @FindBy(linkText = "Log In")
    private WebElement pressLogInButton;

    @FindBy(id = "passwordInput")
    private WebElement typePassword;

    @FindBy(linkText = "merajrahat")
    private WebElement clickOnUser;

    @FindBy(linkText = "Settings & Options")
    private WebElement clickSettingAndOptions;

    @FindBy(linkText = "Reset password")
    private WebElement clickResetPassword;

    @FindBy(linkText = "Logout")
    private WebElement userLogOut;

    @FindBy(linkText = "AUTO")
    private WebElement clickOnAuto;

    @FindBy(id = "facet_12029")
    private WebElement pickAmaoneOnly;

    @FindBy(linkText = "TV")
    private WebElement chooseTv;

    @FindBy(id = "facet_18841")
    private WebElement chooseBestBuy;

    @FindBy(linkText = "About Us")
    private WebElement findNamesOfTheManagementTeamOfTheWebsite;

    @FindBy(linkText = "Instagram")
    private WebElement instagram;

    @FindBy(linkText = "See All")
    private WebElement relatedAccounts;

    @FindBy(linkText = "Careers")
    private WebElement careerPage;

    @FindBy(linkText = "Home")
    private WebElement clickOnHome;

    @FindBy(linkText = "Shop All Categories")
    private WebElement clickShopAllCategories;

    @FindBy(xpath = "//input[@id=\"globalSearchBox\"]")
    private WebElement clickOnSearch;

    @FindBy(linkText = "2")
    private WebElement clickForSecondPage;

    @FindBy(xpath = "//input[@id='_6']")
    private WebElement pickAPriceRange;

    public void setCreatAnAccount(){

        creatAnAccount.click();
    }
    public void setTypeEmail(){

        typeEmail.sendKeys("merajrahaslfsafdasdassaf@yahoo.com",Keys.RETURN);

       //https://slickdeals.net/forums/registration/process_registration.php?do=sent&e=bWVyYWpyYWhhdGE2ODQ2c2xmc2FmZGFzZGFzc2FmQHlhaG9vLmNvbQ%3D%3D

       /* String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://slickdeals.net/forums/registration/process_registration.php";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the url is correct");*/
    }

    public void userAbleToLogIn(){
        pressLogInButton.click();
        sleepFor(3);
        ExtentTestManager.log("Log In Button Pressed");
        typeEmail.sendKeys("merajrahat@Yahoo.com", Keys.RETURN);
        ExtentTestManager.log("User put email and pressed enter");
        sleepFor(2);
        typePassword.sendKeys("Kkkrrish@18",Keys.RETURN);
        ExtentTestManager.log("User put password and pressed enter");
        sleepFor(3);

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://slickdeals.net/";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the url is correct");
    }

    public void userAbleToLogOutAfterLogIn(){
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
        sleepFor(2);
        userLogOut.click();
        ExtentTestManager.log("User clicked log out");
        sleepFor(2);

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://slickdeals.net/";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the url is correct");
    }

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

    public void setClickOnAuto(){

        clickOnAuto.click();
        ExtentTestManager.log("Able to click on Auto");
    }

    public void setPickAmaonOnly(){

        pickAmaoneOnly.click();
        ExtentTestManager.log("Able to click on item sold in Amazon only");

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://slickdeals.net/deals/";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the url is correct");
    }

    public void setChooseTvFromBestBuy(){

        chooseTv.click();
        ExtentTestManager.log("Able to click on TV");
        sleepFor(2);
        chooseBestBuy.click();
        ExtentTestManager.log("Able to choose BestBuy only");
        sleepFor(2);

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://slickdeals.net/filtered/tv-deals/?filter";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the url is correct");
    }

    public void setFindNamesOfTheManagementTeamOfTheWebsite(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        ExtentTestManager.log("Able to scroll bottom of the page");
        sleepFor(1);
        findNamesOfTheManagementTeamOfTheWebsite.click();
        ExtentTestManager.log("Able to click on About Us");
        sleepFor(3);
        js.executeScript("window.scrollBy(0,1996)");
        ExtentTestManager.log("Able to scroll on specific part of the page");
        sleepFor(3);
        ExtentTestManager.log("Scroll was successful");

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://slickdeals.net/corp/about-us.html";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the url is correct");
    }

    public void seeRelatedInstagramAccountForTheWebsite(){
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

    public void findWhatBenefitsEmployeesGet(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        ExtentTestManager.log("Able to scroll bottom of the page");
        sleepFor(1);
        careerPage.click();
        ExtentTestManager.log("Able to click on career");
        sleepFor(2);
        js.executeScript("window.scrollTo(0, 650)");
        ExtentTestManager.log("Able to scroll on specific part of the page");

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://slickdeals.net/corp/careers.html";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the url is correct");
    }

    public void findTheirFeaturedDealCategories(){
        chooseTv.click();
        ExtentTestManager.log("Able to click on TV");
        sleepFor(2);
        clickShopAllCategories.click();
        ExtentTestManager.log("Able to click on All Categories");
        sleepFor(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 300)");
        ExtentTestManager.log("Able to scroll on specific part of the page");
        sleepFor(2);

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://slickdeals.net/deal-categories/";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the url is correct");
    }

    public void tellTheSiteToPressOnEnterInsteadOfPressingSearchIcon(){
        clickOnSearch.sendKeys("ps4",Keys.RETURN);
        ExtentTestManager.log("Able to search for ps4 by pressing enter instead of search button");
        sleepFor(5);

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://slickdeals.net/newsearch.php?";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the url is correct");
    }

    public void seeIfTheBrowserGoesOnePageBack(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        ExtentTestManager.log("Able to scroll bottom of the page");
        sleepFor(1);
        careerPage.click();
        ExtentTestManager.log("Able to click on career");
        sleepFor(2);
        driver.navigate().back();
        ExtentTestManager.log("Able to go backward");
        sleepFor(2);

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://slickdeals.net/";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the url is correct");
    }

    public void seeIfTheBrowserGoesForwardAfterGoingBackward(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        ExtentTestManager.log("Able to scroll bottom of the page");
        sleepFor(1);
        instagram.click();
        ExtentTestManager.log("Able to click on instagram");
        sleepFor(2);
        driver.navigate().back();
        ExtentTestManager.log("Able to go backward");
        sleepFor(2);
        driver.navigate().forward();
        ExtentTestManager.log("Able to go forward");
        sleepFor(2);

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.instagram.com/slickdeals/";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the url is correct");
    }

    public void seeIfThePageRefreshProperlyAfterSearchingAnTiem(){
        chooseTv.click();
        ExtentTestManager.log("Able to click on TV");
        sleepFor(3);
        driver.navigate().refresh();
        ExtentTestManager.log("Able to refresh the page");
        sleepFor(2);

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://slickdeals.net/tv-deals/";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the url is correct");
    }

    public void userAbleToChooseTheSecondPageFromSearchItemPage(){
        clickOnSearch.sendKeys("laptop", Keys.RETURN);
        ExtentTestManager.log("Usr able to type laptop on search then press enter");
        sleepFor(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 1500)");
        ExtentTestManager.log("User able to a specific part of the page");
        sleepFor(2);
        clickForSecondPage.click();
        ExtentTestManager.log("Able to go on the second page");
        sleepFor(3);

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://slickdeals.net/newsearch.php?page=2";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the url is correct");
    }

    public void userAbleToChooseAPriceRangeForLaptop(){
        clickOnSearch.sendKeys("laptop", Keys.RETURN);
        ExtentTestManager.log("User able to type laptop on search then press enter");
        sleepFor(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 1500)");
        ExtentTestManager.log("User able to scroll to a specific part of the page");
        sleepFor(2);
        clickForSecondPage.click();
        ExtentTestManager.log("Able to go on the second page");
        sleepFor(3);
        pickAPriceRange.click();
        ExtentTestManager.log("Able to pick a price range");
        sleepFor(4);

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://slickdeals.net/newsearch.php?";
        ExtentTestManager.log("Able to verify the url is correct");
    }


}
