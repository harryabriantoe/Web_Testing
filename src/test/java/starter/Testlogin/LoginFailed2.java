package starter.Testlogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class LoginFailed2 {

    @Steps
    LoginSteps loginSteps;
    @Given("I am on the login Page")
    public void i_am_on_the_login_Page() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        loginSteps.openHomePage();
        loginSteps.openLoginPage();
    }

    @When("I enter invalid username and valid Password")
    public void I_enter_invalid_username_and_valid_Password() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        loginSteps.inputAccountInvalid2();
    }

    @When("I Click {string} Button")
    public void i_Click_Button(String string) {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        //  loginSteps.clickLogin2();
    }

    @Then("I Cannot go to the dashboard")
    public void I_cannot_go_to_the_dashboard() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }









}
