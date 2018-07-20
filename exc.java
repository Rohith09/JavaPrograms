import java.util.Scanner;
import java.lang.*;
public class exc
{
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0;
		try
		{
			
			 c=a/b;
			
		}
		catch(ArithmeticException ex)
		{
			ex.printStackTrace();
			
		}
		System.out.println("Division is :"+c);
		System.out.println("Thanks !");
		
	}
}