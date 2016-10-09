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

    @When("^I view my statement$")
    public void i_view_my_statement() throws Throwable {
        throw new PendingException();
    }

    @When("^I make a transaction$")
    public void i_make_a_transaction() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be informed: \"([^\"]*)\"$")
    public void i_should_be_informed_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be able to see the ID of the transaction, the (.+), the (.+) and (.+)$")
    public void i_should_be_able_to_see_the_id_of_the_transaction_the_the_and(String type, String value, String balance) throws Throwable {
        throw new PendingException();
    }

    @And("^I have not made any transactions or transfers against my account$")
    public void i_have_not_made_any_transactions_or_transfers_against_my_account() throws Throwable {
        throw new PendingException();
    }

    @And("^my balance is: £1000\.00$")
    public void my_balance_is_100000() throws Throwable {
        throw new PendingException();
    }

    @And("^the transaction or transfer of type: (.+)$")
    public void the_transaction_or_transfer_of_type(String type) throws Throwable {
        throw new PendingException();
    }

    @And("^the transaction is for: (.+)$")
    public void the_transaction_is_for(String value) throws Throwable {
        throw new PendingException();
    }

}