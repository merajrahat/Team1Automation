package net.slickdealstest;

import com.peoplentech.team1automation.base.TestBase;
import net.slickdeals.pages.InstagramPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class InstagramPageValidation extends TestBase {

    @Test(enabled = false)
    public void validateInstagrampull() {
        InstagramPage instagramPage = PageFactory.initElements(driver, InstagramPage.class);
        instagramPage.seeRelatedInstagramAccountForTheWebsite();
    }
}
