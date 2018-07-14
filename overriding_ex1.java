class Shape
{
	public void Erase()
	{
		System.out.println("Erasing Shape");
	}
	public void Draw()
	{
		System.out.println("Drawing Shape");
	}
}
class Circle extends Shape
{
	public void Erase()
	{
		System.out.println("Erasing Circle");
	}
	public void Draw()
	{
		System.out.println("Drawing Circle");
	}
}
class Triangle extends Shape
{
	public void Erase()
	{
		System.out.println("Erasing Triangle");
	}
	public void Draw()
	{
		System.out.println("Drawing Triangle");
	}
}
class Square extends Shape
{
	public void Erase()
	{
		System.out.println("Erasing Square");
	}
	public void Draw()
	{
		System.out.println("Drawing Square");
	}
}

class overriding_ex1
{
	public static void main(String []args)
	{
		Shape sh = new Circle();
		sh.Erase();
		sh.Draw();
		Shape t = new Triangle();
		t.Erase();
		t.Draw();
		Shape s = new Square();
		s.Erase();
		s.Draw();
	}
}
