package my.package.name

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^I have an account$")
    public void i_have_an_account() throws Throwable {
        throw new PendingException();
    }

    @When("^I attempt to register for online banking$")
    public void i_attempt_to_register_for_online_banking() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be informed: \"([^\"]*)\"$")
    public void i_should_be_informed_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^I am informed: \"([^\"]*)\"$")
    public void i_am_informed_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I have made a request for online banking$")
    public void i_have_made_a_request_for_online_banking() throws Throwable {
        throw new PendingException();
    }

    @And("^I have received a confirmation code by post$")
    public void i_have_received_a_confirmation_code_by_post() throws Throwable {
        throw new PendingException();
    }

    @And("^I have received a one time password by post$")
    public void i_have_received_a_one_time_password_by_post() throws Throwable {
        throw new PendingException();
    }

    @And("^I use the confirmation code: \"([^\"]*)\"$")
    public void i_use_the_confirmation_code_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I use the password: \"([^\"]*)\"$")
    public void i_use_the_password_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I have received one time password by post$")
    public void i_have_received_one_time_password_by_post() throws Throwable {
        throw new PendingException();
    }

    @And("^I have received by post: (.+)$")
    public void i_have_received_by_post(String confirmationcode) throws Throwable {
        throw new PendingException();
    }

}