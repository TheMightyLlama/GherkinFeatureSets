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

    @When("^Bob sends me a message with an emoji$")
    public void bob_sends_me_a_message_with_an_emoji() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should see the emoji$")
    public void i_should_see_the_emoji() throws Throwable {
        throw new PendingException();
    }

    @And("^I have the ChatApp in the background$")
    public void i_have_the_chatapp_in_the_background() throws Throwable {
        throw new PendingException();
    }

    @And("^Bob is a contact$")
    public void bob_is_a_contact() throws Throwable {
        throw new PendingException();
    }

    @And("^it has an emoji$")
    public void it_has_an_emoji() throws Throwable {
        throw new PendingException();
    }

    @And("^Bob should see the emoji$")
    public void bob_should_see_the_emoji() throws Throwable {
        throw new PendingException();
    }

}