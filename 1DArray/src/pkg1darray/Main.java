
package pkg1darray;
public class Main {

    public static void main(String[] args) {
        int a[] = new int []{4,5,6,7,8,9};
        ArrayOp.print(a);
        ArrayOp ao = new ArrayOp();
        System.out.println("The sum of the elements in the array is "+ao.add(a));
        
    }
    
}
class ArrayOp
{
    static void print(int a[])  //Method for printing all the values present within the array
    {
        for(int x:a)
        {
            System.out.println(x);
        }
    }
       int add(int a[])        //Method for calculating the sum of all the elements in the array.
    {
        int s=0;
        for(int x:a)
        {
           s+=x; 
        }
        return s;

    }
}
 