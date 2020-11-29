package net.slickdeals.pages;

import com.peoplentech.team1automation.base.TestBase;
import com.peoplentech.team1automation.extent.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends TestBase {
    private static org.apache.log4j.Logger LOGGER = Logger.getLogger(RegisterPage.class);


    @FindBy(linkText = "Sign Up")
    private WebElement creatAnAccount;

    @FindBy(id = "email")
    private WebElement typeEmail;

    public void setCreatAnAccount() {

        creatAnAccount.click();
        ExtentTestManager.log("Able to click on create account");
    }

    public void setTypeEmail() {

        typeEmail.sendKeys("merajrahaslfsafdasdassaf@yahoo.com", Keys.RETURN);
        ExtentTestManager.log("User write email and press enter");

        //https://slickdeals.net/forums/registration/process_registration.php?do=sent&e=bWVyYWpyYWhhdGE2ODQ2c2xmc2FmZGFzZGFzc2FmQHlhaG9vLmNvbQ%3D%3D

       /* String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://slickdeals.net/forums/registration/process_registration.php";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the url is correct");*/
    }
}
