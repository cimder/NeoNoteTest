package PageObjectModel;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

import java.util.List;


public class PlacesPage extends CommonMethods {

    private WebDriver driver;

    public PlacesPage() {

        driver = Driver.getDriver();

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Places']")

    public WebElement places;


    @FindBy(css = "button[name='button']")

    public WebElement addButton;


    @FindBy(id = "id_place_name")

    public WebElement placeName;


    @FindBy(id = "id_address")

    public WebElement address;


    @FindBy(id = "id_rate")

    private WebElement rateDropdown;


    @FindAll({

            @FindBy(id = "id_rate")
    })
    private List<WebElement> rates;


    @FindBy(id = "id_img")

    public WebElement chooseFile;


    @FindBy(id = "id_note")

    public WebElement note;


    @FindBy(css = "button[type='submit']")

    public WebElement submitBtn;


    public void clickPlacesBtn() {
        clickFunction(places);
    }

    public void clickAddPlaceBtn() {
        clickFunction(addButton);
    }

    public void inputPlaceName() {
        sendkeysFunction(placeName, "Grand Canyon");
    }

    public void inputAddress() {
        sendkeysFunction(address, "Grand Canyon, Arizona, US");
    }

    public void selectRate() {
        handleDropdown(rateDropdown, rates);
    }

    public void uploadPhoton() {
        chooseFile.sendKeys("C:\\Users\\erdem\\OneDrive\\Masaüstü\\MasterClasses\\Capstone Project\\GrandCanyon.jfif");
    }

    public void inputNote() {
        sendkeysFunction(note, "Grand Canyon is a wonderful place");
    }

    public void clickSubmitBtn() {
        clickFunction(submitBtn);
    }

}
