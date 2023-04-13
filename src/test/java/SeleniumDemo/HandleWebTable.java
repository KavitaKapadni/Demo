package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWebTable {

	public static void main(String[] args) {
//A Web Table in Selenium is a WebElement used for the tabular representation of data or information. 

		
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		//Open URL Homepage
		
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText(); 	
		System.out.println(innerText); 
		driver.quit();

	}

}
