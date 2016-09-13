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

    @Given("^I do not have a chat app account$")
    public void i_do_not_have_a_chat_app_account() throws Throwable {
        throw new PendingException();
    }

    @Given("^I have a chat app account$")
    public void i_have_a_chat_app_account() throws Throwable {
        throw new PendingException();
    }

    @When("^I attempt to register with the email address: (.+) $")
    public void i_attempt_to_register_with_the_email_address(String email) throws Throwable {
        throw new PendingException();
    }

    @When("^I attempt to register with the email address: \"([^\"]*)\" $")
    public void i_attempt_to_register_with_the_email_address_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be sent a registration email$")
    public void i_should_be_sent_a_registration_email() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be informed \"([^\"]*)\"$")
    public void i_should_be_informed_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I attempt to register with the password: (.+)$")
    public void i_attempt_to_register_with_the_password(String password) throws Throwable {
        throw new PendingException();
    }

    @And("^I use the email address: \"([^\"]*)\"$")
    public void i_use_the_email_address_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

}