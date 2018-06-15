class A
{
	public void print()
	{
		char i;
		char j;
		for(i='A';i<='E';i++)
		{
			for(j='A';j<='E';j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}

class pattern8
{
	public static void main(String args[])
	{
		A a = new A();
		a.print();
	}
}

/*Pattern:
AAAAA
BBBBB
CCCCC
DDDDD
EEEEE
*/