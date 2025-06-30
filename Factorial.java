// Program to find factorial
package mypackage;

import java.util.Scanner;

public class Factorial {
 
	public static void main(String[] args)
	{
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter number to find factorial:");
		int num=scanner.nextInt();
		int fact=1;
		for(int i=1; i<=num; i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of " +num+ " is:" + fact);
		scanner.close();
	}
}
