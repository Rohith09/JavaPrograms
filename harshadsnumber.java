class A
{
	public static void harshard(int s)
	{
		int x=s;
		int y=0,sum=0;
		while(x>0)
		{
			y=x%10;
			sum=sum+y;
			x=x/10;
		}
		if(s%sum == 0)
		{
			System.out.println("Its a Harshads Number");
		}
		else
		{
			System.out.println("Its is not a Harshads Number");
		}
	}
}
class harshadsnumber
{
	public static void main(String []args)
	{
		A.harshard(200);
	}
}