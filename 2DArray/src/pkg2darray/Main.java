
package pkg2darray;
public class Main {

    public static void main(String[] args) {
        int a[][]= new int [][]{{1,2,3},{4,5,6},{7,8,9}};
        ArrayOp.print(a);
        
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
}
