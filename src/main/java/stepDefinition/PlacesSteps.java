package stepDefinition;

import PageObjectModel.PlacesPage;
import cucumber.api.java.en.Then;

public class PlacesSteps {

    PlacesPage placesPage = new PlacesPage();

    @Then("^I click on the Places button$")
    public void i_click_on_the_Places_button() throws Throwable {
       placesPage.clickPlacesBtn();
    }

    @Then("^I click on the Add New Place Button$")
    public void i_click_on_the_Add_New_Place_Button() throws Throwable {
        placesPage.clickAddPlaceBtn();
    }

    @Then("^I enter the Place name$")
    public void i_enter_the_Place_name() throws Throwable {
        placesPage.inputPlaceName();
    }

    @Then("^I enter the Address$")
    public void i_enter_the_Address() throws Throwable {
        placesPage.inputAddress();
    }

    @Then("^I select the rate$")
    public void i_select_the_rate() throws Throwable {
        placesPage.selectRate();
    }

    @Then("^I upload a photo$")
    public void i_upload_a_photo() throws Throwable {
        placesPage.uploadPhoton();
    }

    @Then("^I write my note$")
    public void i_write_my_note() throws Throwable {
        placesPage.inputNote();
    }

    @Then("^I click on Add button$")
    public void i_click_on_Add_button() throws Throwable {
        placesPage.clickSubmitBtn();
    }
}
