package utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest {
    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
    }

     @AfterMethod
     public void teardown() {
    	 if (driver != null) {
             driver.quit();
    	 }
     }
}
