
package pkg1darray;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int a[] = new int []{1,2,3,4,5,6,7,8,9,10,2,3,4,5,6,7};
        ArrayOp.print(a);
        ArrayOp ao = new ArrayOp();
        System.out.println("The sum of the elements in the array is "+ao.add(a));
        System.out.println("The max element in the array is "+ao.max(a));
        System.out.println("The min element in the array is "+ao.min(a));
        ao.freq(a);


        
    }
    
}
class ArrayOp
{
    int z=0;
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
              int min(int a[])       //Method to find the min element of the given array.
       {
           int min=a[0];
           for (int x:a)
           {
               if(x<min)
               {
                   min=x;
               }
           }
           
           return min;
       }
              void freq(int a[])
              {
                  int z=1;
                  HashMap<Integer,Integer> map = new HashMap<>();
                  for(int x:a)
                  {
                      if(map.containsKey(x))
                      {
                          map.put(x, z+1);
                      }
                      else
                      {
                          map.put(x, z);
                      }
                      
                  }
                  System.out.println(map);
                  }
}