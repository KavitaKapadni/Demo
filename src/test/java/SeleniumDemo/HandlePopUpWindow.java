package SeleniumDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlePopUpWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		//Open URL Homepage
		driver.get("https://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		
		//Stri//ng Parentwindow = driver.getWindowHandles();
			 //To handle all new opened window.				
	         //   Set<String> s1=driver.getWindowHandles();		
	    //    Iterator<String> i1=s1.iterator();	

	}

}
