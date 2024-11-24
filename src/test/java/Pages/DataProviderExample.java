package Pages;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][]{
                {"user1", "pass1"},
                {"user2", "pass2"},
                {"user3", "pass3"}
        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {
        System.out.println("Username: " + username + ", Password: " + password);
        // Use these parameters with Selenium to test login functionality
    }
}
