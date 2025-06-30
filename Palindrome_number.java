package mypackage;

import java.util.Scanner;

public class Palindrome_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number:");
		int num=sc.nextInt();
		int temp=num;
		int rev=0,rem;
		
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(num==rev)
		{
			System.out.print(num+ "is a palindrome Number");
		}
		else {
			System.out.print(num+ "is not palindrome Number");
		}
      sc.close();
	}

}
