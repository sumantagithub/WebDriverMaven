package testcases;

import java.util.Scanner;

import org.testng.annotations.Test;

public class TestCase3 {
	@Test
	public void reverseString() {
		String str;		
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(System.in);
		System.out.print("enter the string and press enter : ");
		str=scan.nextLine();
		System.out.println(" reverse of string" + str + "is:" );
		int i=str.length();
		while(i>0)
		{
			System.out.print(str.charAt(i-1));
			i--;
		}
		
	}

}
