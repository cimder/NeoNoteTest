package stepDefinition;
import PageObjectModel.SignupPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;
import java.util.concurrent.TimeUnit;

public class SignupSteps {

    WebDriver driver;
    SignupPage signupPage = new SignupPage();

    @Given("^I am on the entry page$")
    public void i_am_on_the_entry_page() throws Throwable {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
       driver.get("http://127.0.0.1:8000/NeoNoteApp/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("I click on Explore Now button and open the signup page")
    public void i_click_on_explore_now_button() {
        signupPage.clickExplore();
    }
    @Then("I enter the username")
    public void i_enter_the_username() {
        signupPage.setUserName();
    }
    @Then("I enter the email")
    public void i_enter_the_email() {
       signupPage.setEmail();
    }
    @Then("I enter the firstname")
    public void i_enter_the_firstname() {
        signupPage.setName();
    }
    @Then("I enter the lastname")
    public void i_enter_the_lastname() {
      signupPage.setLastName();
    }
    @Then("I enter the password")
    public void i_enter_the_password() {
signupPage.setPassword();
    }
    @Then("I enter the group name")
    public void i_enter_the_group_name() {
      signupPage.setGroupName();
    }
    @Then("I click on the Signup button and submit my enrollment")
    public void i_click_on_the_signup_button_and_submit_my_enrollment() {
        signupPage.clickSignUp();
    }
    @Then("^close the driver$")
    public void close_the_driver() throws Throwable {
        driver.quit();
    }
}
