package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FilterPanel {
    WebDriver driver;

    public FilterPanel(WebDriver driver) {
        this.driver = driver;
    }

    public void applySearch(String text) {
        driver.findElement(By.cssSelector("input[type='search']")).sendKeys(text);
    }
}
