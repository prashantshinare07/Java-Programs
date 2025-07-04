// Program to print sum of all even numbers and odd numbers
package mypackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Even_Odd_Sum {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter length of an array:");
		int n=scanner.nextInt();
		
		int[] a=new int[n];
		System.out.print("Enter "+n+" numbers:");
		for(int i=0; i<n; i++)
		{
			a[i]=scanner.nextInt();
		}
		
		// main logic
		ArrayList<Integer> al1=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<Integer>();
		
		for(int i=0; i<n; i++)
		{
			if(a[i]%2==0)
			{
				al1.add(a[i]);
			}
			else {
				al2.add(a[i]);
			}
		}
		
		int sum1=0;
		int sum2=0;
		for(int i:al1)
		{
		   sum1=sum1+i;
		}
		System.out.print("Even number sum is "+sum1);
		System.out.print("\n");
	
		for(int i:al2)
		{
			sum2=sum2+i;
		}
		System.out.print("Odd number sum is "+sum2);
		scanner.close();
	}
}
