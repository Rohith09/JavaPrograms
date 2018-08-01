class A   extends Thread{
	public void run()
	{
		System.out.println("Hello");
		try{
			Thread.sleep(10000);
			System.out.println("Bye");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}

		

class thread1
{
	public static void main(String args[])
	{
		new A().start();
		
	}
}