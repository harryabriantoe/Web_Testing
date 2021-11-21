package starter.Testlogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class LoginFailed1 {

    @Steps
    LoginSteps loginSteps;
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        loginSteps.openHomePage();
        loginSteps.openLoginPage();
    }

    @When("I enter valid username and invalid Password")
    public void I_enter_valid_username_and_invalid_Password() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        loginSteps.inputAccountInvalid1();
    }

    @When("I Click {string} button")
    public void i_Click_button(String string) {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        //  loginSteps.clickLogin2();
    }

    @Then("I cannot go to the dashboard")
    public void I_cannot_go_to_the_dashboard() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }









}
