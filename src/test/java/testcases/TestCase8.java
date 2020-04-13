package testcases;

import java.util.Scanner;

import org.testng.annotations.Test;

public class TestCase8 {
	@Test
	public void palindrome()
	{
		int num;
		@SuppressWarnings("resource")
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the num");
		num=in.nextInt();
		int a=num;
		int reverse=0;
		int remainder;
		while(num > 0) {
			remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
					}
		
		if(reverse==a)
			System.out.println(a+ " is a palindrome number");
		else
			System.out.println(a+ " is not a palindrome");
	}

}
 