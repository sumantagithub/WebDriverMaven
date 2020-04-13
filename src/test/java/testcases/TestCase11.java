package testcases;

import org.testng.annotations.Test;

public class TestCase11 {
	@Test
	public void printOddNumbers()
	{
		System.out.println("The odd numbers are:");
		for(int i=1;i<=100;i++) {
			if(i%2!=0)
			{
				System.out.println(i+ "");
			}
		}
	}

}
