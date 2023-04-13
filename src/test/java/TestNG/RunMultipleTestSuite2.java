package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class RunMultipleTestSuite2 {
	
WebDriver driver; 
	
	@Test
	
	public void verifyLogin() throws InterruptedException
	{
		//Launch Chrome Browser
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		
		// Open URL
		driver.get("https://www.saucedemo.com/");
		
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		
		 Thread.sleep(2000);
		//driver.close();
	}
}
