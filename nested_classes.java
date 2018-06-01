class A          //Outer or Upper Class
{
	int x=10;  //member 1
	public void m1()     //member 2
	{
		System.out.println("Hello");
	}
	class B        //non static nested class or inner class
	{
		int y=20;     //member 3
		public void m2()      //member 4
		{
			System.out.println("Hi");
		}
	}
}

class nested_class
{
	public static void main(String []args)
	{
		A a = new A();     //creating the object of A (Normal way)
		System.out.println(a.x);
		a.m1();
		A.B b = a.new B();    // The non static members of the class will be accessed by using the object and the dot operator. As B is a nested class A.B needs to be mentioned.
		System.out.println(b.y);
		b.m2();

	}
}