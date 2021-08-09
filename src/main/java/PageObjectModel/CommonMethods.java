package PageObjectModel;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;

import utilities.Driver;

import java.util.List;

import java.util.Random;

public abstract class CommonMethods {


    private final WebDriver driver = Driver.getDriver();

    WebDriverWait wait = new WebDriverWait(driver, 10);

    public void clickFunction(WebElement clickElement) {

        wait.until(ExpectedConditions.elementToBeClickable(clickElement));

        clickElement.click();
    }
    public void sendkeysFunction(WebElement sendkeysElement, String value) {

        wait.until(ExpectedConditions.visibilityOf(sendkeysElement));

        sendkeysElement.sendKeys(value);
    }

    public void waitUntilVisibility(WebElement waitElement) {

        try {

            wait.until(ExpectedConditions.visibilityOf(waitElement));

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public void waitUntilInVisibility(WebElement waitElement) {

        try {
            wait.until(ExpectedConditions.invisibilityOf(waitElement));

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public void verifyCreated(List<WebElement> tableList, String value) {

        boolean result = false;

        for (WebElement element : tableList) {

            if (element.getText().trim().equalsIgnoreCase(value)) {

                result = true;

                break;
            }
        }

        if (!result) {

            Assert.fail();

        } else {

            System.out.println(value + " is displayed");
        }
    }

    public void handleDropdown(WebElement dropdown, List<WebElement> dropdownOptions) {

        clickFunction(dropdown);

        int randomNum = randomGenerator(dropdownOptions.size());

        clickFunction(dropdownOptions.get(randomNum));

    }

    public int randomGenerator(int max) {

        Random random = new Random();

        return random.nextInt(max);
    }

    public void isClickableMethod(WebElement element) {

        element.isEnabled();
    }
}
