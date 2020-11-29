package com.data;

public class DressPageElements {

    // navigate to dress link
    public static final String dressLinkClickLocator = "//body/div[@id='menu']/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]";
    // access dress link dropdown and select Wedding Dresses
    public static final String dressDropdownLinkClickLocator = "//p[contains(text(),'Wedding Dresses')]";
    // Scroll to the Neckline Filter and select Off the Shoulder
    public static final String scrollAndSelectOffShoulderNecklineLocator = "(//body/div[7]/div[1]/div[1]/div[1]/div[1]/ul[3]/ul[1]/li[7]/div[1]";
    // Click the Planning Tools link at the top of the page
    public static final String planningToolsClickLocator = "//body/div[@id='menu']/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]";
    // Select Hash Tag Generator from dropdown
    public static final String HashTagGeneratorFromDropdownLocator = "//span[contains(text(),'Hashtag Generator')]";
    // enter first name
    public static final String enterYourFirstNameLocator = "//input[@name='first_name']";
    // enter last name
    public static final String enterYourLastNameLocator = "//input[@name='last_name']";
    // enter nickname
    public static final String enterYourNicknameLocator = "//input[@name='nickname']";
    // enter partner first name
    public static final String enterPartnerFirstNameLocator = "//input[@name='partner_first_name']";
    // enter partner last name
    public static final String enterPartnerLastNameLocator = "//input[@name='partner_last_name']";
    // enter partner nickname
    public static final String enterPartnerNicknameLocator = "//input[@name='partner_nickname']";
    // enter chosen surname
    public static final String surnameSelectionLocator = "//span[contains(text(),'Your last name')]";
    // click on the calendar
    public static final String weddingDateClickLocator = "//input[@name='wedding_date']";
    // select wedding year
    public static final String calendarYearSelectionLocator = "//span[contains(text(),'2021')]";
    // select wedding month
    public static final String calendarMonthSelectionLocator = "//span[contains(text(),'Jan')]";
    // select wedding day
    public static final String calendarDaySelectionLocator = "//td[contains(text(),'16')]";
    // select location of wedding
    public static final String weddingLocationLocator = "//input[@id='txtStrPoblacion']";
    // select from the dropdown
    public static final String weddingLocationClickLocator = "//input[@id='txtStrPoblacion']";
    // select wedding setting from dropdown
    public static final String settingDropdownClickLocator = "//select[@id='setting']";
    // send Beach to access
    public static final String sendKeysBeachLocator = "//select[@id='setting']";
    // click Beach from dropdown
    public static final String sendKeysBeachClickLocator = "//select[@id='setting']";
    // click the button to Generate Hash Tag
    public static final String clickGenerateHashTagButtonLocator = "//button[contains(text(),'Get your hashtags')]";
}
