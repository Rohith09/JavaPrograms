class A
{
	A()
	{
		System.out.println("The default constructor of class A");
	}
	A(int x)
	{
		System.out.println("Parameterized constructor of class A with single parameter");
	}
	A(int x,int y)
	{
		System.out.println("Parameterized constructor of class A with two parameters");

	}
}

class constructor_overloading
{
	public static void main(String []args)
	{
		A a1= new A();           //Executes the default constructor
		A a2=new A(2);           //Executes Parameterized constructor of class A with single parameter
		A a3 = new A(12,21);      //Executes Parameterized constructor of class A with two parameters
	}
}