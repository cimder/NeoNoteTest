package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignupPage extends CommonMethods {

    private WebDriver driver ;
    private String userName = "NeoNote";
    private String IncorrectUserName = "Zeo1";
    private String password = "1234";
    private String IncorrectPassword = "345";

    public SignupPage(){
        driver = Driver.getDriver();
        PageFactory.initElements( driver , this );
    }

    @FindBy(css = ".btn.btn-light")
    public WebElement exploreButton;

    @FindBy(id = "id_username")
    public WebElement inputUserName;

    @FindBy(id = "id_email")
    public WebElement email;

    @FindBy(id = "id_first_name")
    public WebElement name;

    @FindBy(id = "id_last_name")
    public WebElement lastName;

    @FindBy(id = "id_password")
    public WebElement inputPassword;

    @FindBy(id = "id_group_name")
    public WebElement groupName;

    @FindBy(css = "button[type='submit']")
    private WebElement signUpButton;

    public void clickExplore() {
        clickFunction(exploreButton);
    }

    public void setUserName() {
        sendkeysFunction(inputUserName, userName);
    }

    public void setEmail() {
        sendkeysFunction(email, "neonote@neo.com");
    }

    public void setIncorrectEmail() {
        sendkeysFunction(email, "neo1.neo.com");
    }

    public void setName() {
        sendkeysFunction(name, "John");
    }

    public void setLastName() {
        sendkeysFunction(lastName, "Smith");
    }

    public void setPassword() {
        sendkeysFunction(inputPassword, password);
    }

    public void setGroupName() {
        sendkeysFunction(groupName, "Group1");
    }

    public void clickSignUp() {
        clickFunction(signUpButton);
    }



}
