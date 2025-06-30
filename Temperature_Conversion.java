// Program to check Temperature in Fahrenheit or Celsius.
package mypackage;

import java.util.Scanner;

public class Temperature_Conversion {
	
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Temperature Conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        if(choice==1) 
        {
            System.out.print("Enter temperature in Celsius:");
            double celsius= sc.nextDouble();
            double fahrenheit= (celsius*9/5)+32;
            System.out.println("Temperature in Fahrenheit:"+fahrenheit);
        } 
        else if(choice==2)
        {
            System.out.print("Enter temperature in Fahrenheit:");
            double fahrenheit= sc.nextDouble();
            double celsius= (fahrenheit-32)*5/9;
            System.out.println("Temperature in Celsius:"+celsius);
        } 
        else 
        {
            System.out.println("Invalid choice.");
        }
        sc.close();
    }
}
 