
package stringex;

public class StringEx {

    public static void main(String[] args) {
        String s = "INCAPP";
        StringOp so = new StringOp();
        so.print1(s);
    }
    
}
class StringOp
{
    public  void print1(String s)
    {
        for(int x=0;x<s.length();x++)
        {
            for(int y=0;y<=x;y++)
            {
                System.out.print(s.charAt(y));
            }
             System.out.println();
        }
       
    }
}
