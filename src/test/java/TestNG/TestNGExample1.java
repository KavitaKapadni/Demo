package TestNG;

import org.testng.annotations.Test;

public class TestNGExample1 {
	
	//If you want the methods to be executed in a different order, use the parameter “priority”. 

	@Test (priority=1)
	void testCase1() {
		System.out.println("Test Case 1");
	}
	@Test (priority=2)
	void testCase2() {
		System.out.println("Test Case 2");
	}
	@Test (priority=3, alwaysRun = false)
	void testCase3() {
		System.out.println("Test Case 3");
	}
}
