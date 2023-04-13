package SeleniumDemo;
import org.openqa.selenium.interactions.Action;		
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQuesryPluginTooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		//Open URL Homepage
		driver.get("https://demo.guru99.com/test/tooltip.html");
		  									
	        //find element download		
	        WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));		
	        
	        //object of action class
	        Actions builder = new Actions (driver);							

	       // moveToElement(element) of Actions class is used to mouse hover an element.
	       // Build() method of Actions class builds the sequence of user actions into an Action object.
	       // Perform() of Action class executes all the sequence of user actions at once.
	        
	        //click and hold download button 
	        builder.clickAndHold().moveToElement(download);	
	        
	        //perform action 
	        builder.moveToElement(download).build().perform(); 	
	        
	        
	        //find web element What's new in 3.2
	        WebElement toolTipElement = driver.findElement(By.xpath(".//*[@class='box']/div/a"));	
	        
	        String expectedTooltip = "What's new in 3.2";
	        String actualTooltip = toolTipElement.getText();			
	        
	        //print actual tooltip 
	        System.out.println("Actual Title of Tool Tip  "+actualTooltip);							
	       
	        if(actualTooltip.equals(expectedTooltip)) {							
	            System.out.println("Test Case Passed");					
	        }		
	        driver.close();			
	   }		

}
