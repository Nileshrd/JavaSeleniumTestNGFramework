package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DrillDownPage {
    WebDriver driver;

    public DrillDownPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductDetailText() {
        return driver.findElement(By.cssSelector(".card-title")).getText();
    }
}
