package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateCommand {

	public static void main(String[] args) throws InterruptedException {
		// Navigate commands allow you to  refresh,go-into and switch back and forth between different web pages.

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		//Open URL Homepage
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.findElement(By.xpath("//img[@src='/logo.png']")).click();
	
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
	}

}
