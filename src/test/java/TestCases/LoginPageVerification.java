package TestCases;

import Base.BaseTest;
import Base.ExcelUtils;
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
        driver = BaseTest.setup();  // BaseTest now returns the driver instance
    }

    @Test
    public void loginVerification(){
        // Use the same driver instance in LoginPage
        LoginPage page = new LoginPage(driver);
        ExcelUtils excelData = new ExcelUtils("/home/gopikrishnan/Untitled 1.xltx","Sheet1");
        String userName = excelData.getCellData(0,0);
        String password = excelData.getCellData(0,1);
        System.out.println(userName);
        page.enterUserName(userName);
        page.enterPassWord(password);
        PracticePage Ppage = new PracticePage(driver);
        Ppage.clickPracticeTitle();
        Ppage.clicktestExceptionLink();
        //page.clickSubmit();
    }
}
