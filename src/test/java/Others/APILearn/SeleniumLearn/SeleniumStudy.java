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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumStudy {
    @Test
    public void select(){
        WebDriver driver = new ChromeDriver();
        WebElement list = driver.findElement(By.id("test"));
        Select select = new Select(list);
        select.selectByValue("value1");

        Actions action = new Actions(driver);
        action.clickAndHold(list);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(list));

        driver.manage().window().maximize();

    }
}
