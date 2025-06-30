// Program to reverse a string.
package mypackage;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter String:");
		String name=scanner.next();
		
		int leng=name.length();
		String rev="";
		
		for(int i=leng-1; i>=0; i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println("Reverse of "+ name +" is:"+rev);
		scanner.close();
	}
}
