package com;

import com.peoplentech.team1automation.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static com.HomePageElements.*;

public class WeddingWire_HomePage extends TestBase {


    @FindBy(xpath = clickOnJoinButtonLocator)
    public WebElement clickOnJoinButton;
    @FindBy(xpath = sendValidNameLocator)
    public WebElement enterFirstAndLastName;
    @FindBy(xpath = sendValidEmailLocator)
    public WebElement sendValidEmail;
    @FindBy(xpath = sendValidPasswordLocator)
    public WebElement sendValidPassword;
    @FindBy(xpath = sendValidVenueLocator)
    public WebElement sendValidVenue;
    @FindBy(xpath = sendValidVenueDropdownLocator)
    public WebElement sendValidVenueDropdown;
    @FindBy(name = clickWeddingDateBoxLocator)
    public WebElement clickWeddingDateBox;
    @FindBy(xpath = clickCalendarLocator)
    public WebElement clickCalendar;
    @FindBy(xpath = clickYearLocator)
    public WebElement clickYear;
    @FindBy(xpath = clickMonthLocator)
    public WebElement clickMonth;
    @FindBy(xpath = clickDayLocator)
    public WebElement clickDay;
    @FindBy(xpath = clickSignUpButtonLocator)
    public WebElement clickSignUpButton;
    @FindBy(xpath = clearSearchBarLocator)
    public WebElement clearSearchBar;
    @FindBy(xpath = enterTextInSearchBarLocator)
    public WebElement enterTextInSearchBar;
    @FindBy(xpath = clearAgainInSearchBarLocator)
    public WebElement clearAgainInSearchBar;
    @FindBy(xpath = enterTextAgainInSearchBarLocator)
    public WebElement enterTextAgainInSearchBar;
    @FindBy(xpath = clickSearchButtonLocator)
    public WebElement clickSearchButton;
    @FindBy(xpath = clickDownArrowButtonLocator)
    public WebElement clickDownArrowButton;
    @FindBy(xpath = clickViewMoreButtonLocator)
    public WebElement clickViewMoreButton;
    @FindBy(xpath = clickBeachWeddingLocator)
    public WebElement clickBeachWedding;
    @FindBy(xpath = clickImageViewLocator)
    public WebElement clickImageView;
    @FindBy(xpath = loginLocator)
    public WebElement loginUser;
    @FindBy(xpath = loginEmailLocator)
    public WebElement loginEmail;
    @FindBy(xpath = loginPasswordLocator)
    public WebElement loginPassword;
    @FindBy(xpath = clickLoginLocator)
    public WebElement clickLogin;
    @FindBy(xpath = clickChecklistLocator)
    public WebElement clickChecklist;
    @FindBy(xpath = dropdownToolsLocator)
    public WebElement dropdownTools;
    @FindBy(xpath = dropdownToolsOptionLocator)
    public WebElement dropdownToolsOption;
    @FindBy(xpath = headerBannerLocator)
    public WebElement headerBanner;
    @FindBy(xpath = returnNavigationLocator)
    public WebElement returnNavigation;
    @FindBy(xpath = elementScrollLocator)
    public WebElement elementScroll;
    @FindBy(xpath = findVisibleTextLocator)
    public WebElement findVisibleText;
    @FindBy(xpath = organizeGuestListLinkLocator)
    public WebElement organizeGuestListLink;
    @FindBy(xpath = addGuestsLinkLocator)
    public WebElement addGuestsLink;
    @FindBy(xpath = closePopupLocator)
    public WebElement closePopup;
    @FindBy(xpath = conciergeBotLocator)
    public WebElement conciergeBot;
    @FindBy(xpath = minimizeConciergeBotLocator)
    public WebElement minimizeConciergeBot;
    @FindBy(xpath = addPhotographerButtonLocator)
    public WebElement addPhotographerButton;
    @FindBy(xpath = handlePopupButtonLocator)
    public WebElement handlePopupButton;
    @FindBy(xpath = photographerSearchBarLocator)
    public WebElement photographerSearchBar;
    @FindBy(xpath = photographerSearchSelectionLocator)
    public WebElement photographerSearchSelection;
    @FindBy(xpath = savePhotographerSelectionLocator)
    public WebElement savePhotographerSelection;
    @FindBy(xpath = favoriteButtonHeartLocator)
    public WebElement favoriteButtonHeart;
    @FindBy(xpath = viewFavoritePhotographerClickLocator)
    public WebElement viewFavoritePhotographerClick;
    @FindBy(xpath = removeFavoritePhotographerClickLocator)
    public WebElement removeFavoritePhotographerClick;
    @FindBy(xpath = profileClickLocator)
    public WebElement profileClick;
    @FindBy(xpath = profileLinkClickLocator)
    public WebElement profileLinkClick;
    @FindBy(xpath = exitProfilePopupLocator)
    public WebElement exitProfilePopup;
    @FindBy(xpath = mailEnvelopeLocator)
    public WebElement mailEnvelope;
    @FindBy(xpath = profileClickButtonLocator)
    public WebElement profileClickButton;
    @FindBy(xpath = settingsClickButtonLocator)
    public WebElement settingsClickButton;
    @FindBy(xpath = userInformationLinkLocator)
    public WebElement userInformationLink;
    @FindBy(xpath = notificationLinkLocator)
    public WebElement notificationLink;
    @FindBy(xpath = notificationPeferenceCheckboxLocator)
    public WebElement notificationPeferenceCheckbox;
    @FindBy(xpath = saveNotificationChangesButtonLocator)
    public WebElement saveNotificationChangesButton;
    @FindBy(xpath = clickShopLinkLocator)
    public WebElement clickShopLink;
    @FindBy(xpath = validateSignUpLocator)
    public WebElement validateSignUp;

    public void joinNowElement() {
        clickOnJoinButton.click();
    }

    public void assertionJinNowElement() {
        String expectedResult = "Sign up - WeddingWire.com";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }

    public void assertionNavigateToHomePageValidation() {
        String expectedResult = "Weddings, Wedding Venues - WeddingWire";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }

    public void sendValidInformation() {
        joinNowElement();
        enterFirstAndLastName.sendKeys("Pippa Kramou");
        sendValidEmail.sendKeys("philippakramou13@gmail.com");
        sendValidPassword.sendKeys("abc123");
        sendValidVenue.sendKeys("San Francisco");
        sendValidVenueDropdown.click();
        clickWeddingDateBox.click();
        clickCalendar.click();
        clickYear.click();
        clickMonth.click();
        clickDay.click();
        clickSignUpButton.click();
    }

    public void assertionValidInformation() {
        String expectedResult = "Sign up - WeddingWire.com";
        String actualResult = validateSignUp.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }

    public void accessSearchBar() {
        clearSearchBar.clear();
        enterTextInSearchBar.sendKeys("Waterfront");
        clearAgainInSearchBar.clear();
        enterTextAgainInSearchBar.sendKeys("San Diego");
        clickSearchButton.click();
    }

    public void assertionAccessSearchBar() {
        String expectedResult = "San Diego Waterfront Weddings - Reviews for 59 CA Venues";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }

    public void accessVenueFilters() {
        accessSearchBar();
        clickDownArrowButton.click();
        clickViewMoreButton.click();
        clickBeachWedding.click();
    }

    public void assertionAccessVenueFilters() {
        String expectedResult = "San Diego Beach Weddings - Reviews for 36 CA Venues";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }

    public void resultsViewOptions() {
        accessVenueFilters();
        clickImageView.click();
    }

    public void assertionResultsViewOptions() {
        String expectedResult = "";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
        // goal is to switch between images view and map view
    }

    public void userLogin() {
        loginUser.click();
        loginEmail.sendKeys("philippakramou@gmail.com");
        loginPassword.sendKeys("abc123");
        clickLogin.click();
    }

    public void assertionUserLogin() {
        String expectedResult = "Wedding Planner - WeddingWire.com";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }

    public void checklistAccess() {
        userLogin();
        clickChecklist.click();
    }

    public void assertionChecklistAccess() {
        String expectedResult = "Checklist - WeddingWire.com";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }

    public void dropdownClickTools() {
        userLogin();
        dropdownTools.click();
        dropdownToolsOption.click();
    }

    public void assertionDropdownClickTools() {
        String expectedResult = "Weddings, Wedding Venues - WeddingWire";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }

    public void headerLinkClick() {
        headerBanner.click();
    }

    public void assertionHeaderLinkClick() {
        String expectedResult = "The COVID Wedding Ideas & Planning Help You Need Now - WeddingWire";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }

    public void goBackClick() {
        returnNavigation.click();
    }

    public void assertionGoBackClick() {
        String expectedResult = "Weddings, Wedding Venues - WeddingWire";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }

    public void scrollElementClick() {

        elementScroll.click();
    }

    public void assertionScrollElementClick() {
        String expectedResult = "Non-Discrimination Policy | WeddingWire";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }

    public void findingVisibleText() {
        findVisibleText.isDisplayed();
    }

    public void assertionFindingVisibleText() {
        String expectedResult = "Weddings, Wedding Venues - WeddingWire";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }


    public void clickGuestListElement() {
        organizeGuestListLink.click();
    }

    public void assertionClickGuestListElement() {
        String expectedResult = "Wedding Checklists, Wedding Planning Checklists | WeddingWire";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }

    public void addGuestLinkElement() throws InterruptedException {
        clickGuestListElement();
        addGuestsLink.click();
        Thread.sleep(5);
        closePopup.click();
    }

    public void assertionAddGuestLinkElement() throws InterruptedException {
        String expectedResult = "Wedding Guest List, Free Guest List Manager Tool | WeddingWire";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }

    public void conciergeClockElement() throws InterruptedException {
        Thread.sleep(5000);
        conciergeBot.click();
        Thread.sleep(5000);
        minimizeConciergeBot.click();
        Thread.sleep(5000);
    }

    public void assertionConciergeClockElement() throws InterruptedException {
        String expectedResult = "Vendor Manager - WeddingWire.com";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }

    public void buttonAndPopupELement() throws InterruptedException {
        userLogin();
        Thread.sleep(5000);
        addPhotographerButton.click();
        Thread.sleep(5000);
        handlePopupButton.click();
    }

    public void assertionButtonAndPopupELement() throws InterruptedException {
        String expectedResult = "Wedding Planner - WeddingWire.com";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }

    public void photographerSearchELement() throws InterruptedException {
        userLogin();
        Thread.sleep(5000);
        addPhotographerButton.click();
        Thread.sleep(5000);
        photographerSearchBar.sendKeys("HMPhotoshoots");
        Thread.sleep(5000);
        photographerSearchSelection.click();
        Thread.sleep(5000);
        savePhotographerSelection.click();
        Thread.sleep(5000);
    }

    public void assertionPhotographerSearchELement() throws InterruptedException {
        String expectedResult = "Vendor Manager - WeddingWire.com";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }

    public void favoriteButtonELement() throws InterruptedException {
        userLogin();
        Thread.sleep(5000);
        addPhotographerButton.click();
        Thread.sleep(5000);
        photographerSearchBar.sendKeys("HMPhotoshoots");
        Thread.sleep(5000);
        photographerSearchSelection.click();
        Thread.sleep(5000);
        savePhotographerSelection.click();
        Thread.sleep(5000);
        favoriteButtonHeart.click();
        Thread.sleep(5000);
        viewFavoritePhotographerClick.click();
        Thread.sleep(5000);
        removeFavoritePhotographerClick.click();
        Thread.sleep(5000);
    }

    public void assertionFavoriteButtonELement() throws InterruptedException {
        String expectedResult = "Vendor Manager - WeddingWire.com";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }

    public void profileViewELement() throws InterruptedException {
        userLogin();
        Thread.sleep(5000);
        profileClick.click();
        Thread.sleep(5000);
        profileLinkClick.click();
        Thread.sleep(5000);
        exitProfilePopup.click();
        Thread.sleep(5000);
    }

    public void assertionProfileViewELement() throws InterruptedException {
        String expectedResult = "Pippa | Weddingwire";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }

    public void viewMailboxELement() throws InterruptedException {
        userLogin();
        Thread.sleep(5000);
        mailEnvelope.click();
        Thread.sleep(5000);
    }

    public void assertionViewMailboxELement() throws InterruptedException {
        String expectedResult = "Weddings, Wedding - WeddingWire.com";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }

    public void viewSettingsELement() throws InterruptedException {
        userLogin();
        Thread.sleep(5000);
        profileClickButton.click();
        Thread.sleep(5000);
        settingsClickButton.click();
        Thread.sleep(5000);
        userInformationLink.click();
        Thread.sleep(5000);
        navigateBack();
        Thread.sleep(5000);
    }

    public void assertionViewSettingsELement() throws InterruptedException {
        String expectedResult = "Weddings, Wedding - WeddingWire.com";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }

    public void viewNotificationELement() throws InterruptedException {
        userLogin();
        Thread.sleep(5000);
        profileClickButton.click();
        Thread.sleep(5000);
        settingsClickButton.click();
        Thread.sleep(5000);
        notificationLink.click();
        Thread.sleep(5000);
        notificationPeferenceCheckbox.click();
        Thread.sleep(5000);
        saveNotificationChangesButton.click();
        Thread.sleep(5000);
    }

    public void clickShopLinkELement() throws InterruptedException {
        Thread.sleep(5000);
        clickShopLink.click();
        Thread.sleep(5000);
    }

    public void assertionClickShopLinkELement() throws InterruptedException {
        String expectedResult = "Unique Favors, Beautiful Centerpieces, Fabulous New Collections, Accessories that are Truly Unforgettable - The WeddingWire Shop";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed Result Not Match");
    }
}
