
package firstapp;


public class FirstApp {

    
    public static void main(String[] args) {
        p1.A a = new p1.A();
        System.out.println(a.a);
        a.methodA();
        p1.B b = new p1.B();
        System.out.println(b.b);
        b.methodB();
        p2.A c = new p2.A();
        System.out.println(c.c);
        c.methodC();
        p2.D d = new p2.D();
        System.out.println(d.d);
        d.methodD();
    }
    
}
