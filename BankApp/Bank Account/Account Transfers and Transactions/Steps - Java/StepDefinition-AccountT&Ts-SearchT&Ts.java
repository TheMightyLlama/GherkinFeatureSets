package my.package.name

import cucumber.api.PendingException;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(snippets = SnippetType.CAMELCASE)
public class MyStepDefinitions {

    @Given("^the following user:$")
    public void theFollowingUser() throws Throwable {
        throw new PendingException();
    }

    @Given("^I am logged in as Bob$")
    public void iAmLoggedInAsBob() throws Throwable {
        throw new PendingException();
    }

    @When("^I search for (.+) with (.+)$")
    public void iSearchForWith(String criteria, String searchvalue) throws Throwable {
        throw new PendingException();
    }

    @Then("^I am informed: \"([^\"]*)\".$")
    public void iAmInformedSomething(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be able to see ID of the transaction, the (.+), the (.+) and (.+)$")
    public void iShouldBeAbleToSeeIDOfTheTransactionThe TheAnd(String type, String value, String balance) throws Throwable {
        throw new PendingException();
    }

    @And("^the following transactions:$")
    public void theFollowingTransactions() throws Throwable {
        throw new PendingException();
    }

    @And("^my balance is £1000\.00$")
    public void myBalanceIs100000() throws Throwable {
        throw new PendingException();
    }

}
