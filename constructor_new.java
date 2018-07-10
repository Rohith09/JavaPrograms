

package javaapplication1;

public class Construct {
    String a;
    int b;
    int c;
    Construct()
    {
        a="Rohith";
        b=30;
        c=45;
    }
    Construct(String x, int y)
    {
        a=x;
        b=y;  //there wont be any ambiguity so we dont use this keyword.
        
    }
    Construct(String x, int y,int t)
    {
        this.a=x;
        this.b=y;
        this.c=t;  //used as an object to access member variable and member function. and because of ambuiguity.
   }
    void display()
    {
        System.out.println("Hello.....");
        System.out.println("Name is"+a);
        System.out.println("Age is "+b);
        System.out.println("Marks are "+c);
        
    }
    
    public static void main(String args[])
    {
        Construct c1 = new Construct();
        c1.display();
        Construct c2 = new Construct("Rachit",20);
        c2.display();
        Construct c3 = new Construct("Himanshu",19,90);
        c3.display();

    }
}
