package pages;

import java.util.*;
import org.openqa.selenium.*;

public class ListingPage {
    WebDriver driver;

    public ListingPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<String> getProductNames() {
        List<String> names = new ArrayList<>();
        List<WebElement> rows = driver.findElements(By.cssSelector(".card h4"));
        for (WebElement row : rows) {
           names.add(row.getText());
        }
<<<<<<< HEAD
        return names;
        System.out.println("childbranchchanges");
=======
       // return names;
>>>>>>> b5729dca9250586f180d44b42ba1139259ed70f8
    }
}
