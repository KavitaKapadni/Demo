package TestNG;

import org.testng.annotations.*;


public class TestNGBeforeAndAfterMethod {
	//@BeforeMethod-methods under this annotation will be executed prior to each method in each test case.
	//@AfterMethod-methods under this annotation will be executed after each method in each test case.


	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Before Suite....");
	}
	
	@AfterSuite
	public void AfterSuit() {
		System.out.println("After Suite....");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test....");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("After Test....");
	}
	
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class...");
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class...");
	}
	

	@BeforeMethod  
	public void beforeMethod()
	{
		System.out.println("Before Method...");
	}
	
	@AfterMethod  
	public void afterMethod()
	{
		System.out.println("After Method...");
	}
	
	
	@Test
	public void test1()
	{
		System.out.println("This is Test1..");
	}
	
	@Test
	public void test2()
	{
		System.out.println("This is Test2..");
	}
	
	@BeforeGroups
	public void BeforeGroups()
	{
		System.out.println("This is BeforeGroups..");
	}

	@AfterGroups
	public void AfterGroups()
	{
		System.out.println("This is AfterGroups..");
	}
	
	//@BeforeSuite: The annotated method will be run before all tests in this suite have run.

	//@AfterSuite: The annotated method will be run after all tests in this suite have run.

	//@BeforeTest: The annotated method will be run before any test method belonging to the classes inside the tag is run.

	//@AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the tag have run.

	//@BeforeGroups: The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.

	//@AfterGroups: The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked.

	//@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.

	//@AfterClass: The annotated method will be run after all the test methods in the current class have been run.

	//@BeforeMethod: The annotated method will be run before each test method.

	//@AfterMethod: The annotated method will be run after each test method.

	//@Test: The annotated method is a part of a test case

	  
	  
	  
}








