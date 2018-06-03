
package pkg2darray;
public class Main {

    public static void main(String[] args) {
        int a[][]= new int [][]{{1,2,3},{4,5,6},{7,8,9}};
        ArrayOp.print(a);
        ArrayOp ao = new ArrayOp();
        System.out.println("Sum= "+ao.add(a));
        
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
}
