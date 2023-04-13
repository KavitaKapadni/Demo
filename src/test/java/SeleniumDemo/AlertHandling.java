package SeleniumDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		
		//open URL webpage
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		//find element, enter customer id
		driver.findElement(By.name("cusid")).sendKeys("123");
		
		//click on submit button
		
		driver.findElement(By.name("submit")).click();
		//driver.switchTo().alert().accept();
		
		//switch to alert window
		Alert alert = driver.switchTo().alert();
		
		//get text 
		String alertmsg = driver.switchTo().alert().getText();
		
		//print text 
		System.out.print(alertmsg);
		
		//accept alert
		alert.accept();
		
		//reject  alert
		//alert.dismiss();
		
		//close window
		//driver.close();
	}

}
