class A
{
	public void methodA1()
	{
		System.out.println("First Method of Class A");
	}
	public void methodA2()
	{
		System.out.println("Second Method of Class A");
	}
}

class B extends A           //This line performs  the Single Level Inheritance in Java.Extending the methods of Class A into CLass B.
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

class C extends B           //This Shows the inheritance of Class B into Class C. Class B has already extended Class A.
{
	public void methodC1()
	{
		System.out.println("First Method of Class C");
	}
	public void methodC2()
	{
		System.out.println("Second Method of Class C");

	}
}

class multi_level_inheritance
{
	public static void main(String[]args)
	{
		C c1= new C();
		c1.methodA1();
		c1.methodA2();
		c1.methodB1();
		c1.methodB2();
		c1.methodC1();
		c1.methodC2();
	}

	
}