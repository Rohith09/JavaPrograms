class A
{
	A()
	{
		System.out.println("Default Constructor of class A");

	}
	A(int x)
	{
		System.out.println("Parameterized Constructor of class A");
	}

}
class parameterized_constructor
{
	public static void main(String[]args)
	{
		A a1= new A(2);
	}
}