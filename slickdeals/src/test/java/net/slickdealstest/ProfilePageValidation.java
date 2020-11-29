package net.slickdealstest;

import com.peoplentech.team1automation.base.TestBase;
import net.slickdeals.pages.ProfilePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ProfilePageValidation extends TestBase {

    @Test(enabled = false)
    public void validateLoggedInUserAbleToResetPassword() {
        ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
        profilePage.userAbleToResetPassword();
    }
}
