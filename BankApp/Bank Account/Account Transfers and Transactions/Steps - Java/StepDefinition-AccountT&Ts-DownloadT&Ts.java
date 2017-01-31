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

    @When("^I want to download transactions or transfers against my account$")
    public void iWantToDownloadTransactionsOrTransfersAgainstMyAccount() throws Throwable {
        throw new PendingException();
    }

    @Then("^I am not able to perform a download$")
    public void iAmNotAbleToPerformADownload() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be able to start a download$")
    public void iShouldBeAbleToStartADownload() throws Throwable {
        throw new PendingException();
    }

    @And("^I have no transactions or transfers against my account$")
    public void iHaveNoTransactionsOrTransfersAgainstMyAccount() throws Throwable {
        throw new PendingException();
    }

    @And("^I have transactions or transfers against my account$")
    public void iHaveTransactionsOrTransfersAgainstMyAccount() throws Throwable {
        throw new PendingException();
    }

    @And("^I should download a csv file of my transactions and transfers$")
    public void iShouldDownloadACsvFileOfMyTransactionsAndTransfers() throws Throwable {
        throw new PendingException();
    }

}
