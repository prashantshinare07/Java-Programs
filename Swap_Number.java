// Java Program for swap two numbers with and without third variable
package mypackage;

import java.util.Scanner;

public class Swap_Number {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter first number:");
	int num1=scanner.nextInt();
	System.out.print("Enter second number:");
	int num2=scanner.nextInt();
    
	System.out.println("\nBefore Swapping");
	System.out.println("First Number:"+num1);
	System.out.println("Second Number:"+num2);
	
	//Without third variable
	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;
	
	//With third variable
	//int temp=num1;
	//num1=num2;
	//num2=temp;
	
	System.out.println("\nAfter Swapping");
	System.out.println("First Number:"+num1);
	System.out.println("Second Number:"+num2);
	scanner.close();
	}
}
