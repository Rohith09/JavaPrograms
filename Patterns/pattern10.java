class A
{
	public void print()
	{
		for(int i=5;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
class pattern10
{
	public static void main(String []args)
	{
		A a = new A();
		a.print();

	}
}

/* Pattern 
*****
****
***
**
*
*/