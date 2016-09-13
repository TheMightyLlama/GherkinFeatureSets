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

    @When("^I paste the google maps link$")
    public void i_paste_the_google_maps_link() throws Throwable {
        throw new PendingException();
    }

    @When("^I share it with the ChatApp$")
    public void i_share_it_with_the_chatapp() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should see a thumbnail of the map$")
    public void i_should_see_a_thumbnail_of_the_map() throws Throwable {
        throw new PendingException();
    }

    @And("^I have a contact named: \"([^\"]*)\"$")
    public void i_have_a_contact_named_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I have copied a google maps link$")
    public void i_have_copied_a_google_maps_link() throws Throwable {
        throw new PendingException();
    }

    @And("^I should be redirected to the map when using it$")
    public void i_should_be_redirected_to_the_map_when_using_it() throws Throwable {
        throw new PendingException();
    }

    @And("^\"([^\"]*)\" should see a thumbnail of the map$")
    public void something_should_see_a_thumbnail_of_the_map(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^\"([^\"]*)\" should be redirected to the map when using it$")
    public void something_should_be_redirected_to_the_map_when_using_it(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I have a google maps link$")
    public void i_have_a_google_maps_link() throws Throwable {
        throw new PendingException();
    }

    @And("^I can share it to an app$")
    public void i_can_share_it_to_an_app() throws Throwable {
        throw new PendingException();
    }

    @And("^I share it to my chat with \"([^\"]*)\"$")
    public void i_share_it_to_my_chat_with_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

}