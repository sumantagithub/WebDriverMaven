package testcases;

import java.util.Scanner;

import org.testng.annotations.Test;

public class TestCase7 {
	@Test
	
	public void fibonacciSeries()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("plesae enter a number to print fibonacci series");
		int num=sc.nextInt();
		System.out.println("*****Fibonacci Series*****");
		int f1, f2=0,f3=1;
		for(int i=1;i<=num;i++)
		{
			System.out.println(" "+f3+" ");
			f1=f2;
			f2=f3;
			f3=f1+f2;
					
		}
		
	}

}
