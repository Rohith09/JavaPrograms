
package pkg1darray;
public class Main {

    public static void main(String[] args) {
        int a[] = new int []{4,5,6,7,8,9};
        ArrayOp.print(a);
        
    }
    
}
class ArrayOp
{
    static void print(int a[])
    {
        for(int x:a)
        {
            System.out.println(x);
        }
    }
}
