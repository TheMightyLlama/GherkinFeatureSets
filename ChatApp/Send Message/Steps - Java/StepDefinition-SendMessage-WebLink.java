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

    @When("^I send a link to a website$")
    public void i_send_a_link_to_a_website() throws Throwable {
        throw new PendingException();
    }

    @When("^I send a link to a youtube video$")
    public void i_send_a_link_to_a_youtube_video() throws Throwable {
        throw new PendingException();
    }

    @Then("^\"([^\"]*)\" should be able to see the name of the linked page$")
    public void something_should_be_able_to_see_the_name_of_the_linked_page(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^\"([^\"]*)\" should be able to see the name of the youtube video$")
    public void something_should_be_able_to_see_the_name_of_the_youtube_video(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I have a contact named: \"([^\"]*)\"$")
    public void i_have_a_contact_named_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^\"([^\"]*)\" should be able to see a thumbnail of the website$")
    public void something_should_be_able_to_see_a_thumbnail_of_the_website(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^\"([^\"]*)\" should be able to use the link to the website$")
    public void something_should_be_able_to_use_the_link_to_the_website(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I should be able to see the name of the linked page$")
    public void i_should_be_able_to_see_the_name_of_the_linked_page() throws Throwable {
        throw new PendingException();
    }

    @And("^I should be able to see a thumbnail of the website$")
    public void i_should_be_able_to_see_a_thumbnail_of_the_website() throws Throwable {
        throw new PendingException();
    }

    @And("^I should be able to use the link to the website$")
    public void i_should_be_able_to_use_the_link_to_the_website() throws Throwable {
        throw new PendingException();
    }

    @And("^\"([^\"]*)\" should be able to see a thumbnail of the youtube video$")
    public void something_should_be_able_to_see_a_thumbnail_of_the_youtube_video(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^\"([^\"]*)\" should be able to use the link to open the youtube video$")
    public void something_should_be_able_to_use_the_link_to_open_the_youtube_video(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I should be able to see the name of the youtube video$")
    public void i_should_be_able_to_see_the_name_of_the_youtube_video() throws Throwable {
        throw new PendingException();
    }

    @And("^I should be able to see a thumbnail of the youtube video$")
    public void i_should_be_able_to_see_a_thumbnail_of_the_youtube_video() throws Throwable {
        throw new PendingException();
    }

    @And("^I should be able to use the link to the youtube video$")
    public void i_should_be_able_to_use_the_link_to_the_youtube_video() throws Throwable {
        throw new PendingException();
    }

}