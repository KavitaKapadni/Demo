package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestNGFile {
//Using TestNG, you can generate a proper report, and you can easily come to know how many test cases are passed, failed, and skipped. You can execute the failed test cases separately.
@Test  
	
	public void verifyPageTitle()
	{
       //Launch Chrome Browser
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		
		// Open URL
		driver.get("https://demo.guru99.com/test/newtours/");
		System.out.println(driver.getCurrentUrl());//open url page
		System.out.println(driver.getTitle());// shows the title of webpage
		driver.manage().window().maximize();// maximize the screen 

		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver. getTitle();
		Assert.assertEquals(actualTitle,expectedTitle);
		
		driver.quit();
		
	}
	

	
}
