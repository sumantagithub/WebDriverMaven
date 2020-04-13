package testcases;

import java.util.Scanner;

import org.testng.annotations.Test;

public class TestCase2 {
	@Test
public void reverseValue() {
	int num=0,tempNum;
	int reversenum=0;
	System.out.println("Enter your number and press enter: ");
	@SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
	tempNum=num=in.nextInt();
	while(num!=0)
	{
		reversenum=reversenum*10;
		reversenum=reversenum+num%10;
		num=num/10;
	}
	
	System.out.println("reverse of number" + tempNum + "is:" + reversenum);
	
}
}