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

    @Given("^a user with the username: \"([^\"]*)\"$")
    public void a_user_with_the_username_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Given("^I use the username: \"([^\"]*)\"$")
    public void i_use_the_username_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @When("^I attempt to login$")
    public void i_attempt_to_login() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be given access to the service$")
    public void i_should_be_given_access_to_the_service() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be informed that the password I have entered is incorrect$")
    public void i_should_be_informed_that_the_password_i_have_entered_is_incorrect() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be informed that: \"([^\"]*)\"$")
    public void i_should_be_informed_that_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^a password: \"([^\"]*)\"$")
    public void a_password_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I use the password: \"([^\"]*)\"$")
    public void i_use_the_password_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

}