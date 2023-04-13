package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		//Open URL Homepage
		driver.get("https://demo.guru99.com/test/social-icon.html");
		
		WebElement text = driver.findElement(By.xpath("//a[@title = 'YouTube']"));
		
		String actualtooltip = text.getAttribute("title");
		
		//print tooltip
		System.out.println(actualtooltip);
		
		String expectedtooltip ="Youtube";
		
		//verify actual and expected tooltip
		
		Assert.assertEquals(expectedtooltip, actualtooltip);
		
		/*if(actualtooltip.equals(expectedtooltip)) {							
            System.out.println("Test Case Passed");	
		}
            else
            {
            	System.out.println("Test Case failed");	
            }*/
        		
	}

}
