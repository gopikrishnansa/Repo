package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticePage {

    private String PracticeTitle = "/html/body/div/div/header/div[3]/div[1]/div/div[2]/div/nav/ul/li[2]/a";
    private String testExceptionLink = "/html/body/div/div/section/div/div/article/div[2]/div[2]/div[1]/p/a";

    private WebDriver driver;

    // Constructor to inject the WebDriver
    public PracticePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickPracticeTitle(){
        driver.findElement(By.xpath(PracticeTitle)).click();
    }

    public void clicktestExceptionLink(){
        driver.findElement(By.xpath(testExceptionLink)).click();
    }
}
