//Program to find second Largest number from an array.
package mypackage;

import java.util.Scanner;

public class Second_Largest_Number {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter length of an array:");
		int n=scanner.nextInt();
		
		int[] a=new int[n];
		System.out.print("Enter "+n+" numbers:");
		for(int i=0; i<n; i++)
		{
			a[i]=scanner.nextInt();
		}
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
      System.out.print("Second Largest number is "+a[1]);
      scanner.close();
	}
}
