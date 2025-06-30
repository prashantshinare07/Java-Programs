// Program to count vowels and consonants from string
package mypackage;

import java.util.Scanner;

public class Vowels_Consonant {
	
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String str=sc.nextLine().toLowerCase();  

        int vowels=0; 
        int consonants=0;
        for(int i=0; i<str.length(); i++) 
        {
            char ch=str.charAt(i);

            if(ch>='a' && ch<='z')
            {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
                {
                    vowels++;
                }
                else
                {
                    consonants++;
                }
            }
        }
        System.out.println("Total Vowels:"+vowels);
        System.out.println("Total Consonants:"+consonants);
        sc.close();
    }
}
