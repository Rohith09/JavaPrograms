class A
{
	public void hello()
	{
		System.out.println("Hello");
	}
}
class B extends A
{
	public void sub_hello()
	{
		super.hello();
	}
	public void hello()
	{
		System.out.println("Hi");
	}

}
class super_keyword
{
	public static void main(String []args)
	{
		B b1= new B();
		b1.hello();
	}
}