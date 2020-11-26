package com.amazon.pages;

import com.peoplentech.team1automation.base.TestBase;
import com.peoplentech.team1automation.report.ExtentTestManager;
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

    @FindBy (linkText = "IT products")
    private WebElement itProductsButton;

    public void clickOnCreateAFreeAccount(){
        createAccountButton.click();
        ExtentTestManager.log("Clicked On Create a free Account");

        List<String> browserTabs=new ArrayList<String>(TestBase.driver.getWindowHandles());
        TestBase.driver.switchTo().window(browserTabs.get(1));
        ExtentTestManager.log("Switched to business registration tab");
    }

    public void validatedURLForBusinessRegistration(){
        String actualURL= TestBase.driver.getCurrentUrl();
        String expectedURL= "amazon.com/business/register";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for business account registration: "+actualURL);
    }

    public void clickOnFindSolutionsButton(){
        findSolutionsButton.click();
        ExtentTestManager.log("Clicked On Find Solutions Button");
    }

    public void clickOnITProductsButton(){
        itProductsButton.click();
        ExtentTestManager.log("Clicked On IT Products Button");
    }

    public void validateURLForITProducts(){
        String actualURL= TestBase.driver.getCurrentUrl();
        String expectedURL= "/it-products";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for IT Products: "+actualURL);
    }
}
