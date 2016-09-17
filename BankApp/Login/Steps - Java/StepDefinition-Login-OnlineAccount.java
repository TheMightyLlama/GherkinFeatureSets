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

    @Given("^a user with the credentials: $")
    public void a_user_with_the_credentials() throws Throwable {
        throw new PendingException();
    }

    @Given("^I am not logged into the BankApp$")
    public void i_am_not_logged_into_the_bankapp() throws Throwable {
        throw new PendingException();
    }

    @When("^I attempt to login as: \"([^\"]*)\"$")
    public void i_attempt_to_login_as_something(String strArg1) throws Throwable {
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

    @And("^I use the password: \"([^\"]*)\"$")
    public void i_use_the_password_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I use the username: \"([^\"]*)\"$")
    public void i_use_the_username_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I should be prompted: \"([^\"]*)\"$")
    public void i_should_be_prompted_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I attempt to login$")
    public void i_attempt_to_login() throws Throwable {
        throw new PendingException();
    }

    @And("^I should be informed that my account has been locked$")
    public void i_should_be_informed_that_my_account_has_been_locked() throws Throwable {
        throw new PendingException();
    }

    @And("^I should be informed: \"([^\"]*)\"$")
    public void i_should_be_informed_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

}