// Program to print sum of digit of a number.
package mypackage;

import java.util.Scanner;

public class Digit_Sum {
	
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= scanner.nextInt();

        int sum=0;
        int temp=num;

        while(temp>0)
        {
            int digit= temp%10;
            sum= sum+digit;
            temp= temp/10;
        }
        System.out.println("Sum of digits "+num+" is: "+sum);
        scanner.close();
    }
}
