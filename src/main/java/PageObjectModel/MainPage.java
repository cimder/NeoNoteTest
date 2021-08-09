package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage extends CommonMethods {

    private WebDriver driver;

    public MainPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "img[src='/static/neonote.jpg']")
    public WebElement logo;

    @FindBy(xpath = "//a[normalize-space()='NeoNote']")
    public WebElement header;

    @FindBy(xpath = "//a[normalize-space()='Home']")
    public WebElement home;

    @FindBy(xpath = "//a[normalize-space()='Places']")
    public WebElement places;

    @FindBy(xpath = "//a[normalize-space()='About Us']")
    public WebElement aboutUs;

    @FindBy(xpath = "//a[normalize-space()='Profile']")
    public WebElement profile;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    public WebElement logout;

    public void isLogoClickable(){
        isClickableMethod(logo);
    }
    public void isHeaderClickable(){
        isClickableMethod(header);
    }
    public void isHomeButtonClickable(){
        isClickableMethod(home);
    }
    public void isPlacesButtonClickable(){
        isClickableMethod(places);
    }
    public void isAboutUsButtonClickable(){
        isClickableMethod(aboutUs);
    }
    public void isProfileButtonClickable(){
        isClickableMethod(profile);
    }
    public void isLogoutButtonClickable(){
        isClickableMethod(logout);
    }


}
