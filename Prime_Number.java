// Program to check prime number.
package mypackage;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=scanner.nextInt();
		
		int temp=0;
		for(int i=2; i<=num-1; i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println(num+" Is prime number");
		}
		else {

			System.out.println(num+" Is not prime number");
		}
		scanner.close();
	}
}
