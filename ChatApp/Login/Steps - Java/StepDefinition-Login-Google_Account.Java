package my.package.name

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^a user with the username: \"([^\"]*)\"$")
    public void a_user_with_the_username_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Given("^I am logged into a (.+)$")
    public void i_am_logged_into_a(String googleservice) throws Throwable {
        throw new PendingException();
    }

    @Given("^I am not logged into a google service$")
    public void i_am_not_logged_into_a_google_service() throws Throwable {
        throw new PendingException();
    }

    @When("^I attempt to login with google authentication$")
    public void i_attempt_to_login_with_google_authentication() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be given access to the ChatApp services$")
    public void i_should_be_given_access_to_the_chatapp_services() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be informed: \"([^\"]*)\"$")
    public void i_should_be_informed_something(List<String> list1) throws Throwable {
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

    @And("^I use the email address: \"([^\"]*)\"$")
    public void i_use_the_email_address_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

}