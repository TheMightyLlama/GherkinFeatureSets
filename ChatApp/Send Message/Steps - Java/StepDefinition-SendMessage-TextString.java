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

    @Given("^a user \"([^\"]*)\"$")
    public void a_user_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Given("^I am logged in as \"([^\"]*)\"$")
    public void i_am_logged_in_as_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @When("^I post the Text String (.+)$")
    public void i_post_the_text_string(String string) throws Throwable {
        throw new PendingException();
    }

    @Then("^I should see the Text String (.+)$")
    public void i_should_see_the_text_string(String string) throws Throwable {
        throw new PendingException();
    }

    @And("^a user \"([^\"]*)\"$")
    public void a_user_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^\"([^\"]*)\" should see the Text String (.+)$")
    public void something_should_see_the_text_string(String string, String strArg1) throws Throwable {
        throw new PendingException();
    }

}