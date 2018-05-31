abstract class A                 //Here class A is an abstract class. In an abstract class it is not necessary to have every member as abstract. If any method is abstract then the parent class should override that abstract method. 
{
	public abstract void method1();       //This is an abstract method of class A

	public void method2()
	{
		System.out.println("Method 2");
	}

}
class B extends A{
	public void method1()
	{
		System.out.println("Providing body to the abstract method of class A");
	}
	public void method3()
	{
		System.out.println("Method 3 of B");
	}
}
class abstraction
{
	public static void main(String []args)
	{
		// A a= new A();     This line would give an error as we cannot instantiate an abstract method
		B b = new B();
		b.method1();
		b.method3();
	} 
}