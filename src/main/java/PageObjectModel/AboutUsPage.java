package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class AboutUsPage extends CommonMethods {
    public String expectedText = "About Us";
    private WebDriver driver;

    public AboutUsPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='About Us']")
    public WebElement aboutUs;

    @FindBy(xpath = "//h1[normalize-space()='About us']")
    public WebElement getAboutUsText;

    public void clickAboutUsBtn() {
        clickFunction(aboutUs);
    }

    public void verifyText() {

        String actualText = aboutUs.getText();

        System.out.println(actualText);

        Assert.assertEquals(actualText, expectedText);
    }

}
