package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstProgram {
	
	public static void main(String[] args) {
		//open URL, get Title, maximize screen
	
	
	WebDriverManager.chromedriver().setup();

	WebDriver driver=new ChromeDriver();

	//Open URL Homepage
	driver.get("https://www.google.com/");

	//print URL Homepage
	System.out.println(driver.getCurrentUrl());
	
	//print Title of webpage
	System.out.println(driver.getTitle());
	
	//maximize the screen
	driver.manage().window().maximize();
	
	}
}