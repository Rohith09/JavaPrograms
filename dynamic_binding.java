//The following is the program for runtime polymorphism.
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
		public void display()
	{
		System.out.println("Display Method of Child Class");
	}
}

public class dynamic_binding
{
	public static void main(String []args)
	{
		A a1 = new B();   //Upcasting the Classes. Reference of the parent class will the object of the child class
		a1.show();
		a1.display();
		//a1.print();       Cannot find print(Compile Time Error)
	}




}