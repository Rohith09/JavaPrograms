class A
{
	public void methodA1()
	{
		System.out.println("First Method of Class A");
	}
	public void methodA2()
	{
		System.out.println("Second Method of Class B");
	}
}

class B extends A           //This Shows the Single Level Inheritance in Java.Extending the methods of Class A into CLass B.
{
	public void methodB1()
	{
		System.out.println("First Method of Class B");
	}
	public void methodB2()
	{
		System.out.println("Second Method of Class B");
	}
}

class single_level_inheritance
{
	public static void main(String []args)
	{
		B b1 = new B();
		b1.methodA1();   //Calling method of Super Class
		b1.methodA2();   //Calling method of Super Class
		b1.methodB1();
		b1.methodB2();

	}
}