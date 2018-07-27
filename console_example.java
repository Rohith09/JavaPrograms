import java.io.Console;
class console_example
{
	public static void main(String args[])
	{
	
		Console c = System.console();
		System.out.println("enter your name:");
		String s = c.readLine();
		System.out.println("Welcome to:"+s);
	}
}