package weddingwire.pages;

import com.peoplentech.team1automation.base.TestBase;
import com.peoplentech.team1automation.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SignUpPage {


    @FindBy(xpath = "//a[contains(text(),'Join now')]")
    private WebElement clickOnJoinButton;

    @FindBy(xpath = "//input[@name='NombreCompleto']")
    private WebElement validName;

    @FindBy(xpath = "//input[@name='Mail']")
    private WebElement validEmail;

    @FindBy(xpath = "//input[@name='Mail']")
    private WebElement invalidEmail;

    @FindBy(xpath = "//input[@name='Password']")
    private WebElement validPassword;

    @FindBy(xpath = "//input[@id='txtStrPoblacion']")
    private WebElement enterVenue;

    @FindBy(xpath = "//li[@class='suggest-navigation suggest-item-navigation-1']")
    private WebElement selectVenueDropdown;

    @FindBy(name = "Fecha") // or try //input[@name='Fecha']
    private WebElement accessCalendar;

    @FindBy(xpath = "//span[contains(text(),'2021')]")
    private WebElement selectCalendarYear;

    @FindBy(xpath = "//span[contains(text(),'Jun')]")
    private WebElement selectCalendarMonth;

    @FindBy(xpath = "(//td[@class='day '])[11]")
    private WebElement selectCalendarDay;

    @FindBy(xpath = "//button[contains(text(),'Sign up')]")
    private WebElement clickSignUpButton;


    public void userCanClickOnJoinButton() {
        clickOnJoinButton.click();
        ExtentTestManager.log("User clicked on Join now button");
    }

    public void validateURLForJoin() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.weddingwire.com/users-signup.php";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated " + actualURL);
    }

    public void userEntersValidName() {
        validName.sendKeys("Piper Halliwell");
        ExtentTestManager.log("User enters valid name");
    }

    public void userEntersValidEmail() {
        validEmail.sendKeys("philippakramou12345@gmail.com");
        ExtentTestManager.log("User enters valid email");
    }

    public void userEntersValidPassword() {
        validPassword.sendKeys("abc123");
        ExtentTestManager.log("User enters valid password");
    }

    public void userEntersVenueLocation() {
        enterVenue.sendKeys("San Francisco");
        ExtentTestManager.log("User enters venue location");
    }

    public void userClicksFromVenueDropdown() {
        selectVenueDropdown.click();
        ExtentTestManager.log("User clicks from venue dropdown");
    }

    public void userClicksIntoCalendar() {
        accessCalendar.click();
        ExtentTestManager.log("User clicks into calendar");
    }

    public void userSelectsCalendarYear() {
        selectCalendarYear.click();
        ExtentTestManager.log("User selects year in calendar");
    }

    public void userSelectsCalendarMonth() {
        selectCalendarMonth.click();
        ExtentTestManager.log("User selects month in calendar");
    }

    public void userSelectsCalendarDay() {
        selectCalendarDay.click();
        ExtentTestManager.log("User selects day in calendar");
    }

    public void userClicksSignUpButton() {
        clickSignUpButton.click();
        ExtentTestManager.log("User clicks Sign Up button");
    }

    public void validateSignUp() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(validName.isDisplayed());
        ExtentTestManager.log("Validated Name Field is displayed");

        softAssert.assertTrue(validEmail.isDisplayed());
        ExtentTestManager.log("Validated email field is displayed");

        softAssert.assertTrue(validPassword.isDisplayed());
        ExtentTestManager.log("Validated password field is displayed");

        softAssert.assertTrue(validPassword.isDisplayed());
        ExtentTestManager.log("Validated password field is displayed");

        softAssert.assertAll();

        ExtentTestManager.log("All Fields Have Been Validated");
    }

    public void userEntersInvalidEmail(){
        invalidEmail.sendKeys("piperh@gmail");
        ExtentTestManager.log("User enters invalid email");
    }

    public void validateSignUpFailure() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(invalidEmail.isDisplayed());
        ExtentTestManager.log("Invalid Email is displayed");

        softAssert.assertAll();

        ExtentTestManager.log("All Fields Have Been Validated");
    }

}
