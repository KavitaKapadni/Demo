package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		//Open URL Homepage
		driver.get("https://demo.guru99.com/selenium/deprecated.html");

		//print URL Homepage
		//System.out.println(driver.getCurrentUrl());
		
		//print Title of webpage
		//System.out.println(driver.getTitle());
		
		//maximize the screen
		//driver.manage().window().maximize();
		  
		//Swich to frame
		driver.switchTo().frame("classFrame");
		
		//locate the elemene inside the frame
		
		driver.findElement(By.xpath("//a[@href='deprecated-list.html']")).click();

	}

}
