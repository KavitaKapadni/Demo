package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountHyperLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		//Open URL Homepage
		driver.get("https://www.guru99.com/");

		// find count of hyperlinks on webpage
		List <WebElement> linkelements = driver.findElements(By.tagName("a"));
		System.out.println("Total links on webpage:" + linkelements.size());
		
		for(WebElement el: linkelements) {
			
			System.out.println(el.getText()); 
		}
	}
}
