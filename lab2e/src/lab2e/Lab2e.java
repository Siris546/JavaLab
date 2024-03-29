
package lab2e;
import java.io.*;

public class Lab2e {

    public static void main(String[] args)throws IOException {
       FileInputStream in = null;
       FileOutputStream out = null;
       
       try{
           in = new FileInputStream("D:\\CollegeStuffs\\7thsemPracticals\\JavaLab\\input1.txt");
           out = new FileOutputStream("D:\\CollegeStuffs\\7thsemPracticals\\JavaLab\\output1.txt");
           
           int c;
           while((c = in.read())!= -1){
            out.write(c);
           }
       }
       catch(IOException ioe){
           System.out.println(ioe);
       }
       finally{
           try {
                if (out != null) {
                    out.close();
                }
                if(in != null){
                    in.close();
                }
                
            } catch (IOException e) {
                System.out.println(e);
            }
       }
    }
}
