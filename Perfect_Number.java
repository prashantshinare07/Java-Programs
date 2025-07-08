// Program to print perfect number

package mypackage;

import java.util.Scanner;

public class Perfect_Number {

	 public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		 System.out.print("Enter any number:");
		 int num =scanner.nextInt();
		 int sum = 0;

	        for(int i=1; i<num; i++) 
	        {
	            if (num%i==0)
	                sum += i;
	        }

	        System.out.println(num == sum ? "Perfect Number" : "Not Perfect");
	      scanner.close();   
	 }
}
