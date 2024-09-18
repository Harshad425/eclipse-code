package module.myproject;

import java.util.Scanner;

public class errorhanding {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("program is starte");
		
	
	
	/*System.out.println("number1:");

	int number1=sc1.nextInt();
	try
	{
	System.out.println(100/number1);
	}
	catch (ArithmeticException e)
	{
		System.out.println("error");
		System.out.println(e.getMessage());
	}
	
	System.out.println("program is starte");*/
	
	
	// 
	
		Scanner scn = new Scanner (System.in);
	
		System.out.println("program is starte");
	
		int a[]=new int[5];
		
		
		
		
		System.out.println("enter index");
	int ind= scn.nextInt();

	
	
	
		System.out.println("enter value");
		int val= scn.nextInt();
		
		a[ind]=val;
				System.out.println(100/a[ind]);

}
}

