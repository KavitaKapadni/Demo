package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CompareTitle {
	public static void main(String[] args) {
		//open URL, get Title, maximize screen
	
	
	WebDriverManager.chromedriver().setup();

	WebDriver driver=new ChromeDriver();

	//Open URL Homepage
	driver.get("https://www.google.com/");
	
	//Compare actual title with expected Title

	String ExpectedTitle = "Google";
	String  ActualTitle =driver.getTitle();

	if ( ActualTitle.contentEquals(ExpectedTitle))
	{
	System.out.println("Test is Passed");
	}
	else
	{	
	System.out.println("Test is Failed");
	}
	
	//close Browser
	driver.close();
	}
	
}
