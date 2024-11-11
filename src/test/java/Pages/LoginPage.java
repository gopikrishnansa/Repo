package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    // Elements
    private String UserNameTextArea = "//*[@id=\"username\"]";
    private String PassWordTextArea = "//*[@id=\"password\"]";
    private String SubmitButton = "//*[@id=\"submit\"]";

    private WebDriver driver;

    // Constructor to inject the WebDriver
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String username){
        driver.findElement(By.xpath(UserNameTextArea)).sendKeys(username);
    }

    public void enterPassWord(String password){
        driver.findElement(By.xpath(PassWordTextArea)).sendKeys(password);
    }

    public void clickSubmit(){
        driver.findElement(By.xpath(SubmitButton)).click();
    }
}
