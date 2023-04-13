package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AlertAndPopup {

	
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://output.jsbin.com/usidix/1");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
		 String alertMessage = driver.switchTo().alert().getText();
		 driver.switchTo().alert().accept();
	
		
		System.out.println(alertMessage );
	}
	
}		
	


