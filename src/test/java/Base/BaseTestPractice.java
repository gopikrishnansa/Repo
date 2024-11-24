package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestPractice {
    private static WebDriver driver;
    public static WebDriver setup(){
        if(driver == null){
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quit(){
            driver.quit();
    }

}
