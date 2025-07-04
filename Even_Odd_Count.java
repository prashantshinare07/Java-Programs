// Program to print even and odd number count
package mypackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Even_Odd_Count {

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
		
		System.out.print("Even numbers count is:"+ al1.size());
		System.out.print("\n");
		System.out.print("Odd numbers count is:"+ al2.size());
	/*	for(int i:al1)
		{
			System.out.print(i+" ");
		}
		
		System.out.print("\n");
		System.out.print("Odd numbers are:");
		for(int i:al2)
		{
			System.out.print(i+" ");
		}*/
		scanner.close();
	}
}
