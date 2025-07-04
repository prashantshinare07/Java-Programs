package mypackage;

import java.util.Scanner;

public class Merge_Two_Array {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length of 1st array:");
		int n1=sc.nextInt();
		
		int[] a=new int[n1];
		System.out.print("Enter Numbers:");
		for(int i=0; i<n1; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter length of 2st array:");
		int n2=sc.nextInt();
		
		int[] b=new int[n2];
		System.out.print("Enter Numbers:");
		for(int i=0; i<n2; i++)
		{
			b[i]=sc.nextInt();
		}
		
		//main logic
		int n3=n1+n2;
		int[] c=new int[n3];
		
		for(int i=0; i<n1; i++)
		{
			c[i]=a[i];
		}
		
		for(int i=0; i<n2; i++)
		{
			c[n1+i]=b[i];
		}
		
		for(int i=0; i<n3; i++)
		{
			System.out.printf(c[i]+" ");
		}
		sc.close();
	}
}
