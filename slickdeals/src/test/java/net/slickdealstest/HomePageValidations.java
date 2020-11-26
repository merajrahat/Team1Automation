package net.slickdealstest;


import com.peoplentech.team1automation.base.TestBase;
import net.slickdeals.pages.HomePage;
import net.slickdeals.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {



   @Test (enabled = false)
    public void validateClickOnLogInClickCreateAnAccount(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.setCreatAnAccount();
        sleepFor(2);
        homePage.setTypeEmail();
        sleepFor(2);


    }



    @Test (enabled = false)
    public void validateSelectAutoOnlyOnAmazon(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.setClickOnAuto();
        sleepFor(2);
        homePage.setPickAmaoneOnly();
        sleepFor(5);
    }

}