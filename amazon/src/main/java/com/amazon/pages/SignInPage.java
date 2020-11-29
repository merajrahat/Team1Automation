package com.amazon.pages;

import com.peoplentech.team1automation.base.TestBase;
import com.peoplentech.team1automation.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SignInPage {

    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement emailField;

    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(xpath = "//input[@id='ap_password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    private WebElement signInButton;

    @FindBy(linkText = "Create your Amazon account")
    private WebElement createAccountButton;

    public void validateURLForSignIn() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.com/ap/signin";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated " + actualURL);
    }

    public void typeOnEmailFieldAndClickContinue() {
        emailField.sendKeys("email@email.com");
        continueButton.click();
        ExtentTestManager.log("Typed on the Email address field And Clicked on continue");
    }

    public void typeOnPasswordFieldAndClickSignIn() {
        passwordField.sendKeys("password");
        signInButton.click();

        ExtentTestManager.log("Typed on the password field and clicked on Sign In");
    }

    public void typeOnUserIdField(String username) {
        emailField.sendKeys(username);
        ExtentTestManager.log("Input userID");
    }

    public void clickOnContinueButton() {
        continueButton.click();
        ExtentTestManager.log("Clicked On Continue");
    }

    public void inputPasswordValues(String password) {
        passwordField.sendKeys(password);
        ExtentTestManager.log("Input password");
    }

    public void clickOnSignInButton() {
        signInButton.click();
        ExtentTestManager.log("Clicked on Sign In Button");
    }

    public void validateSignInFieldsUsingSoftAssert() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(emailField.isDisplayed());
        ExtentTestManager.log("Validated Email Field is displayed");

        softAssert.assertTrue(passwordField.isDisplayed());
        ExtentTestManager.log("Validated password field is displayed");

        softAssert.assertAll();

        ExtentTestManager.log("All Fields Have Been Validated");
    }

    public void clickOnCreateAccountFromSignInPage() {
        createAccountButton.click();
    }

    public void validateCreateAccountURL() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.com/ap/register";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated Create Account URL is displayed " + actualURL);
    }

}
