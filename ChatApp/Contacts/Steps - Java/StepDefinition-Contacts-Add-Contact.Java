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

    @When("^I am sent a message from someone$")
    public void i_am_sent_a_message_from_someone() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be able to add them to my local address book$")
    public void i_should_be_able_to_add_them_to_my_local_address_book() throws Throwable {
        throw new PendingException();
    }

    @And("^I do no have their contact details$")
    public void i_do_no_have_their_contact_details() throws Throwable {
        throw new PendingException();
    }

}