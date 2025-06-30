// Program to print table
package mypackage;

import java.util.Scanner;

public class Print_Table {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter number to print table:");
		int num=scanner.nextInt();
		for(int i=1; i<=10; i++)
		{
			//System.out.println(num*i);
			System.out.println(num+"*"+i+"="+num*i);
		}
		scanner.close();
	}

}
