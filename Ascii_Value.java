// Program to find ASCII Value
package mypackage;

import java.util.Scanner;

public class Ascii_Value {
	
    public static void main(String[] args) 
    {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a character:");
        char ch= scanner.next().charAt(0);  
        
        int ascii= (int)ch;  
        System.out.println("ASCII value of '"+ch+"' is: " +ascii);
        scanner.close();
    }
}
