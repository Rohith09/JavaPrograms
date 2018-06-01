//Anonymous classes are created when we want to use a single method from multiple methods which belong to single class.

class A
{
	public void m1()
	{
		System.out.println("First Method");
	}
		public void m2()
	{
		System.out.println("Second Method");
	}
		public void m3()
	{
		System.out.println("Third Method");
	}
		public void m4()
	{
		System.out.println("Fourth Method");
	}
		public void m5()
	{
		System.out.println("Fifth Method");
	}
		public void m6()
	{
		System.out.println("Sixth Method");
	}
}
class demo
{
	public static void main(String []args)
	{
			A a = new A()
			{
				public void m1()
				{
					System.out.println("Anonymous Class");
				}
			};
			a.m1();
	}
}