class A
{
	void print()
	{
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.println(j);
			}
			System.out.println();
		}
	}
}
class pattern3
{
	public static void main(String args[])
	{
			A a = new A();
	 		a.print();
	}

}