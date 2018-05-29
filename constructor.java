class A
{
	int x;
	A()
	{
		x=2;
	}
	void display()
	{
		System.out.println("Value of x = "+x);
	}

}
class constructor
{
	public static void main(String[]args)
	{
		A a1= new A();
		a1.display();
	}
}