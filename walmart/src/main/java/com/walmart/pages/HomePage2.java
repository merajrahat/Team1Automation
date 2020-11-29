package com.walmart.pages;

import com.peoplentech.team1automation.base.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage2 extends TestBase {

    private static Logger LOGGER = Logger.getLogger(HomePage.class);

    @FindBy(id = "global-search-input")
    private WebElement searchBar;

    @FindBy(id = "global-search-submit")
    private WebElement searchBtn;

    //********************

    @FindBy(id = "global-search-dropdown-toggle")
    private WebElement allDepartmentBtn;

    @FindBy(xpath = "//button[@data-catid='3944']")
    private WebElement electronicsBtn;

    //*********************

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

    @FindBy(linkText = "Check out")
    private WebElement checkoutBtn;

    @FindBy(linkText = "Continue without account")
    private WebElement checkoutWithoutAccountBtn;

    @FindBy(linkText = "Continue")
    private WebElement continueBtn;

    //******************//
    //******************//


    public void userBeingAbleToTypeOnSearchBar() {
        searchBar.sendKeys("Playstation 5");
    }

    public void userBeingAbleToSearchForAnItem() {
        searchBar.sendKeys("Playstation 5");
        searchBtn.click();
    }

    //****************

    public void userBeingAbleToDisplayDepartment() {
        allDepartmentBtn.click();
    }

    public void userBeingAbleToClickOnElectronics() {
        allDepartmentBtn.click();
        electronicsBtn.click();
    }

    //***************

    public void userBeingAbleToScrollDownToElectronics() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollintoView(true);", electronicsScrollDownBtn);
        electronicsScrollDownBtn.click();
    }

    public void userBeingAbleToHoverToTvAndVideo() {
        //  Actions actions = new Actions();
        //  actions.moveToElement(tvAndVideoBtn).build().perform();

        electronicsScrollDownBtn.click();
        tvAndVideoBtn.click();
    }

    public void userBeingAbleToChooseTv() {
        electronicsScrollDownBtn.click();
        tvAndVideoBtn.click();
        hdtvsTvBtn.click();
        sonyTvBtn.click();
    }

    public void userBeingAbleToAddToCart() {
        electronicsScrollDownBtn.click();
        tvAndVideoBtn.click();
        hdtvsTvBtn.click();
        sonyTvBtn.click();
        addtocartBtn.click();
    }


}
