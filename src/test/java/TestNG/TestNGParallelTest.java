package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestNGParallelTest {
	
@Test
			
	public void verifyTitle() throws InterruptedException
	{
		//Launch Chrome Browser
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		
		// Open URL
		driver.get("https://demo.automationtesting.in/Register.html");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(driver.getTitle(), "Register");
		
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
		driver.get("https://demo.automationtesting.in/Register.html");
	
		WebElement Logo=driver.findElement(By.xpath("//a[@class = 'navbar-brand']"));
		Assert.assertTrue(Logo.isDisplayed());
		
		Thread.sleep(2000);
		driver.close();
	}
}
