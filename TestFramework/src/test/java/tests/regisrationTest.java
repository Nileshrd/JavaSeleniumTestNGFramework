package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NewRegistartion;
import utils.BaseTest2;

public class regisrationTest extends BaseTest2{
	    
	 @Test
	    public void testDropdownValidation() throws InterruptedException {
		 NewRegistartion signupPage = new NewRegistartion(driver); 
		 Thread.sleep(2000);
		 signupPage.openCreatAccount();
		// 1. Select by Select class
		 signupPage.dropdownBySelectClass("Apr", "4", 5);
		// 2. Select without Select class
		 signupPage.dropdownWithoutSelectClass(6);
		 // 3. Using sendKeys
		 signupPage.dropdownBysenkeys("Oct");
		// 4. Dynamic dropdown selection
		 boolean isSelected= signupPage.dropdownDynamically("Dec");
		 Assert.assertTrue(isSelected, "Dec should be present and selected");

	     // Validate selected option
	        String actual = signupPage.getSelectedmonth();
	        String expected = "Dec";
	        Assert.assertEquals(actual, expected, "Month should be Dec");

	        signupPage.getMonthOptionCount();
	        // Print size
	        System.out.println("Total Months = " + signupPage.getMonthOptionCount());
	        
	    }

	  }	
	

