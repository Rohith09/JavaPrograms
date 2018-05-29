class A                //Parent Class or Super Class
{
	public void show()
	{
		System.out.println("Show Method of Parent Class");
	}
	public void display()
	{
		System.out.println("Display Method of Parent Class");
	}
}

class B extends A{               //here B is the child class and it extends the Parent class
	public void show()           //this method will override the show method of the parent class
	{
		System.out.println("Show Method of Child Class");
	}
	public void print()
	{
		System.out.println("Print Method of Child CLass");
	}
}

class polymorphism
{
	public static void main(String []args)
	{
		B b = new B();
		b.show();
		b.print();
		b.display();
	}




}