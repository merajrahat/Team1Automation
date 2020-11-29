package com.walmart.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    private static Logger LOGGER = Logger.getLogger(HomePage.class);

    @FindBy(id = "global-search-input")
    private WebElement searchBar;

    @FindBy(id = "global-search-submit")
    private WebElement searchBtn;

    @FindBy(linkText = "Pickup & delivery")
    private WebElement pickupBtn;


    public void typeOnSearchBar() {

        searchBar.sendKeys("Playstation 5");
        pickupBtn.click();
    }

    public void clickOnSearchBtn() {

        searchBar.sendKeys("Playstation 5");
        searchBtn.click();
    }
}
