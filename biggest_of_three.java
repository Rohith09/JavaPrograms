class A
{
	public static void check(int a,int b,int c)
	{
		String x = a>b && a>c ? "A is Big": b>a && b>c ? "B is big" : c>a && c>b ? "C is big" : "Equal";
		System.out.println(x);
	}
}
class biggest_of_three
{
	public static void main(String args[])
	{
		A a = new A();
		a.check(40,50,60);
	}
}