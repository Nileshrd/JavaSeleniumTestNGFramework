package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ListingPage;
import utils.BaseTest;

import java.time.Duration;
import java.util.List;

public class ListingValidationTest extends BaseTest {
    @Test
    public void validateProductListing() throws InterruptedException {

        new LoginPage(driver).login("Rahul", "rahulshettyacademy");
    /*    ListingPage listing = new ListingPage(driver);
        List<String> products = listing.getProductNames();
        System.out.println("Products listed: " + products);
        assert products.size() > 0 : "No products found";
    */
    }
    
    	
    
    }

