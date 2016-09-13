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

    @When("^Bob sends me a message$")
    public void bob_sends_me_a_message() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should receive a notification showing the first 30 characters$")
    public void i_should_receive_a_notification_showing_the_first_30_characters() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be informed: \"([^\"]*)\"$")
    public void i_should_be_informed_something(String strArg1) throws Throwable {
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

    @And("^it is only text$")
    public void it_is_only_text() throws Throwable {
        throw new PendingException();
    }

    @And("^it has an emoji$")
    public void it_has_an_emoji() throws Throwable {
        throw new PendingException();
    }

    @And("^it should show the emoji$")
    public void it_should_show_the_emoji() throws Throwable {
        throw new PendingException();
    }

    @And("^it contains a location$")
    public void it_contains_a_location() throws Throwable {
        throw new PendingException();
    }

    @And("^I should be able to open it in google maps$")
    public void i_should_be_able_to_open_it_in_google_maps() throws Throwable {
        throw new PendingException();
    }

    @And("^it contains a sound clip$")
    public void it_contains_a_sound_clip() throws Throwable {
        throw new PendingException();
    }

    @And("^I should be able listen to it\.$")
    public void i_should_be_able_listen_to_it() throws Throwable {
        throw new PendingException();
    }

    @And("^I should be able view it\.$")
    public void i_should_be_able_view_it() throws Throwable {
        throw new PendingException();
    }

    @And("^it contains a web link$")
    public void it_contains_a_web_link() throws Throwable {
        throw new PendingException();
    }

    @And("^I should be redirected to it\.$")
    public void i_should_be_redirected_to_it() throws Throwable {
        throw new PendingException();
    }

}