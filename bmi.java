class Patient
{
	String name;
	double weight,height;
	public double BMI(double height,double weight)
	{
		this.height=height;
		this.weight=weight;
		double bmi = (weight/(height*height))*703;
		return bmi;
	}
}
class bmi
{
	public static void main(String args[])
	{
		Patient p = new Patient();
		p.name="Arnold";
		System.out.println("The BMI of " +p.name+ " is "+p.BMI(6.0,60.4));
		
	}
}