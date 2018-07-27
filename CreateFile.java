import java.io.File;

 class CreateFile
{

    
 public static void main(String []args)
   
  {
 
      try
     
      {
   
         File file = new File("D:\\hello.txt");
   
         boolean stat =file.createNewFile();
 
            if(stat)
    
               {
           
                  System.out.println("File Successfully created!");
    
               }
  
            else
    
               {
            
                  System.out.println("File not created!");
       
               }
     
   
    }
      
       catch(Exception ex)
     
       {
         
           System.out.println(ex);
    
       }
        
 
   }

}