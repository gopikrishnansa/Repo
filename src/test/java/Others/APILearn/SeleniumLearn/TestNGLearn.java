package Others.APILearn.SeleniumLearn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class TestNGLearn {

    @Test
    @Parameters({"UserName", "Password"})
    public void SecondPrintFromTestNG(String UserName, String Password) throws InterruptedException {


            System.out.println("UserName is from function: " + UserName+ Thread.currentThread().threadId());
            Assert.assertEquals(UserName, "Gopi", "UserName parameter does not match expected value.");
            System.out.println("Password is from function: " + Password + Thread.currentThread().threadId());
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(4000000);

    }

}
