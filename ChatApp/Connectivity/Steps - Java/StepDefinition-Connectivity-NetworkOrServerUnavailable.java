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

    @Given("^the following network options are switched on:$")
    public void the_following_network_options_are_switched_on() throws Throwable {
        throw new PendingException();
    }

    @Given("^I have logged onto the Chat Application$")
    public void i_have_logged_onto_the_chat_application() throws Throwable {
        throw new PendingException();
    }

    @When("^they are switched off$")
    public void they_are_switched_off() throws Throwable {
        throw new PendingException();
    }

    @When("^I walk out of range of either$")
    public void i_walk_out_of_range_of_either() throws Throwable {
        throw new PendingException();
    }

    @When("^the server is unavailable$")
    public void the_server_is_unavailable() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be informed that I'm not connected to the internet$")
    public void i_should_be_informed_that_im_not_connected_to_the_internet() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be informed that the server is unavailable$")
    public void i_should_be_informed_that_the_server_is_unavailable() throws Throwable {
        throw new PendingException();
    }

    @And("^I should check my phone settings$")
    public void i_should_check_my_phone_settings() throws Throwable {
        throw new PendingException();
    }

    @And("^I should retry in a few moments$")
    public void i_should_retry_in_a_few_moments() throws Throwable {
        throw new PendingException();
    }

}