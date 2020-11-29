package net.slickdealstest;

import com.peoplentech.team1automation.base.TestBase;
import net.slickdeals.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageValidations extends TestBase {

    @Test(enabled = false)
    public void validateUserAbleToLogin() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.userAbleToLogIn();
    }

    @Test(enabled = false)
    public void validateUserAbleToLogOutAfterLogIn() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.userAbleToLogOutAfterLogIn();
    }
}
