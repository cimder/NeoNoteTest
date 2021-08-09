package stepDefinition;

import PageObjectModel.MainPage;
import cucumber.api.java.en.Then;

public class MainPageSteps {

MainPage mainPage = new MainPage();

    @Then("^I verify that the NeoNote logo is clickable$")
    public void i_verify_that_the_NeoNote_logo_is_clickable() throws Throwable {
        mainPage.isLogoClickable();
    }

    @Then("^I verify that the NeoNote header is clickable$")
    public void i_verify_that_the_NeoNote_header_is_clickable() throws Throwable {
        mainPage.isHeaderClickable();
    }

    @Then("^I verify that the Home link is clickable$")
    public void i_verify_that_the_Home_link_is_clickable() throws Throwable {
        mainPage.isHomeButtonClickable();
    }

    @Then("^I verify that the Places link is clickable$")
    public void i_verify_that_the_Places_link_is_clickable() throws Throwable {
        mainPage.isPlacesButtonClickable();
    }

    @Then("^I verify that the About Us link is clickable$")
    public void i_verify_that_the_About_Us_link_is_clickable() throws Throwable {
        mainPage.isAboutUsButtonClickable();
    }

    @Then("^I verify that the Profile link is clickable$")
    public void i_verify_that_the_Profile_link_is_clickable() throws Throwable {
        mainPage.isProfileButtonClickable();
    }

    @Then("^I verify that the Logout link is clickable$")
    public void i_verify_that_the_Logout_link_is_clickable() throws Throwable {
        mainPage.isLogoutButtonClickable();
    }



}
