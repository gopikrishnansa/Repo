package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private static WebDriver driver;

    // Public static method to set up and return WebDriver instance
    public static WebDriver setup() {
        if (driver == null) {
            // Initialize ChromeDriver
            driver = new ChromeDriver();

            // Optional configurations
            driver.manage().window().maximize();

            // Navigate to the initial URL
            driver.get("https://practicetestautomation.com/practice-test-login/");
        }
        return driver;
    }

    // Method to clean up resources
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}