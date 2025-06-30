// Program to check Leap Year
package mypackage;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Year:");
		int year=scanner.nextInt();
		
		if((year%400==0) || (year%4==0 && year%100!=0))
		{
			System.out.print("Is a leap year");
		}
		else {
			System.out.print("Is a leap year");
		}
     scanner.close();
	}

}
