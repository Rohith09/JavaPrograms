 interface Movable
{

}
class Car implements Movable{
	
}
 class House
{
	String address;
}
 class MyUtils
{
	
	public void move(Object obj)
	{
			if(obj instanceof Movable)
			{
				System.out.println("Success");
			}
			else
			{
				
				System.out.println("Failure");
			}
	}
}

public class marker{
public static void main(String args[])
{
	Car c = new Car();
	House h = new House();
	MyUtils mu = new MyUtils();
	mu.move(c);
	mu.move(h);

}
}