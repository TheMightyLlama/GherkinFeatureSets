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

    @When("^I import contacts from my local address book$")
    public void i_import_contats_from_my_local_address_book() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be able to see them as ChatApp contacts$")
    public void i_should_be_able_to_see_them_as_chatapp_contacts() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should not be able to see them as ChatApp contacts$")
    public void i_should_not_be_able_to_see_them_as_chatapp_contacts() throws Throwable {
        throw new PendingException();
    }

    @And("^my contacts already have ChatApp accounts$")
    public void my_contacts_already_have_chatapp_accounts() throws Throwable {
        throw new PendingException();
    }

    @And("^I should be able to see their account details$")
    public void i_should_be_able_to_see_their_account_details() throws Throwable {
        throw new PendingException();
    }

    @And("^my contacts do not have ChatApp accounts$")
    public void my_contacts_do_not_have_chatapp_accounts() throws Throwable {
        throw new PendingException();
    }

}