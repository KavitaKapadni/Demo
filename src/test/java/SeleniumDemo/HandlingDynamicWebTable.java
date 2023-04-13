package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDynamicWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		//Open URL Homepage
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		
		//count Number of Columns
		 List <WebElement> column = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	        System.out.println("No of columnss are : " +column.size()); 
	      
	        
	    //count Number of rows 
	    List <WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
	    System.out.println("No of rows are : " + rows.size());
	    
	    	System.out.println("Name of Columns:-");
	        for(WebElement cl: column) {
	        	
	        	
				
				System.out.println(cl.getText()); 
			}
	        System.out.println("Name of rows:-");
	        for(WebElement rw: rows) {
	        	
				
				System.out.println(rw.getText()); 
			}
	}

}
