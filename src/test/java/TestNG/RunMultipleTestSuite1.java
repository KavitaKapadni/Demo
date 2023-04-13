package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class RunMultipleTestSuite1 {
	

	@Test
	
	public void verifyTitle() throws InterruptedException
	{
		//Launch Chrome Browser
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		
		// Open URL
		driver.get("https://www.saucedemo.com/");
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		
		driver.close();
		
		Thread.sleep(2000);
		
	}
		@Test
		
		public void verifyLogo() throws InterruptedException
		{
			//Launch Chrome Browser
			WebDriverManager.chromedriver().setup();	
			WebDriver driver=new ChromeDriver();
			
			// Open URL
			driver.get("https://www.saucedemo.com/");
		
			WebElement Logo=driver.findElement(By.xpath("//div[@class='login_logo']"));
			Assert.assertTrue(Logo.isDisplayed());
			
			Thread.sleep(2000);
			driver.close();
		
		}
}
