package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BaseTest;
import utils.ExcelUtil;

public class LoginTest extends BaseTest {
	
	
    @Test
    public void testValidLogin() throws InterruptedException {
    	
       // String filePath = "C:\\Users\\Admin\\OneDrive\\Desktop\\New XLS Worksheet.xls";
        String user = ExcelUtil.getCellData(1, 5);
        String pass = ExcelUtil.getCellData(2, 5);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(user, pass);
        System.out.println("Login test completed.");
        
        Thread.sleep(5000);
        
    }
    
    @Test
    public void testInvalidLogin() throws InterruptedException {
    	LoginPage loginPage = new LoginPage(driver);
        loginPage.InvalidLogin("Rahul", "Hello");
        System.out.println("InvalidLogin test completed.");
        
    } 
}
