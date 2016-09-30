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

    @Given("^the following users:$")
    public void the_following_users() throws Throwable {
        throw new PendingException();
    }

    @Given("^I am logged in as: (.+)$")
    public void i_am_logged_in_as(String username) throws Throwable {
        throw new PendingException();
    }

    @When("^I edit my email address to: (.+)$")
    public void i_edit_my_email_address_to(String email) throws Throwable {
        throw new PendingException();
    }

    @When("^I attempt to save it$")
    public void i_attempt_to_save_it() throws Throwable {
        throw new PendingException();
    }

    @Then("^I am able to save it$")
    public void i_am_able_to_save_it() throws Throwable {
        throw new PendingException();
    }

    @Then("^I am not able to save it$")
    public void i_am_not_able_to_save_it() throws Throwable {
        throw new PendingException();
    }

    @Then("^I am informed: \"([^\"]*)\"$")
    public void i_am_informed_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^the bank can send me emails at: (.+)$")
    public void the_bank_can_send_me_emails_at(String email) throws Throwable {
        throw new PendingException();
    }

    @And("^I am informed: \"([^\"]*)\"$")
    public void i_am_informed_something(List<String> list1) throws Throwable {
        throw new PendingException();
    }

    @And("^I have set my email address as empty$")
    public void i_have_set_my_email_address_as_empty() throws Throwable {
        throw new PendingException();
    }

}