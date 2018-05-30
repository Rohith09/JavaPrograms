class A
{
	int x=10;
	void m1()
	{
		x=2;
		this.x=x;
		System.out.println(x);
		System.out.println(this.x);

	}
}
class this_keyword3
{
	public static void main(String []args)
	{
		A a1 = new A();
		System.out.println(a1.x);
		a1.m1();
		System.out.println(a1.x);
	}
}