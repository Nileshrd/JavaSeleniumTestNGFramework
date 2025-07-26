package utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest2 {
    public WebDriver driver;

    @BeforeMethod
    public void setup() throws InterruptedException {
        driver = WebDriverFactory.getDriver("firefox");
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
       
        
    }

     @AfterMethod
     public void teardown() {
    	 if (driver != null) {
             driver.quit();
    	 }
     }
}
