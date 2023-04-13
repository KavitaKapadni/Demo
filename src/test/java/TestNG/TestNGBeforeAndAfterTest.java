package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGBeforeAndAfterTest {

	//@BeforeTest-methods under this annotation will be executed prior to the first test case in the TestNG file.
	//@AfterTest-methods under this annotation will be executed after all test cases in the TestNG file are executed.

	 
	
	@BeforeTest
 void testCase1() {
		System.out.println("test case 1");//execute 1st
    }
    @Test
    void testCase2() {
		System.out.println("test case 2");//execute 3rd
    }
    @BeforeTest
    void testCase3() {
   	System.out.println("test case 3"); //execute 2nd
       }
    @AfterTest
    void testCase4() {
		System.out.println("test case 4");//execute 4th
    }
}
