class A
{
	public void print()
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

class pattern7
{
	public static void main(String args[])
	{
		A a = new A();
		a.print();
	}
}

/*Pattern:
54321
54321
54321
54321
54321
*/