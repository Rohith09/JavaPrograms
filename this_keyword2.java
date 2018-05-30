class A
{
	int x=10;         //this is a variable at class level
	void method1()
	{
		this.x=9;        //this is a local variable 
		System.out.println("X="+x);
	}
}
class this_keyword2
{
	public static void main(String []args)
	{
		A a1 = new A();
		a1.method1();
		System.out.println(a1.x);

	}

}