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

    @When("^I select it$")
    public void i_select_it() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be able to see it $")
    public void i_should_be_able_to_see_it() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be informed that it is too large$")
    public void i_should_be_informed_that_it_is_too_large() throws Throwable {
        throw new PendingException();
    }

    @And("^I have a contact named: \"([^\"]*)\"$")
    public void i_have_a_contact_named_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I take a picture with my device camera$")
    public void i_take_a_picture_with_my_device_camera() throws Throwable {
        throw new PendingException();
    }

    @And("^I send it to \"([^\"]*)\"$")
    public void i_send_it_to_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^\"([^\"]*)\" should be able to see it$")
    public void something_should_be_able_to_see_it(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I select a picture from my device gallery$")
    public void i_select_a_picture_from_my_device_gallery() throws Throwable {
        throw new PendingException();
    }

    @And("^I select a picture from my device file system$")
    public void i_select_a_picture_from_my_device_file_system() throws Throwable {
        throw new PendingException();
    }

    @And("^it is an image type$")
    public void it_is_an_image_type() throws Throwable {
        throw new PendingException();
    }

    @And("^it is not an image type$")
    public void it_is_not_an_image_type() throws Throwable {
        throw new PendingException();
    }

    @And("^it is larger than 2MB$")
    public void it_is_larger_than_2mb() throws Throwable {
        throw new PendingException();
    }

    @And("^that it will be scaled to below 2MB$")
    public void that_it_will_be_scaled_to_below_2mb() throws Throwable {
        throw new PendingException();
    }

    @And("^I should be able to see it$")
    public void i_should_be_able_to_see_it() throws Throwable {
        throw new PendingException();
    }

}