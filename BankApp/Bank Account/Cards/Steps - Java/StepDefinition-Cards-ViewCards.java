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

    @Given("^the following user:$")
    public void the_following_user() throws Throwable {
        throw new PendingException();
    }

    @Given("^I am logged in as Bob$")
    public void i_am_logged_in_as_bob() throws Throwable {
        throw new PendingException();
    }

    @When("^I view my active cards$")
    public void i_view_my_active_cards() throws Throwable {
        throw new PendingException();
    }

    @When("^I view my cards$")
    public void i_view_my_cards() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be informed: \"([^\"]*)\"$")
    public void i_should_be_informed_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be able to see the following cards:$")
    public void i_should_be_able_to_see_the_following_cards() throws Throwable {
        throw new PendingException();
    }

    @And("^I have not requested any cards against my account$")
    public void i_have_not_requested_any_cards_against_my_account() throws Throwable {
        throw new PendingException();
    }

    @And("^I have requested cards against my account$")
    public void i_have_requested_cards_against_my_account() throws Throwable {
        throw new PendingException();
    }

    @And("^I have cancelled the card: 12345678901$")
    public void i_have_cancelled_the_card_12345678901() throws Throwable {
        throw new PendingException();
    }

    @And("^todays date is: 11\/09\/2020$")
    public void todays_date_is_11092020() throws Throwable {
        throw new PendingException();
    }

}