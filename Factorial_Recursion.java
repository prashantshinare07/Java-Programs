// Program to find factorial using Recursion
package mypackage;

import java.util.Scanner;

public class Factorial_Recursion {
    static int fact=1;
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Number to find factorial:");
		int num=scanner.nextInt();
		Factorial_Recursion obj=new Factorial_Recursion();
		obj.printFact(num);
		System.out.println("Fcatorial of "+num+" is "+fact);
		scanner.close();
	}
	void printFact(int num)
	{
		if(num>1)
		{
			fact=fact*num;
			printFact(num-1);
		}
	}
}
