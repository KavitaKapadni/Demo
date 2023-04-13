package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleNestedWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		//Open URL Homepage
		
		driver.get("http://demo.guru99.com/test/accessing-nested-table.html");
		String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]")).getText(); 	
		
		System.out.println(innerText); 
		driver.quit();
	}

}
