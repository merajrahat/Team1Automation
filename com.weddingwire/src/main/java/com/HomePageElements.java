package com;

public class HomePageElements {

     // click join button
     public static final String clickOnJoinButtonLocator = "//a[contains(text(),'Join now')]";
     // enter valid name
     public static final String sendValidNameLocator = "//input[@name='NombreCompleto']";
     // enter valid email
     public static final String sendValidEmailLocator = "//body/div[2]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]"; // had no choice here, bruh
     // enter valid password
     public static final String sendValidPasswordLocator = "//input[@name='Password']";
     // click on venue and send text
     public static final String sendValidVenueLocator = "//input[@id='txtStrPoblacion']";
     // access dropdown and select
     public static final String sendValidVenueDropdownLocator = "///li[@class='suggest-navigation suggest-item-navigation-1']";
     // access calendar box
     public static final String clickWeddingDateBoxLocator = "Fecha";
     // click on calendar dropdown
     public static final String clickCalendarLocator = "//input[@name='Fecha']";
     // select wedding year
     public static final String clickYearLocator = "(//span[@class='year'])[6]";
     // select wedding month
     public static final String clickMonthLocator = "//span[contains(text(),'Jun')]";
     // select wedding day
     public static final String clickDayLocator = "(//td[@class='day '])[11]";
     // click sign up button
     public static final String clickSignUpButtonLocator = "//button[contains(text(),'Sign up')]";
     // clear the search bar for setting
     public static final String clearSearchBarLocator = "//input[@id='txtStrSearch']";
     // enter waterfront for setting in search bar
     public static final String enterTextInSearchBarLocator = "//input[@id='txtStrSearch']";
     // clear the location search bar
     public static final String clearAgainInSearchBarLocator = "//input[@aria-label='NEAR city or region']";
     // enter destination in location search bar
     public static final String enterTextAgainInSearchBarLocator = "//input[@aria-label='NEAR city or region']";
     // click search button
     public static final String clickSearchButtonLocator = "//input[@id='mainSearchBtn']";
     // click the down arrow to see more options
     public static final String clickDownArrowButtonLocator = "//body/div[7]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/i[1]/*[1]"; // no other option
     // select view more button
     public static final String clickViewMoreButtonLocator = "(//span[contains(text(),'View More')])[1]";
     // select Beach Wedding
     public static final String clickBeachWeddingLocator = "//span[contains(text(),'Beach Weddings')]";
     // view the image options for directory
     public static final String clickImageViewLocator = "//li[@class='app-directory-filters-change-mode']";
     // click login button
     public static final String loginLocator = "//a[contains(text(),'Log in')]";
     // enter login email
     public static final String loginEmailLocator = "//input[@id='Mail']";
     // enter login password
     public static final String loginPasswordLocator = "//input[@id='Password']";
     // click on login button
     public static final String clickLoginLocator = "//button[contains(text(),'Log in')]";
     // click on checklist link
     public static final String clickChecklistLocator = "(//li[@class='pure-u-1-8'])[2]";
     // click on dropdown to see options
     public static final String dropdownToolsLocator = "(//li[@class='nav-main-item'])[1]";
     // select on dropdown to select from tools
     public static final String dropdownToolsOptionLocator = "(//li[@class='pure-u-1-3'])[2]";
     // click on header banner link
     public static final String headerBannerLocator = "//a[contains(text(),'keep moving forward')]";
     // return navigate to previous page
     public static final String returnNavigationLocator = "//a[contains(text(),'Start Planning')]";
     // Scroll to Nondiscrimination
     public static final String elementScrollLocator = "//a[contains(text(),'Nondiscrimination')]";
     // find Wedding Dress Gallery on page
     public static final String findVisibleTextLocator = "//h3[contains(text(),'Wedding Dress Gallery')]";
     // click organize guest list link
     public static final String organizeGuestListLinkLocator = "//span[contains(text(),'Organize your Guest List')]";
     // click add guests link
     public static final String addGuestsLinkLocator = "//p[contains(text(),'Add your guests')]";
     // handle guest list popup
     public static final String closePopupLocator = "//button[contains(text(),'×')]";
     // click on concierge bot chat
     public static final String conciergeBotLocator = "//body/div[@id='app-chat-container']/div[@id='app-bot-bot']/div[1]/div[1]/img[1]"; // no other option
     // minimize the concierge bot chat
     public static final String minimizeConciergeBotLocator = "//body/div[@id='app-chat-container']/div[@id='app-bot-bot']/div[2]/div[1]/div[3]/span[1]/span[1]"; // no other option
     // click add photographer button
     public static final String addPhotographerButtonLocator = "//body/div[6]/div[4]/div[3]/div[1]/figure[1]/span[1]"; // no other option
     // handle popup for adding photographer
     public static final String handlePopupButtonLocator = "//body/div[@id='app-common-layer']/div[1]/div[1]/div[1]/button[1]/i[1]/*[1]"; // no other option
     // search for photographer by name
     public static final String photographerSearchBarLocator = "//input[@id='app-suggest-vendor-text-input']";
     // select photographer from search bar
     public static final String photographerSearchSelectionLocator = "//li[@data-id='772935']";
     // save photographer vendor
     public static final String savePhotographerSelectionLocator = "//button[contains(text(),'Save vendor')]";
     // navigate to favorites
     public static final String favoriteButtonHeartLocator = "//body/div[@id='menu']/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]/i[1]"; // no other option
     // view favorite photographer
     public static final String viewFavoritePhotographerClickLocator = "//span[contains(text(),'Photography')]";
     // remove favorite photographer
     public static final String removeFavoritePhotographerClickLocator = "//body/div[5]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/figure[1]/i[1]";
     // select profile dropdown
     public static final String profileClickLocator = "//body/div[@id='menu']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]";
     // click profile link
     public static final String profileLinkClickLocator = "//body/div[@id='menu']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/a[1]";
     // click x to leave popup
     public static final String exitProfilePopupLocator = "//button[contains(text(),'×')]";
     // click on mail envelope
     public static final String mailEnvelopeLocator = "//body/div[@id='menu']/div[1]/div[1]/div[1]/div[2]/div[2]/a[2]/i[1]/*[1]";
     // click on profile
     public static final String profileClickButtonLocator = "//body/div[@id='menu']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]";
     // click on settings
     public static final String settingsClickButtonLocator = "//body/div[@id='menu']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/a[1]";
     // click on user information
     public static final String userInformationLinkLocator = "//a[contains(text(),'User Information')]";
     // click on notifications link
     public static final String notificationLinkLocator = "//a[contains(text(),'Notifications')]";
     // update preference checkbox
     public static final String notificationPeferenceCheckboxLocator = "//body/div[5]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/label[1]/input[1]";
     // click save notification setting button
     public static final String saveNotificationChangesButtonLocator = "//button[contains(text(),'Save changes')]";
     // click Shop link
     public static final String clickShopLinkLocator = "//span[contains(text(),'Shop')]";
     // sign up, one last step
     public static final String validateSignUpLocator = "//p[contains(text(),'One last step!')]";


}
