// Java program for Fibonacci Series.
package mypackage;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int num1=0,num2=1,sum=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number of terms for Fibonacci series:");
		int n=scanner.nextInt();
		System.out.print(num1);
		System.out.print(" "+num2);
		
		for(int i=1; i<n-1; i++)
		{
			sum=num1+num2;
			System.out.print(" "+sum);
			 num1=num2;
	         num2=sum;
		}
		scanner.close();
	}

}
