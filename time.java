class A
{
	public void time(String a)
	{
		String b=" ";
		String arr[] = a.split(":|[A-Z]");
		int arr2[]=new int[arr.length];
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=Integer.valueOf(arr[i]);
		}
		String t[] = a.split("[0-9]|:");
		for (int i=0;i<t.length;i++)
		{
			if (t[i].equals("PM"))
			{
				arr2[0]+=12;	
			}
		}
		for(int j=0;j<=arr2.length-1;j++)
		{
			if(j==arr2.length-1)
			{     if (arr2[j]/10==0)
	                        b=b+z+String.valueOf(arr2[j]);
			       else
				b+=String.valueOf(arr2[j]);	
				break;
			}
			if (arr2[j]/10==0)
	                        b=b+z+String.valueOf(arr2[j])+":";
			       else
				b+=String.valueOf(arr2[j])+":";
		}
		System.out.println(b);
	}
}
class time
{
	public static void main(String args[])
	{
		A a = new A();
		a.time("07:05:45AM");
	}
}
