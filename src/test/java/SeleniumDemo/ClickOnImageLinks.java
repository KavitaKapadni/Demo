package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickOnImageLinks {

	public static void main(String[] args) {
		// How to click on image link
		//Image links are the links in web pages represented by an image which when clicked navigates to a different window or page.

		
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		//Open URL Homepage
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement title= driver.findElement(By.xpath("//img[@src='/logo.png']"));
		title.click();
		System.out.println("Title of the Image link page:=" +driver.getTitle());
		
		//verify that we are now back on parent homepage		
		if (driver.getTitle().equals("Radio Button & Check Box Demo")) {							
        System.out.println("We are back at parent homepage");					
    } else {			
        System.out.println("We are NOT in parent homepage");					
    }		
			driver.close();	
	}

}
