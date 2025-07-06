// Program to check strong number.
package mypackage;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=scanner.nextInt();
	    int sum = 0, temp = num;
        while (num != 0) {
            int digit = num % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++)
                fact *= i;
            sum += fact;
            num /= 10;
            scanner.close();
        }
        System.out.println(sum == temp ? "Strong Number" : "Not Strong");
    }
}
