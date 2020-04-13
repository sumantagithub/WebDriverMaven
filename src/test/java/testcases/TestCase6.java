package testcases;

import java.util.Arrays;

import org.testng.annotations.Test;

public class TestCase6 {
	
	@Test
	public void sortArrays()
	{
		int[] array= {10,5,15,12,18};
		System.out.println("Array elements before sort");
		for(int elem : array)
		{
			System.out.println(elem);
		}
		
		
		Arrays.sort(array);
		System.out.println("Array elements after sort");
		for(int elem : array)
		{
			System.out.println(elem);
		}
		
	}

}
