package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase14 {
	@Test
	public void validateTitles()
		{
		System.out.println("Beginning");
		String expected_title="yahoo.com";
		String actual_title="gmail.com";
		//Assert.assertEquals(actual_title,expected_title);
		//isElementPresent("xpath")-True,False
		Assert.assertTrue(false,"Element is not found");
		
		//Assert.fail("testcase is failed as the condition is not met");
		System.out.println("Ending");
	}

}