package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatingByDOM {

	public static void main(String[] args) {
		// Locating by DOM (Document Object Model)
		//DOM is programming API for HTML and XML document
		

		
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		//Open URL Homepage
		driver.get("http://demo.guru99.com/test/facebook.html");
		
		
		//getElementById
		
	//	driver.getElementById("persist_box");
		//document.getElementById("persist_box")
		//getElementsByName
		//dom:name (applies only to elements within a named form)
		//dom:index
	}

}
