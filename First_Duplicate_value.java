// Program to print first duplicate elements from an array.
package mypackage;

import java.util.Scanner;

public class First_Duplicate_value {

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
		
		boolean found=false;
		int temp=0;
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(a[i]==a[j])
				{
					System.out.print("First Dublicate elements is:"+a[i]+" ");
					temp=temp+1;
					found=true;
					break;
				}
			}
			if(temp>0)
			{
				break;
			}
		}
		if(!found)
		{
			System.out.println("No duplicate Found");
		}
      scanner.close();
	}

}
