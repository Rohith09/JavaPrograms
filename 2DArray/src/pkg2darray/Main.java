
package pkg2darray;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int a[][]= new int [][]{{1,2,3},{4,5,6},{6,6,9}};
        ArrayOp.print(a);
        ArrayOp ao = new ArrayOp();
        System.out.println("Sum= "+ao.add(a));
        ao.max(a);
        ao.min(a);
        ao.freq(a);
        
    }
    
}
class ArrayOp
{
    static void print(int a[][])
    {
        for(int x=0;x<a.length;x++)
        {
            for(int y=0;y<a[x].length;y++)
            {
                System.out.print(a[x][y]+"");
            }
            System.out.println();
        }
    }
    int add(int a[][])      //Method to find the sum of the elements in the 2D array.
            
    {
        int s=0;
        for(int x[]:a)
        {
            for(int y:x)
            {
                s+=y;
            }
        }
       return s;
    }
    void max(int a[][])       //To find the maximum element in the array
            {
                for(int x[]:a)
                {
                    int max = x[0];
                    for(int y:x)
                       {
                        if(y>max)
                            {
                                 max=y;
                              
                            }
                         

                        }          
                    System.out.println("The max element is "+max);

                }

            }
    void min(int a[][])     //To find the minimum element in the array
            {
                for(int x[]:a)
                {
                    int min = x[0];
                    for(int y:x)
                       {
                        if(y<min)
                            {
                                 min=y;
                              
                            }
                         

                        }          
                    System.out.println("The min element is "+min);

                }

            }
    void freq(int a[][])       //To find the frequency of the elements
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int z=0;
        for(int x[]:a)
        {
            for(int y:x)
            {
                if(map.containsKey(y))
                {
                    map.put(y, z+1);
                }
                else
                {
                    map.put(y, 1);
                }
            }
        }
        System.out.println(map);
    }
}


    