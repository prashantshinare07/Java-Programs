// Program for calculator
package mypackage;

import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("--Menu--");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Division");
		System.out.println("4.Multiplication");
		System.out.println("5.Exit");
		System.out.println("Enter your choice:");
		int choice=scanner.nextInt();
		System.out.println("Enter first number");
        Double num1=scanner.nextDouble();
        System.out.println("Enter second number");
        Double num2=scanner.nextDouble();
		switch(choice)
		{
		case 1: System.out.println("Addition Is:"+(num1+num2));
		break;
		case 2: System.out.println("Substraction Is:"+(num1-num2));
		break;
		case 3: if(num2!=0){
			System.out.println("Division Is:"+(num1/num2));
		    }
		else {
			System.out.println("Error: Division by zero not allowed.");	
		   }	   
		break;
		case 4: System.out.println("Multiplication Is:"+(num1*num2));
		break;
		case 5: System.out.println("Exiting....");
		default:System.out.println("Invalid choice, Please try again.");
		
		}
		scanner.close();
	}

}
