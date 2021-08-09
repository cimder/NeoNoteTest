package utilities;

import PageObjectModel.CommonMethods;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver extends CommonMethods {

    private static WebDriver driver;

    public static WebDriver getDriver(){

        if(driver==null){
            ChromeDriverManager.chromedriver().setup();
            driver = new ChromeDriver(  );
        }
        return driver;
    }

    public static void closeDriver(){

        if(driver!=null) {
            driver.quit();
            driver=null;
        }
    }
}
