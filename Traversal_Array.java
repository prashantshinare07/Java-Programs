package mypackage;

import java.util.Scanner;

public class Traversal_Array {

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
		
		System.out.print("Array elements are:");
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
		scanner.close();
}
}
