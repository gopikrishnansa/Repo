package Others.SeleniumLearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGLearn2 {
    @Test
    public void testNGtest2() throws InterruptedException {

            System.out.println("test for second"+ Thread.currentThread().threadId());
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/watch?v=1Y6knVutUsI");
        Thread.sleep(4000000);

    }
}
