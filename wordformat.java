
package javaapplication1;

import java.util.Scanner;

public class wordformat {
    public String process(int i)
    {
     
        int num=i;
        String res=" ";
        while(num>0)
        {
            int x= num%10;
            num=num/10;
            res = proc(x)+res; 
        }
        return res;
         
    }

  public String proc(int x)
{
if(x==0)
            {
                return "Zero";
            }
            if(x==1)
            {
                return "One";
            }
             if(x==2)
            {
                return "Two";
            }
            if(x==3)
            {
                return "Three";
            }
             if(x==4)
            {
                return "Four";
            }
            if(x==5)
            {
                return "Five";
            }
             if(x==6)
            {
                return "Six";
            }
            if(x==7)
            {
                return "Seven";
            }
             if(x==8)
            {
                return "Eight";
            }
             else 
            {
                return "Nine";
            }
}
    
}
class main{
    public static void main(String args[])
    {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        wordformat wf = new wordformat();
        System.out.println(wf.process(x));
        
    }
}

 
