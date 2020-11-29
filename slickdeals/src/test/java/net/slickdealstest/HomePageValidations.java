package net.slickdealstest;


import com.peoplentech.team1automation.base.TestBase;
import net.slickdeals.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {


    @Test(enabled = false)
    public void validateSelectAutoOnlyOnAmazon() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.setClickOnAuto();
        sleepFor(2);
        homePage.setPickAmaonOnly();
        sleepFor(5);
    }

    @Test(enabled = false)
    public void validateUserCanChooseATvFromBestBuy() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.setChooseTvFromBestBuy();

    }

    @Test(enabled = false)
    public void validateUserCanFindNamesOfTheManagementTeamOfTheWebsite() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.setFindNamesOfTheManagementTeamOfTheWebsite();
    }

    @Test(enabled = false)
    public void validateUserCanFindWhatBenefitsEmployeesGet() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.findWhatBenefitsEmployeesGet();
    }

    @Test(enabled = false)
    public void validateUserCanFindTheirFeaturedDealCategories() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.findTheirFeaturedDealCategories();
    }

    @Test(enabled = false)
    public void validateUserCantellTheSiteToPressOnEnterInsteadOfPressingSearchIcon() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.tellTheSiteToPressOnEnterInsteadOfPressingSearchIcon();
    }

    @Test(enabled = false)
    public void validateIfTheBrowserGoesOnePageBack() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.seeIfTheBrowserGoesOnePageBack();
    }

    @Test(enabled = false)
    public void validateIfTheBrowserGoesForwardAfterGoingBackward() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.seeIfTheBrowserGoesForwardAfterGoingBackward();
    }

    @Test(enabled = false)
    public void validateIfThePageRefreshProperlyAfterSearchingAnTiem() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.seeIfThePageRefreshProperlyAfterSearchingAnTiem();
    }

    @Test(enabled = false)
    public void validateUserAbleToChooseTheNextPageFromSearchItemPage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.userAbleToChooseTheSecondPageFromSearchItemPage();
    }

    @Test(enabled = false)
    public void validateUserAbleToChooseAPriceRangeForLaptop() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.userAbleToChooseAPriceRangeForLaptop();
    }
}