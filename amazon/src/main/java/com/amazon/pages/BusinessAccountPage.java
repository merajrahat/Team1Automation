package com.amazon.pages;

import com.peoplentech.team1automation.base.TestBase;
import com.peoplentech.team1automation.extent.ExtentTestManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class BusinessAccountPage {

    @FindBy(linkText = "Create a free account")
    private WebElement createAccountButton;

    @FindBy(xpath = "(//span[text()='Find solutions'])[1]")
    private WebElement findSolutionsButton;

    @FindBy(linkText = "IT products")
    private WebElement itProductsButton;

    @FindBy(linkText = "Careers")
    private WebElement careersButton;


    public void clickOnCreateAFreeAccount() {
        createAccountButton.click();
        ExtentTestManager.log("Clicked On Create a free Account");

        List<String> browserTabs = new ArrayList<String>(TestBase.driver.getWindowHandles());
        TestBase.driver.switchTo().window(browserTabs.get(1));
        ExtentTestManager.log("Switched to business registration tab");
    }

    public void validatedURLForBusinessRegistration() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "amazon.com/business/register";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for business account registration: " + actualURL);
    }

    public void clickOnFindSolutionsButton() {
        findSolutionsButton.click();
        ExtentTestManager.log("Clicked On Find Solutions Button");
    }

    public void clickOnITProductsButton() {
        itProductsButton.click();
        ExtentTestManager.log("Clicked On IT Products Button");
    }

    public void validateURLForITProducts() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "/it-products";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for IT Products: " + actualURL);
    }

    public void scrollToCareersAndClick() {
        JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;

        js.executeScript("arguments[0].scrollIntoView(true);", careersButton);
        ExtentTestManager.log("The page scrolled down to Careers");

        careersButton.click();
        ExtentTestManager.log("Clicked on Career Button");

        List<String> browserTabs = new ArrayList<String>(TestBase.driver.getWindowHandles());
        TestBase.driver.switchTo().window(browserTabs.get(1));
        ExtentTestManager.log("Switched to Careers Website Tab");
    }

    public void validateURLForCareersPage() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.jobs/";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for Careers Page: " + actualURL);
    }
}
