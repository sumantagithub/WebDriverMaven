package testcases;

import org.testng.annotations.Test;

public class TestCase9 {
@Test
public void largestOfThreeNumbers()
{
	int num1=10,num2=20,num3=5;
	if(num1>=num2 && num1>=num3)
		System.out.println(num1+ "is the largest number");
	
	else if(num2>=num1 && num2>=num3)
		System.out.println(num2+ "is the largest number");
	else
		System.out.println(num3+ "is the largest number");
}
	

}
