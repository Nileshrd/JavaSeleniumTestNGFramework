package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
	protected static WebDriver driver;
    public static WebDriver getDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
        //	System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");           
        	driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox")) {
        	driver = new FirefoxDriver();
        	
        }
        
        else if (browser.equalsIgnoreCase("edge")) {
        	driver = new EdgeDriver();
        }
        return driver;
    }
}
