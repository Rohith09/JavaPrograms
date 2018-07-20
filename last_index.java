class A
{
	public void last(String x)
	{
		int s = 0;
		s=x.length(); 
		System.out.println("The last index of the string is "+(s-1));
	}	
}
class last_index
{
	public static void main(String args[])
	{
		A a = new A();
		a.last("Rohith");
	}
}