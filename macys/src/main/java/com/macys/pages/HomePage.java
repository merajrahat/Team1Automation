package com.macys.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(id = "globalSearchInputField")
    private WebElement searchBar;

    @FindBy(id = "searchSubmit")
    private WebElement searchAndClick;

    @FindBy(id = "header-wishlist-label")
    private WebElement clickOnList;

    @FindBy(linkText = "Order Lookup")
    private WebElement lookUpMyOrder;

    public void typeOnSearchBar(String data) {

        searchBar.sendKeys(data);
    }

    public void clickOnSearch(){
        searchBar.sendKeys("Men Shoes");

    }

    public void searchThenClick(){
        searchAndClick.click();
    }

    public void clickList(){

        clickOnList.click();

    }

    public void setLookUpMyOrder(){
        lookUpMyOrder.click();
    }




}
