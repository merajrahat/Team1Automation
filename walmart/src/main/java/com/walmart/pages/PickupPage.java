package com.walmart.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PickupPage {

    private static Logger LOGGER = Logger.getLogger(HomePage.class);


    @FindBy(linkText = "Pickup & delivery")
    private WebElement pickupbtn;

    @FindBy(xpath = "//button[@aria-label='close modal']")
    private WebElement popUpClosebtn;

    @FindBy(id = "mobileNavigationBtn")
    private WebElement departmentBtn;

    @FindBy(xpath = "//button[@aria-label='Office & Electronics']")
    private WebElement officeAndElectronicsBtn;

    @FindBy(xpath = "//a[@aria-label='Search by Headphones & Speakers']")
    private WebElement headphonesAndSpeakersBtn;

    @FindBy(xpath = "//button[@aria-label='Add to cart TRUE WIRELESS SPORT EARBUD']")
    private WebElement earbudsBtn;

    @FindBy(xpath = "//button[@aria-label='Add to cart TRUE WIRELESS SPORT EARBUD']")
    private WebElement addEarbudsToCart;

    @FindBy(xpath = "//button[@aria-label='add 1 item']")
    private WebElement add1itemBtn;

    @FindBy(xpath = "//button[@class='button-block button-primary']")
    private WebElement chekOutBtn;


    //***********//
    //***********//

    public void userBeingAbleToGoToPickupPage() {
        pickupbtn.click();
    }

    public void UserBeingAbleToViewDepartments() {
        pickupbtn.click();
        popUpClosebtn.click();
        departmentBtn.click();
    }

    public void userBeingAbleToChooseDepartment() {
        pickupbtn.click();
        popUpClosebtn.click();
        departmentBtn.click();
        officeAndElectronicsBtn.click();
    }

    public void userBeingAbleToAddEarbudsToCart() {
        pickupbtn.click();
        popUpClosebtn.click();
        departmentBtn.click();
        officeAndElectronicsBtn.click();
        headphonesAndSpeakersBtn.click();
        earbudsBtn.click();
        addEarbudsToCart.click();
    }

    public void userBeingAbleToCheckOutThreeEarBuds() {
        pickupbtn.click();
        popUpClosebtn.click();
        departmentBtn.click();
        officeAndElectronicsBtn.click();
        headphonesAndSpeakersBtn.click();
        earbudsBtn.click();
        addEarbudsToCart.click();
        add1itemBtn.click();
        add1itemBtn.click();
        chekOutBtn.click();
    }

}
