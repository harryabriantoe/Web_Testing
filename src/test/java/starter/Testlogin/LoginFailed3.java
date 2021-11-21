package starter.Testlogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class LoginFailed3 {

    @Steps
    LoginSteps loginSteps;
    @Given("I am on the Login Page")
    public void I_am_on_the_Login_Page() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        loginSteps.openHomePage();
        loginSteps.openLoginPage();
    }

    @When("I enter invalid username and invalid Password")
    public void I_enter_invalid_username_and_invalid_Password() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        loginSteps.inputAccountInvalid3();
    }

    @When("i Click {string} Button")
    public void i_Click_Button(String string) {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        //  loginSteps.clickLogin2();
    }

    @Then("I Cannot go to the Dashboard")
    public void I_cannot_go_to_the_Dashboard() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }









}
