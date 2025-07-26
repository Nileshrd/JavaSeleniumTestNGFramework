package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewRegistartion {
	WebDriver driver;
	
	@FindBy(xpath= ("//select[@id='month']"))
	WebElement monthdropdown;
	@FindBy(xpath=("//a[contains(text(),'Create new account')]"))
	WebElement newAccount;
	@FindBy(xpath=("//select[@id='month']/option"))
	List<WebElement> dropdownList;

//	WebElement month =	driver.findElement(By.xpath("//select[@id='month']"));
//	List<WebElement> dropdownList = driver.findElements(By.xpath("//select[@id='month']/option"));
//	WebElement newAccount = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));

	public NewRegistartion(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
	}
	 public void openCreatAccount () {
		 newAccount.click();
		 new WebDriverWait(driver, Duration.ofSeconds(5))
         .until(ExpectedConditions.visibilityOf(monthdropdown));
	 }
	 
	 public void dropdownBySelectClass (String visibleText, String value, int index) {
		 
		 Select dropdown = new Select(monthdropdown);
		 dropdown.selectByVisibleText(visibleText);
		 dropdown.selectByValue(value);
		 dropdown.selectByIndex(index);
		 
	 }
	 
	public void dropdownWithoutSelectClass(int index) {
		
		if(index<dropdownList.size()) {
			dropdownList.get(index).click(); 
	}
		}
		
	public void dropdownBysenkeys(String month) {
		
		monthdropdown.sendKeys("month");
	}
		 
	public boolean dropdownDynamically(String targetmonth) {
		
		for (WebElement drop : dropdownList) {
			
			if(drop.getText().equalsIgnoreCase(targetmonth)) {
				drop.click();
				return true;
				
			}		
	}
		return false;
		}
		 
	public String getSelectedmonth() {
		return new Select(monthdropdown).getFirstSelectedOption().getText();
		
	}
	 public int getMonthOptionCount() {
	        return driver.findElements(By.xpath("//select[@id='month']/option")).size();
	    } 
		 
		 
	 
	
}
