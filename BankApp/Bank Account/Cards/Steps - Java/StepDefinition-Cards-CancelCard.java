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

    @Given("^the following user:$")
    public void the_following_user() throws Throwable {
        throw new PendingException();
    }

    @Given("^I am logged in as Bob$")
    public void i_am_logged_in_as_bob() throws Throwable {
        throw new PendingException();
    }

    @When("^I cancel the card$")
    public void i_cancel_the_card() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be informed: \"([^\"]*)\"$")
    public void i_should_be_informed_something(List<String> list1) throws Throwable {
        throw new PendingException();
    }

    @And("^I have requested a cards against my account$")
    public void i_have_requested_a_cards_against_my_account() throws Throwable {
        throw new PendingException();
    }

    @And("^I should be able to see my cards number$")
    public void i_should_be_able_to_see_my_cards_number() throws Throwable {
        throw new PendingException();
    }

    @And("^I should be able to see my cards expiry date$")
    public void i_should_be_able_to_see_my_cards_expiry_date() throws Throwable {
        throw new PendingException();
    }

    @And("^I should be able to see my cards status has been set to \"([^\"]*)\"$")
    public void i_should_be_able_to_see_my_cards_status_has_been_set_to_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

}