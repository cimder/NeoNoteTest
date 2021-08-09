package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage extends CommonMethods {

    private String userName = "NeoNote";
    private String incorrectUserName = "Zeo1";
    private String password = "1234";
    private String incorrectPassword = "345";
    private WebDriver driver;

    public LoginPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }
    @FindBy(linkText = "Login")
    private WebElement loginButton;

    @FindBy(id = "id_username")
    public WebElement inputUserName;

    @FindBy(id = "id_password")
    public WebElement inputPassword;

    @FindBy(css = "button[type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    public WebElement logout;

    @FindBy(xpath = "//a[normalize-space()='Home']")
    public WebElement home;

    public void clickButtonLogin() {
        clickFunction(loginButton);
    }

    public void setUserName() {
        sendkeysFunction(inputUserName, userName);
    }

    public void setIncorrectUserName() {
        sendkeysFunction(inputUserName, incorrectUserName);
    }

    public void setPassword() {
        sendkeysFunction(inputPassword, password);
    }

    public void setIncorrectPassword() {
        sendkeysFunction(inputPassword, incorrectPassword);
    }

    public void clickButtonHome() {
        clickFunction(home);
    }

    public void clickButtonSubmit() {
        clickFunction(submit);
    }

}
