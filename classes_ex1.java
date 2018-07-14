class Box
{
	double width;
	double height;
	double depth;
	public void init(double width,double height,double depth)
	{
		this.width=width;
		this.depth=depth;
		this.height=height;

	}
	public double volume()
	{
		double vol = width*height*depth;

		return vol;

	}
}
class classes_ex1
{
	public static void main(String []args)
	{
		Box b = new Box();
		b.init(2.3,5.6,3.6);
		System.out.println("The volume of the box is"+b.volume());
	}
}