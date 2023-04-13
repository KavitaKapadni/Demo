package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectRadioButtonAndCheckBox {

	public static void main(String[] args) {
		
		// declaration and instantiation of objects/variables

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		//Open URL Homepage
		driver.get("https://demo.guru99.com/test/radio.html");
		
		//select radion button 1
		WebElement RadioButton1 = driver.findElement(By.id("vfb-7-1"));
		
		RadioButton1.click();
		
		//deselect radion button 1 and select radio button 2
		WebElement RadioButton2 = driver.findElement(By.id("vfb-7-2"));
		RadioButton2.click();
		
		
		//Select checkbox 
		
		WebElement checkBox1 = driver.findElement(By.id("vfb-6-0"));
		checkBox1.click();
		
		//isSelected() method is used to know whether the Checkbox is toggled on or off.
		System.out.println("CheckBox1=" +checkBox1.isSelected());
		WebElement checkBox2 = driver.findElement(By.id("vfb-6-1"));
		checkBox2.click();
	
		WebElement checkBox3= driver.findElement(By.id("vfb-6-2"));
		checkBox3.click();
		
		 // Check whether the Check box is toggled on 		
        if (checkBox2.isSelected()) {					
            System.out.println("Checkbox is Toggled On");					

        } else {			
            System.out.println("Checkbox is Toggled Off");					
        }		
         
		
		
	}

}
