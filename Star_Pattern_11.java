package mypackage;

public class Star_Pattern_11 {

   public static void main(String[] args) {
		
		for(int i=1; i<=4; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				if(i>=1 && k>1)
				{
					System.out.print(" ");
				}
				else {
					System.out.print("*");	
				}
			}
			System.out.println(" ");
		}
	}
}
