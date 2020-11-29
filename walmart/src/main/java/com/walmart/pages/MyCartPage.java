package com.walmart.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyCartPage {

    private static Logger LOGGER = Logger.getLogger(HomePage.class);

    @FindBy(xpath = "//a[@aria-label='Electronics']")
    private WebElement electronicsScrollDownBtn;

    @FindBy(xpath = "(//span[@class='SideBarMenu-title'])[1]")
    private WebElement tvAndVideoBtn;

    @FindBy(linkText = "4K Ultra HDTVs")
    private WebElement hdtvsTvBtn;

    @FindBy(xpath = "//*[@id='searchProductResult']/ul/li[1]/div/div[2]/div[5]/div/a/span")
    private WebElement sonyTvBtn;

    @FindBy(linkText = "Add to cart")
    private WebElement addtocartBtn;

    @FindBy(xpath = "(//span[@class='b_a hf-bubble-button-icon-slide b_g b_b b_p'])[1]")
    private WebElement mycartBtn;

    @FindBy(xpath = "(//span[@class='button-wrapper'])[1]")
    private WebElement addServicesBtn;

    @FindBy(xpath = "(//input[@class='input-toggle__input'])[1]")
    private WebElement protectionplanBtn;

    @FindBy(linkText = "Check out")
    private WebElement chekOutBtn;

    @FindBy(linkText = "Continue without account")
    private WebElement chekOutWithoutAccountBtn;

    @FindBy(linkText = "Continue")
    private WebElement continueBtn;


    //************//
    //************//

    public void userBeingAbleToClickOnMyCart() {
        mycartBtn.click();
    }

    public void userBeingAbleToViewServices() {
        electronicsScrollDownBtn.click();
        tvAndVideoBtn.click();
        hdtvsTvBtn.click();
        sonyTvBtn.click();
        addtocartBtn.click();
        mycartBtn.click();
        addServicesBtn.click();

    }

    public void userBeingAbleToAddProtectionPlan() {
        electronicsScrollDownBtn.click();
        tvAndVideoBtn.click();
        hdtvsTvBtn.click();
        sonyTvBtn.click();
        addtocartBtn.click();
        mycartBtn.click();
        addServicesBtn.click();
        protectionplanBtn.click();
    }

    public void userBeingAbleToCheckOut() {
        electronicsScrollDownBtn.click();
        tvAndVideoBtn.click();
        hdtvsTvBtn.click();
        sonyTvBtn.click();
        addtocartBtn.click();
        mycartBtn.click();
        addServicesBtn.click();
        protectionplanBtn.click();
        chekOutBtn.click();
        chekOutWithoutAccountBtn.click();
        continueBtn.click();

    }


}
