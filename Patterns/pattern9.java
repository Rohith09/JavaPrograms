class A
{
	public void print()
	{

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
		
}


class pattern9
{
	public static void main(String args[])
	{
		A a = new A();
		a.print();
	}
}

/*Pattern:

*/