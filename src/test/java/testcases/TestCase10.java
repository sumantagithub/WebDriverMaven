package testcases;

import java.util.Scanner;

import org.testng.annotations.Test;

public class TestCase10 {
	@Test
	public void largestOfThree()
	{
		int x,y,z;
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the first number:");
		x=s.nextInt();
		System.out.println("Enter the second number:");
		y=s.nextInt();
		System.out.println("Enter the third number:");
		z=s.nextInt();
		if(x>y && x>z)
			System.out.println("largest number is:" +x);
		else if(y>z)
		System.out.println("largest number is:" +y);
		else
			System.out.println("largest number is:" +z);
	}

}
