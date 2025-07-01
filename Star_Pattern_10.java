package mypackage;

public class Star_Pattern_10 {

   public static void main(String[] args) {
		
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=4; k>=i; k--)
			{
				System.out.print("*");
			}
			for(int R=3; R>=i; R--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
