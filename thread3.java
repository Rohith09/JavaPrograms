import java.util.*;
class A extends Thread
{
	public void run()
	{
		String s=null;
		System.out.println("Please Enter a String:");
		Scanner sc = new Scanner(System.in);
		 s= sc.next();
		try
		{
			Thread.sleep(60000);
			sc.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		if(s==null)
		{
			System.out.println("Better Luck Next Time");
		}
		else
		{
			System.out.println("Congratulations");
		}
	}	
}
class thread3
{
	public static void main(String args[])
	{
		new A().start();
	}
}