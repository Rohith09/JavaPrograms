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
class B extends A          //B->A
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
class C extends A        //C->A
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
class hierarchical_inheritance
{
	public static void main(String []args)
	{
		C c1= new C();
		c1.methodA1();
		c1.methodA2();
		B b1= new B();
		b1.methodA1();
		b1.methodA2();
	}
}