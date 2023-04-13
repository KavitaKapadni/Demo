package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {


	
	/*static void mouseOverHome() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		//Open URL Homepage
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		WebElement link_Home = driver.findElement(By.linkText("Home"));
		Actions builder = new Actions(driver);
        Action mouseOverHome = builder.moveToElement(link_Home).build();
        mouseOverHome.perform(); */
	
		static void buildSeriesOfActionsUsingTheActionClasses() {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		
		//open URL webpage
		driver.get("https://www.facebook.com/");
		
		//find element 
		WebElement txtUsername = driver.findElement(By.id("email"));
		
		//object of action class
		Actions builder = new Actions(driver);
		
		//build series of actions using action and action classes
		Action seriesOfActions = builder
			.moveToElement(txtUsername)// cursor on name 
			.click()//click the name box
			.keyDown(txtUsername, Keys.SHIFT)// type hello in uppercase
			.sendKeys(txtUsername, "hello")
			.keyUp(txtUsername, Keys.SHIFT)
			.doubleClick(txtUsername)//highlight the text
			.contextClick()//brings up the context menu
			.build();
			
		seriesOfActions.perform() ;
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
// Action Class in Selenium is a built-in feature provided by the selenium for handling keyboard and mouse events.
//Handling Keyboard & Mouse Events
		buildSeriesOfActionsUsingTheActionClasses();
	
	}

}
