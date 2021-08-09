package stepDefinition;

import PageObjectModel.LogoutPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogoutSteps {
    LogoutPage logoutPage = new LogoutPage();

    @When("^I click on the logout button$")
    public void i_click_on_the_logout_button() throws Throwable {
        logoutPage.clickButtonLogout();
    }

    @Then("^I verify that the Entry page is opened$")
    public void i_verify_that_the_Entry_page_is_opened() throws Throwable {
        logoutPage.verifyText();
    }

}
