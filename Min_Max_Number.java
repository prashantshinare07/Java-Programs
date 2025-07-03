// Program to print Minimum and Maximum number from an array
package mypackage;

import java.util.Scanner;

public class Min_Max_Number {

	public static void main(String[] args) {
	//	int[] a= {10,40,5,75,80,8,25,7};
	
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter number of elements:");
		int n=scanner.nextInt();
		int[] a=new int[n];
		System.out.println("Enter "+n+" number:");
		for(int i=0; i<n; i++)
		{
			a[i]=scanner.nextInt();
		}
		
		int min=a[0];
		int max=a[0];
		
	//	for(int i=1; i<a.length; i++)
		for(int i=1; i<n; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Minimum number is:"+min);
		System.out.println("Maximum number is:"+max);
		scanner.close();
	}

}
