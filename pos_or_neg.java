class A
{
	int a=19;
	public void check_stat()
	{
		if(a < 0)
	{
		System.out.println("Negative");
	}
	if(a > 0)
	{
		System.out.println("Positive");
	}
	else
	{
		System.out.println("Zero");
	}

	}
	
}
class pos_or_neg
{
	public static void main(String []arghs)
	{
		A a = new A();
		a.check_stat();
	}
}