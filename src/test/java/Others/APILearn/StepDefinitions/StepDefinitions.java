package Others.APILearn.StepDefinitions;

import io.cucumber.java.en.*;

public class StepDefinitions {

    @Given("the user is on the login page")
    public void userOnLoginPage() {
        System.out.println("User is on the login page");
    }

    @When("the user enters valid credentials")
    public void userEntersCredentials() {
        System.out.println("User enters valid credentials");
    }

    @Then("the user should redirected to the home page")
    public void userIsRedirected() {
        System.out.println("User is redirected to the home page");
    }
}
