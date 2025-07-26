package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
    WebDriver driver;
    
    By username = By.id("inputUsername");
    By password = By.name("inputPassword");
    By loginBtn = By.className("signInBtn");
    By LoginError = By.cssSelector("p.error");
    By LogSuccess = By.xpath("//p[text()='You are successfully logged in.']");
    
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void login(String a, String b)  {
        driver.findElement(username).sendKeys(a);
        driver.findElement(password).sendKeys(b);
        driver.findElement(By.id("chkboxOne")).click();
	    driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(loginBtn).click();
       System.out.println(driver.findElement(LogSuccess).getText());
       
        
    }
    public void InvalidLogin(String user, String pass) throws InterruptedException  {  
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
        driver.findElement(LoginError).getText();
        System.out.println(driver.findElement(LoginError).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Johnrsa@sa.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7385413320");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();  

    }
    
  
}
