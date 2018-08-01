class A   extends Thread{
	public void run()
	{
	for(int i=1;i<=100;i++)
	{
		System.out.print(i);
	}
	}
}
class B extends Thread{
	public void run()
	{
		for(int j=1;j<=100;j++)
	{
		System.out.print(j);
	}
	}
}
class thread4
{
	public static void main(String args[])
	{
		A a = new A();
		a.start();
		try
		{
			a.join();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		B b = new B();
		b.start();
		try
		{
			b.join();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		System.out.println("Program End");
		
	}
}
