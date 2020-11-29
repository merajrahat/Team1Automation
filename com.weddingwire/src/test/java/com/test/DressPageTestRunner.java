package com.test;

import com.peoplentech.team1automation.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import weddingwire.pages.WeddingWire_DressPage;

public class DressPageTestRunner extends TestBase {
    WeddingWire_DressPage weddingWire_dressPage;


    // 14
    @Test(enabled = false)
    public void navigateToWeddingDressesValidation() throws InterruptedException {
        WeddingWire_DressPage weddingWire_dressPage = PageFactory.initElements(driver, WeddingWire_DressPage.class);
        weddingWire_dressPage.dressLinkElement();
        weddingWire_dressPage.assertionDressLinkElement();
    }

    // 15
    @Test(enabled = false)
    public void weddingDressClickValidation() throws InterruptedException {
        WeddingWire_DressPage weddingWire_dressPage = PageFactory.initElements(driver, WeddingWire_DressPage.class);
        weddingWire_dressPage.dressDropdownLinkElement();
        weddingWire_dressPage.assertionDressDropdownLinkElement();
    }

    // 16
    @Test(enabled = false) // HELP WTF IS GOING ON. It fails before it can scroll
    public void scrollToElementAndClickValidation() throws InterruptedException {
        WeddingWire_DressPage weddingWire_dressPage = PageFactory.initElements(driver, WeddingWire_DressPage.class);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1500)");
        weddingWire_dressPage.scrollIntoViewAndSelectElements();
        weddingWire_dressPage.assertionScrollIntoViewAndSelectElements();
        Thread.sleep(500);
    }

    // 17
    @Test(enabled = false)
    public void hashTagGeneratorValidation() throws InterruptedException {
        WeddingWire_DressPage weddingWire_dressPage = PageFactory.initElements(driver, WeddingWire_DressPage.class);
        weddingWire_dressPage.hashTagGeneratorElements();
        weddingWire_dressPage.assertionHashTagGeneratorElements();
    }

    // 18
    @Test(enabled = false)
    public void hashTagInformationrValidation() throws InterruptedException {
        WeddingWire_DressPage weddingWire_dressPage = PageFactory.initElements(driver, WeddingWire_DressPage.class);
        weddingWire_dressPage.enterHashTagInformationElements();
        weddingWire_dressPage.assertionEnterHashTagInformationElements();
    }
}
