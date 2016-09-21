package my.package.name

import cucumber.api.PendingException;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(Cucumber.class)
@CucumberOptions(snippets = SnippetType.CAMELCASE)
public class MyStepDefinitions {

    @Given("^the following users:$")
    public void theFollowingUsers() throws Throwable {
        throw new PendingException();
    }

    @Given("^I am logged in as: (.+)$")
    public void iAmLoggedInAs(String username) throws Throwable {
        throw new PendingException();
    }

    @When("^I edit my address with the details:$")
    public void iEditMyAddressWithTheDetails() throws Throwable {
        throw new PendingException();
    }

    @Then("^I am able to save it$")
    public void iAmAbleToSaveIt() throws Throwable {
        throw new PendingException();
    }

    @Then("^I am informed: \"([^\"]*)\"$")
    public void iAmInformedSomething(List<String> list1) throws Throwable {
        throw new PendingException();
    }

    @And("^I have stated my mailing address as being in: (.+)$")
    public void iHaveStatedMyMailingAddressAsBeingIn(String country) throws Throwable {
        throw new PendingException();
    }

    @And("^correspondence goes to the (.+) address$")
    public void correspondenceGoesToTheAddress(String country) throws Throwable {
        throw new PendingException();
    }

    @And("^I have stated my malining addres as being in: (.+)$")
    public void iHaveStatedMyMaliningAddresAsBeingIn(String country) throws Throwable {
        throw new PendingException();
    }

}