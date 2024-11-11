package TestCases;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.PracticePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageVerification {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        // Initialize WebDriver once before each test
        driver = BaseTest.setup(driver);  // BaseTest now returns the driver instance
    }

    @Test
    public void loginVerification(){
        // Use the same driver instance in LoginPage
        LoginPage page = new LoginPage(driver);
        page.enterUserName("Userrr");
        page.enterPassWord("Passssworddd");
        PracticePage Ppage = new PracticePage(driver);
        Ppage.clickPracticeTitle();
        Ppage.clicktestExceptionLink();
        //page.clickSubmit();
    }
}
