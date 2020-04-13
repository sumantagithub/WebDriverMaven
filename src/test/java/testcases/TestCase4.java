package testcases;

import org.testng.annotations.Test;

public class TestCase4 {
	@Test
	public void array()
	{
		int[] intArray=new int[] {7,15,45,13,75};
		for(int i=0; i<intArray.length;i++)
		{
			System.out.println(intArray[i]);
		}
	}

}
