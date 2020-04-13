package testcases;

import org.testng.annotations.Test;

public class TestCase1 {
	@Test
	
	public void ChangeStringValue()
	{
		String a ="orange";
		String b ="apple";
		System.out.println("Before swapping");
		System.out.println("value of a is : " + a);
		System .out.println("value of b is : " +b);
		swap(a,b);
	}

	private void swap(String a, String b) {
		String temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping");
		System.out.println("value of a is: " + a);
		System.out.println("value of b is: " + b);
	}
}
	