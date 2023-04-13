package SeleniumDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatingElements {
	
	
	public static void main(String[] args) {
		//open URL, get Title, maximize screen
	
	
	WebDriverManager.chromedriver().setup();

	WebDriver driver=new ChromeDriver();

	//Open URL Homepage
	driver.get("https://www.facebook.com/");
	
	

	//print URL Homepage
	System.out.println(driver.getCurrentUrl());
	
	//print Title of webpage
	System.out.println(driver.getTitle());
	
	//maximize the screen
	driver.manage().window().maximize();
	
	//get page source code
	String pageSource = driver.getPageSource();
	System.out.println(pageSource);
	
	
	
	
	//find element by id
	//driver.findElement(By.id("email")).sendKeys("kapadni.kavita@gmail.com");
	
	//find element by xpath
	// driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("1234");
	 
	//find element by name
	//driver.findElement(By.name("login")).click();
	
	
	}

}
