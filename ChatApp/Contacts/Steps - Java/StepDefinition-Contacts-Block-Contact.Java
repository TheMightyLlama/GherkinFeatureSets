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

    @When("^I choose to block them$")
    public void i_choose_to_block_them() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should not receive messages from them$")
    public void i_should_not_receive_messages_from_them() throws Throwable {
        throw new PendingException();
    }

    @And("^I am linked with a contact$")
    public void i_am_linked_with_a_contact() throws Throwable {
        throw new PendingException();
    }

    @And("^they should not be able to send messages to me$")
    public void they_should_not_be_able_to_send_messages_to_me() throws Throwable {
        throw new PendingException();
    }

    @And("^I should not be able to send messages to them$")
    public void i_should_not_be_able_to_send_messages_to_them() throws Throwable {
        throw new PendingException();
    }

}