package com.walmart.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PickupPage {

    private static Logger LOGGER = Logger.getLogger(HomePage.class);

    @FindBy(linkText = "Pickup & delivery")
    private WebElement pickupBtn;

    @FindBy(linkText = "searchForm")
    private WebElement searchBar;

    @FindBy(xpath = "//button[@aria-label='Perform Search']")
    private WebElement searchBtn;

    @FindBy(xpath = "//button[@aria-label='Add to cart Green Bell Pepper, 1 Each']")
    private WebElement addGreenPepper;

    @FindBy(xpath = "//button[@aria-label='add 1 item']")
    private WebElement addBtn;

    // //button[@aria-label='add 1 item']


    public void pickUp(){
        pickupBtn.click();
    }

    public void searchForAnItem(){

        pickupBtn.click();
        searchBar.sendKeys("vegetables");
        searchBtn.click();
    }

    public void greenPepper(){

        pickupBtn.click();
        searchBar.sendKeys("vegetables");
        searchBtn.click();
        addGreenPepper.click();
        for (int i=0; i<5; i++){
            addBtn.click();
        }



    }

}
