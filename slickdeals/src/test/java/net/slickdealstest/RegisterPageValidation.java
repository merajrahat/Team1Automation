package net.slickdealstest;

import com.peoplentech.team1automation.base.TestBase;
import net.slickdeals.pages.RegisterPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RegisterPageValidation extends TestBase{

    @Test (enabled = false)
    public void validateClickOnLogInClickCreateAnAccount(){
        RegisterPage registerPage = PageFactory.initElements(driver,RegisterPage.class);
        registerPage.setCreatAnAccount();
        sleepFor(2);
        registerPage.setTypeEmail();
        sleepFor(2);
    }
}
