// Program for Happy Number.
package mypackage;

import java.util.Scanner;

public class Happy_Number {
	
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();

        int temp=num;
        while(temp!=1 && temp!=4)
        {
            temp=SquareSum(temp);
        }

        if(temp==1) 
        {
            System.out.println(num+" is a Happy Number.");
        } 
        else 
        {
            System.out.println(num+" Is Not a Happy Number.");
        }
        sc.close();
    }

    public static int SquareSum(int n) 
    {
        int sum=0;
        while(n>0) 
        {
            int digit=n%10;
            sum=sum+digit*digit;
            n=n/10;
        }
        return sum;
    }
}
