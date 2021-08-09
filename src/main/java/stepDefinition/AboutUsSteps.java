package stepDefinition;

import PageObjectModel.AboutUsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AboutUsSteps {

    AboutUsPage aboutUsPage = new AboutUsPage();

    @When("^I click on About Us link$")
    public void i_click_on_About_Us_link() throws Throwable {
        aboutUsPage.clickAboutUsBtn();
    }

    @Then("^I verify that the About Us page is opened$")
    public void i_verify_that_the_About_Us_page_is_opened() throws Throwable {
        aboutUsPage.verifyText();
    }
}
