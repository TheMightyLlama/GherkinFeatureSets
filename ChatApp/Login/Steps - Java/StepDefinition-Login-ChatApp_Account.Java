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

    @Given("^a user with the username \"([^\"]*)\"$")
    public void a_user_with_the_username_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Given("^I am not logged into the ChatApp$")
    public void i_am_not_logged_into_the_chatapp() throws Throwable {
        throw new PendingException();
    }

    @When("^I attempt to login$")
    public void i_attempt_to_login() throws Throwable {
        throw new PendingException();
    }

    @When("^I attempt the login 3 times$")
    public void i_attempt_the_login_3_times() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be given access to the service$")
    public void i_should_be_given_access_to_the_service() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be informed: \"([^\"]*)\"$")
    public void i_should_be_informed_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^I am informed that the username I am attempting has not been registered$")
    public void i_am_informed_that_the_username_i_am_attempting_has_not_been_registered() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be informed that I have made too many attempts$")
    public void i_should_be_informed_that_i_have_made_too_many_attempts() throws Throwable {
        throw new PendingException();
    }

    @And("^a password \"([^\"]*)\"$")
    public void a_password_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I use the email address: \"([^\"]*)\"$")
    public void i_use_the_email_address_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I use the password: \"([^\"]*)\"$")
    public void i_use_the_password_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I should be prompted to register with (.+)$")
    public void i_should_be_prompted_to_register_with(String email) throws Throwable {
        throw new PendingException();
    }

    @And("^I attempt to login$")
    public void i_attempt_to_login() throws Throwable {
        throw new PendingException();
    }

    @And("^I should be informed that I can only attempt to login from my ip after five minutes$")
    public void i_should_be_informed_that_i_can_only_attempt_to_login_from_my_ip_after_five_minutes() throws Throwable {
        throw new PendingException();
    }

}