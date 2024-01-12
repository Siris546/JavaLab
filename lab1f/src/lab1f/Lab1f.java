
package lab1f;
public class Lab1f {
    
    public static double arithmetic(int a, int b){
        double div;
        try{
            div = a/b;
        }
        catch(ArithmeticException e){
            System.out.println(e);
            div = 0;
        }
        return div;
    }
    
    public static void Index(){
        int arr[] = {1,2,3};
        try{
            System.out.println(arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    
    public static void Nullpointer(){
       String a = null;
       try{
        System.out.println(a.length());
       }
       catch(NullPointerException e){
           System.out.println(e);
       }
    }
    
    public static void Numberformat(){
        String s1 = "Siris";
        try{
            int num = Integer.parseInt(s1);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        arithmetic(100,0);
        Index();
        Nullpointer();
        Numberformat();
       
    }
}
