package lab2d;

import java.io.*;

public class Lab2d {

    public static void main(String[] args) {
        FileOutputStream out = null;

        try {
            out = new FileOutputStream("D:\\CollegeStuffs\\7thsemPracticals\\JavaLab\\output.txt");
            String s = "Hello Academians Hello world";
            byte b[] = s.getBytes();
            out.write(b);
        } 
        catch (IOException ioe) {
            System.out.println(ioe);
        } 
        finally{
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
