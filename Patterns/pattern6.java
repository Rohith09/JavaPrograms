class A
{
	public void print()
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=1;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}

class pattern6
{
	public static void main(String args[])
	{
		A a = new A();
		a.print();
	}
}

/*Pattern:
55555
44444
33333
22222
11111
*/