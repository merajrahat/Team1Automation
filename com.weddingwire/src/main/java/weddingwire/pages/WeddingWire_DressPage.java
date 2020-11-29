package weddingwire.pages;

import com.peoplentech.team1automation.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static com.data.DressPageElements.*;

public class WeddingWire_DressPage extends TestBase {

    @FindBy(xpath = dressLinkClickLocator)
    public WebElement dressLinkClick;
    @FindBy(xpath = dressDropdownLinkClickLocator)
    public WebElement dressDropdownLinkClick;
    @FindBy(xpath = scrollAndSelectOffShoulderNecklineLocator)
    public WebElement scrollAndSelectOffShoulderNeckline;
    @FindBy(xpath = planningToolsClickLocator)
    public WebElement planningToolsClick;
    @FindBy(xpath = HashTagGeneratorFromDropdownLocator)
    public WebElement HashTagGeneratorFromDropdown;
    @FindBy(xpath = enterYourFirstNameLocator)
    public WebElement enterYourFirstName;
    @FindBy(xpath = enterYourLastNameLocator)
    public WebElement enterYourLastName;
    @FindBy(xpath = enterYourNicknameLocator)
    public WebElement enterYourNickname;
    @FindBy(xpath = enterPartnerFirstNameLocator)
    public WebElement enterPartnerFirstName;
    @FindBy(xpath = enterPartnerLastNameLocator)
    public WebElement enterPartnerLastName;
    @FindBy(xpath = enterPartnerNicknameLocator)
    public WebElement enterPartnerNickname;
    @FindBy(xpath = surnameSelectionLocator)
    public WebElement surnameSelection;
    @FindBy(xpath = weddingDateClickLocator)
    public WebElement weddingDateClick;
    @FindBy(xpath = calendarYearSelectionLocator)
    public WebElement calendarYearSelection;
    @FindBy(xpath = calendarMonthSelectionLocator)
    public WebElement calendarMonthSelection;
    @FindBy(xpath = calendarDaySelectionLocator)
    public WebElement calendarDaySelection;
    @FindBy(xpath = weddingLocationLocator)
    public WebElement weddingLocation;
    @FindBy(xpath = weddingLocationClickLocator)
    public WebElement weddingLocationClick;
    @FindBy(xpath = settingDropdownClickLocator)
    public WebElement settingDropdownClick;
    @FindBy(xpath = sendKeysBeachLocator)
    public WebElement sendKeysBeach;
    @FindBy(xpath = sendKeysBeachClickLocator)
    public WebElement sendKeysBeachClick;
    @FindBy(xpath = clickGenerateHashTagButtonLocator)
    public WebElement clickGenerateHashTagButton;


    public void dressLinkElement() throws InterruptedException {
        Thread.sleep(3);
        dressLinkClick.click();
    }

    public void assertionDressLinkElement() throws InterruptedException {
        String expectedResult = "Weddings, Wedding Venues - WeddingWire";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }

    public void dressDropdownLinkElement() throws InterruptedException {
        dressLinkElement();
        dressDropdownLinkClick.click();
    }

    public void assertionDressDropdownLinkElement() throws InterruptedException {
        String expectedResult = "Wedding Dress Photos, Wedding Dresses Pictures - WeddingWire.com";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }

    public void scrollIntoViewAndSelectElements() throws InterruptedException {
        dressLinkElement();
        dressDropdownLinkElement();
        Thread.sleep(500);
        scrollAndSelectOffShoulderNeckline.click();
    }

    public void assertionScrollIntoViewAndSelectElements() throws InterruptedException {
        String expectedResult = "Wedding Dress Photos, Wedding Dresses Pictures - WeddingWire.com";
//        String actualResult = driver.getTitle();
//        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");

        // goal is to continue and select a specific dress
    }

    public void hashTagGeneratorElements() throws InterruptedException {
        planningToolsClick.click();
        Thread.sleep(500);
        HashTagGeneratorFromDropdown.click();
    }

    public void assertionHashTagGeneratorElements() throws InterruptedException {
        String expectedResult = "Wedding Hashtag Generator | WeddingWire";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }

    public void enterHashTagInformationElements() throws InterruptedException {
        hashTagGeneratorElements();
        enterYourFirstName.sendKeys("Piper");
        enterYourLastName.sendKeys("Halliwell");
        enterYourNickname.sendKeys("Pipes");
        enterPartnerFirstName.sendKeys("Leo");
        enterPartnerLastName.sendKeys("Wyatt");
        enterPartnerNickname.sendKeys("Orbs");
        surnameSelection.click();
        weddingDateClick.click();
        Thread.sleep(5000);
        calendarYearSelection.click();
        calendarMonthSelection.click();
        calendarDaySelection.click();
        weddingLocation.sendKeys("San Francisco");
//        weddingLocationClick.click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(weddingLocationClick)).click();
        settingDropdownClick.click();
        sendKeysBeach.sendKeys("beach");
        sendKeysBeachClick.click();
        clickGenerateHashTagButton.click();
    }

    public void assertionEnterHashTagInformationElements() throws InterruptedException {
        String expectedResult = "Wedding Hashtag Generator | WeddingWire";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }
}


