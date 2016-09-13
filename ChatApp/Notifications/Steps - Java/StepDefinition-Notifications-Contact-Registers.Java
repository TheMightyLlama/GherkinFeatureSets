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

    @When("^they register an account with the number 555\-1234$")
    public void they_register_an_account_with_the_number_5551234() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should receive a notification saying: \"([^\"]*)\"$")
    public void i_should_receive_a_notification_saying_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I have a contact with the details:$")
    public void i_have_a_contact_with_the_details() throws Throwable {
        throw new PendingException();
    }

}