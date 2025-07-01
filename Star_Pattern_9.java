package mypackage;

public class Star_Pattern_9 {

   public static void main(String[] args) {
		
		for(int i=1; i<=4; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int R=2; R<=i; R++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
