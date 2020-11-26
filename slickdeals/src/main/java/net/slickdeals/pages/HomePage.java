package net.slickdeals.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(linkText = "Sign Up")
    private WebElement creatAnAccount;

    @FindBy(linkText = "Create an Account")
    private WebElement clickCreateAnAccount;

    @FindBy(id = "email")
    private WebElement typeEmail;

    @FindBy(linkText = "AUTO")
    private WebElement clickOnAuto;

    @FindBy(id = "facet_12029")
    private WebElement pickAmaoneOnly;

    public void setCreatAnAccount(){

        creatAnAccount.click();
    }
    public void setTypeEmail(){

        typeEmail.sendKeys("merajrahat@yahoo.com");
    }
    public void setClickOnAuto(){

        clickOnAuto.click();
    }
    public void setPickAmaoneOnly(){

        pickAmaoneOnly.click();
    }
}
