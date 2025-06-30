// Program to Check Armstrong Number.
package mypackage;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=scanner.nextInt();
		
		int t1=num;
		int leng=0;
		
		while(t1!=0)
		{
			leng=leng+1;
			t1=t1/10;
		}
		
		int t2=num;
		int arm=0;
		int rem;
		
		while(t2!=0)
		{
			int mult=1;
			rem=t2%10;
			for(int i=1; i<=leng; i++)
			{
				mult=mult*rem;
			}
			arm=arm+mult;
			t2=t2/10;
		}
		if(arm==num)
		{
			System.out.println(num+" Is a Armstrong Number");
		}
		else {

			System.out.println(num+" Is not a Armstrong Number");
		}
		scanner.close();
	}
}
