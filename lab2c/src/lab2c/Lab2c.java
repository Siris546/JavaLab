
package lab2c;
import java.io.*;
import java.io.IOException;

public class Lab2c {
    public static void main(String args[]) throws IOException {  
     
      FileInputStream in = null;

      try {
         in = new FileInputStream("D:\\CollegeStuffs\\7thsemPracticals\\JavaLab\\input.txt");
         
         int c=0;
         while ((c = in.read()) != -1) {
             System.out.print((char)c);
          }
      }
      catch(Exception e){
          System.out.println(e);
      }  

      finally {
         if (in != null) {
            in.close();
         }

      }
   }
}
