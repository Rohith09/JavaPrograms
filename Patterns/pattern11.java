class A
{
	public void print()
	{
		int n=5;
		//int z=1;
		for(int i=1;i<=n;i++)
		{
			for (int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			//z++;
			

		}

	}

}
class pattern11
{
	public static void main(String []args)
	{
		A a = new A();
		a.print();

	}
}

