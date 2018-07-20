class A
{
	public void even_odd(int a)
	{
		int x = a;
		if(x%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
}
class even_odd
{
	public static void main(String args[])
	{
		A a = new A();
		a.even_odd(16);
	}
}