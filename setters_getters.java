 class A
{
	//Declaring private variables which can only be accessed by the public methods of the class 
	private String geekName;
	private int geekAge;
	private int geekRoll;

	public int getAge() //get method to access the private variable geekAge
	{
		return geekAge;
	}

	public String getName()  //get method to access the private variable geekName
	{
		return geekName;
	}

	public int getRoll()  //get method to access the private variable geekRoll
	{
		return geekRoll;
	}

	public void setAge(int newAge)  //set method for age to access the private variable geekAge
	{
		geekAge = newAge;
	}
	public void setName(String newName)  //set method for name to access the private variable geekName
	{
		geekName= newName;
	}
	public void setRoll(int newroll)    //set method for roll to access the private variable geekRoll
	{
		geekRoll= newroll;
	}


}

public class setters_getters
{
	public static void main(String args[])
	{
		A obj = new A();

		obj.setRoll(01);
		obj.setName("Rohith");
		obj.setAge(19);
		System.out.println("Geek's Name:"+obj.getName());
		System.out.println("Geek's Roll:"+obj.getRoll());
		System.out.println("Geek's Age:"+obj.getAge());

	}

}