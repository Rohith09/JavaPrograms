class A
{
	void print()
	{
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
class pattern5
{
	public static void main(String args[])
	{
			A a = new A();
	 		a.print();
	}

}

/* Pattern

11111
22222
33333
44444
55555
*/