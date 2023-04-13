package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatingElementByCssSelector {

	public static void main(String[] args) {
		//Locating web elements by using CSSS Selector
		
		
	
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//tag#id 
		//driver.findElement(By.cssSelector("input#email")).sendKeys("kavita");
		
		//tag.class
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("kavita");
		
		//tag[attribute=value]
		//driver.findElement(By.cssSelector("input[name=email]")).sendKeys("kavita");
		
		//css=tag.class[attribute=value]  
		driver.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("kavita");
	}

}
