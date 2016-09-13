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

    @When("^I record a video clip$")
    public void i_record_a_video_clip() throws Throwable {
        throw new PendingException();
    }

    @When("^it is over 2MB in size$")
    public void it_is_over_2mb_in_size() throws Throwable {
        throw new PendingException();
    }

    @When("^I select a video clip from my device gallery$")
    public void i_select_a_video_clip_from_my_device_gallery() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be able to view a thumbnail of the video clip$")
    public void i_should_be_able_to_view_a_thumbnail_of_the_video_clip() throws Throwable {
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

    @And("^\"([^\"]*)\" should be able to view the video clip$")
    public void something_should_be_able_to_view_the_video_clip(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I record a video clip$")
    public void i_record_a_video_clip() throws Throwable {
        throw new PendingException();
    }

    @And("^I should be able to view a thumbnail of the video clip$")
    public void i_should_be_able_to_view_a_thumbnail_of_the_video_clip() throws Throwable {
        throw new PendingException();
    }

    @And("^I select a video clip from my device gallery$")
    public void i_select_a_video_clip_from_my_device_gallery() throws Throwable {
        throw new PendingException();
    }

}