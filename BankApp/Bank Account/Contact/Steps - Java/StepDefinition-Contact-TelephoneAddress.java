package my.package.name

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^the following users:$")
    public void the_following_users() throws Throwable {
        throw new PendingException();
    }

    @Given("^I am logged in as: (.+)$")
    public void i_am_logged_in_as(String username) throws Throwable {
        throw new PendingException();
    }

    @When("^I edit my telephone address with the number: (.+)$")
    public void i_edit_my_telephone_address_with_the_number(String number) throws Throwable {
        throw new PendingException();
    }

    @When("^I edit my telephone address with the details:$")
    public void i_edit_my_telephone_address_with_the_details() throws Throwable {
        throw new PendingException();
    }

    @Then("^I am able to save it$")
    public void i_am_able_to_save_it() throws Throwable {
        throw new PendingException();
    }

    @Then("^I am informed: \"([^\"]*)\"$")
    public void i_am_informed_something(List<String> list1) throws Throwable {
        throw new PendingException();
    }

    @And("^I have stated my telephone address as being in: (.+)$")
    public void i_have_stated_my_telephone_address_as_being_in(String country) throws Throwable {
        throw new PendingException();
    }

    @And("^my country has the international dialling code: (.+)$")
    public void my_country_has_the_international_dialling_code(String code) throws Throwable {
        throw new PendingException();
    }

    @And("^the bank can call me at: \"([^\"]*)\"$")
    public void the_bank_can_call_me_at_something(String code, String number, String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I have stated my telephone addres as being in: (.+)$")
    public void i_have_stated_my_telephone_addres_as_being_in(String country) throws Throwable {
        throw new PendingException();
    }

}