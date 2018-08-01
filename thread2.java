import java.util.*;

class A extends Thread
{
	String s=null;
	int ran=0;
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		 this.s = sc.next();
		Random rand = new Random();
		ran=rand.nextInt(10);
		System.out.println("The Password Is:"+s+""+ran);
	}	
}

class thread2
{
	public static void main(String args[])
	{
		new A().start();
	}
}