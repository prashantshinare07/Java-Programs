// Program for Neon Number
package mypackage;

import java.util.Scanner;

public class Neon_Number {
	
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number:");
        int num=sc.nextInt();

        int square=num*num;
        int sum=0;
        int temp=square;

        while(temp>0) 
        {
            int digit=temp % 10;
            sum=sum+digit;
            temp=temp/10;
        }

        if(sum==num) 
        {
            System.out.println(num+" Is a Neon Number.");
        } 
        else 
        {
            System.out.println(num+" Is not a Neon Number.");
        }
        sc.close();
    }
}
