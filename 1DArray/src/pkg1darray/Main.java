
package pkg1darray;
public class Main {

    public static void main(String[] args) {
        int a[] = new int []{1,2,3,4,5,6,7,8,9,10};
        ArrayOp.print(a);
        ArrayOp ao = new ArrayOp();
        System.out.println("The sum of the elements in the array is "+ao.add(a));
        System.out.println("The max element in the array is "+ao.max(a));

        
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
       int max(int a[])       //Method to find the max element of the given array.
       {
           int max=a[0];
           for (int x:a)
           {
               if(x>max)
               {
                   max=x;
               }
           }
           
           return max;
       }
}
 