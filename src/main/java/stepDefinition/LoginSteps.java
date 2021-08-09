package stepDefinition;

import PageObjectModel.LoginPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Then("^I click on the Login$")
    public void i_click_on_the_Login() throws Throwable {
        loginPage.clickButtonLogin();
    }

    @When("^I click on the Submit button$")
    public void i_click_on_the_Submit_button() throws Throwable {
       loginPage.clickButtonSubmit();
    }

    @Then("^I should go to the main page$")
    public void i_should_go_to_the_main_page() throws Throwable {
        loginPage.clickButtonHome();

    }
    @Then("^I enter a incorrect username$")
    public void i_enter_a_incorrect_username() throws Throwable {
       loginPage.setIncorrectUserName();
    }

    @Then("^A warning message should be displayed$")
    public void a_warning_message_should_be_displayed() throws Throwable {

    }
    @Then("^I enter a incorrect Password$")
    public void i_enter_a_incorrect_Password() throws Throwable {
       loginPage.setIncorrectPassword();
    }

}
