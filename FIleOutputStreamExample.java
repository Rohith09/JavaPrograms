import java.io.FileOutputStream;  
 class FileOutputStreamExample {  
    public static void main(String args[]){    
           try{    
		     String s="My name is Rohith";
			 byte b[]=s.getBytes();
             FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
             fout.write(b);    
             fout.close();    
             System.out.println("Created file");    
            }
			catch(Exception e)
			{
				System.out.println(e);
			}    
      }    
}