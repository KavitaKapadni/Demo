package TestNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGExample2 {
	@Test 
	public void TestCasesExample01()
	{
		Assert.assertTrue(false); //test case will fail
	}
	@Test 
	//(retryAnalyzer =RetryAnalyser.class)
	public void TestCasesExample02()
	{
		Assert.assertTrue(false); //test case will fail
	}
	@Test
	public void TestCasesExample03()
	{
		Assert.assertTrue(true); //test case will pass
	}
}
