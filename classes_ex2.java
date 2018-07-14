class Calculator 
{
	
	static double powerInt(int num1,int num2)
	{
		double res1=Math.pow(num1,num2);
		return res1;

	}
	static double powerDouble(double num1,int num2)
	{
		double res2=Math.pow(num1,num2);
		return res2;
	}

}
class classes_ex2
{
	public static void main(String []args)
	{
		System.out.println(Calculator.powerInt(10,12));
		System.out.println(Calculator.powerDouble(2.2,2));
	}
	

}