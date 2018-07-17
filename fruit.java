

package practice;

public class Fruit {
   String name;
   String taste;
   String size;
   
   public void eat()
   {
    System.out.println("Fruit's name");
    System.out.println("Fruit's Taste");
   }
    
}
class Orange extends Fruit
{
    public void eat()
    {
        this.name="Orange";
        this.taste="Sweet";
        this.size="Small";
        System.out.println("This is the method of "+name+" Class and the "+name+" is "+taste+" and "+size+" .");
    }
}

class Apple extends Fruit
{
    public void eat()
    {
        this.name="Apple";
        this.taste="Tasteless";
        this.size="Big";
        System.out.println("This is the method of "+name+" Class and the "+name+" is "+taste+" and "+size+" .");
    }
}
class main
{
    
    public static void main(String []args)
    {
     Orange o = new Orange();
     o.eat();
     Apple a = new Apple();
     a.eat();
        
    }
}