package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ListingPage;
import utils.BaseTest;
import utils.ExcelUtil;
import java.util.List;

public class ExportValidationTest extends BaseTest {
    @Test
    public void dummyExportTest() throws Exception {
        new LoginPage(driver).login("rahulshettyacademy", "learning");
        List<String> products = new ListingPage(driver).getProductNames();
        System.out.println("Export simulation: " + products);
        // Simulated export comparison
    }
}
