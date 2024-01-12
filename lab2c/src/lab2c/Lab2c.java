/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2c;
import java.io.*;
import java.io.IOException;
/**
 *
 * @author user
 */
public class Lab2c {
    public static void main(String args[]) throws IOException {  
     
      FileInputStream in = null;
//      FileOutputStream out = null;

      try {
         in = new FileInputStream("D:\\CollegeStuffs\\7thsemPracticals\\JavaLab\\input.txt");
//         out = new FileOutputStream("D:\\output.txt");
         
         int c=0;
         while ((c = in.read()) != -1) {
             System.out.print((char)c);
//            out.write(c);
          }
      }
      catch(Exception e){
          System.out.println(e);
      }  

      finally {
         if (in != null) {
            in.close();
         }
//         if (out != null) {
//            out.close();
//         }
      }
      
//       char c;
//       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//       System.out.println("Enter characters 'q' to quit" );
//       do{
//       c=(char)br.read();
//       System.out.print(c);
//       }while(c!='q');
//      try{
//          FileOutputStream fo=new FileOutputStream("D:\\output.txt");
//      
//       String s="Hello Academians Hello world";
//       byte b[]=s.getBytes();
//       fo.write(b);
//       fo.close();
//      }
//      catch(IOException ioe){
//          System.out.println(ioe);
//      }
   }
}
