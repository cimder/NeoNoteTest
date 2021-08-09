package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class LogoutPage extends CommonMethods {

    private WebDriver driver ;

    public LogoutPage(){
        driver = Driver.getDriver();
        PageFactory.initElements( driver , this );
    }

    @FindBy(css = "body > nav:nth-child(4) > div:nth-child(4) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)")
    public WebElement logout;

    @FindBy(xpath = "//h1[normalize-space()='Uncover the hidden gems around the world.']")
    public WebElement welcomeText;

    public void clickButtonLogout() {
        clickFunction(logout);
    }

    String expectedText= "Uncover the hidden gems around the world.";
    String actualText= welcomeText.getText();

    public void verifyText() {
        System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText);
    }

}
