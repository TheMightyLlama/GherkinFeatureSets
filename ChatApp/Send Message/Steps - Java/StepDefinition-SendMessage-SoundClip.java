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

    @When("^I record a clip$")
    public void i_record_a_clip() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be able to listen to it$")
    public void i_should_be_able_to_listen_to_it() throws Throwable {
        throw new PendingException();
    }

    @Then("^the clip should be sent immediately to \"([^\"]*)\"$")
    public void the_clip_should_be_sent_immediately_to_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I have a contact named: \"([^\"]*)\"$")
    public void i_have_a_contact_named_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I send it to \"([^\"]*)\"$")
    public void i_send_it_to_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^\"([^\"]*)\" should be able to listen to it$")
    public void something_should_be_able_to_listen_to_it(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I attempt to record more than 1 minute of audio$")
    public void i_attempt_to_record_more_than_1_minute_of_audio() throws Throwable {
        throw new PendingException();
    }

    @And("^I should be able to listen to it$")
    public void i_should_be_able_to_listen_to_it() throws Throwable {
        throw new PendingException();
    }

}