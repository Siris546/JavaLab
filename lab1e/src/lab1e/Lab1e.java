
package lab1e;
public class Lab1e {
    int num1;
    int num2;
    public static double divide(int a,int b){
        double quotient;
        try{
            quotient = a/b;
        }
        catch(Exception e){
            System.out.println("Error :" + e + " occured" );
            quotient = 0;
        }
        finally{
            System.out.println("This line is always executed no matter what");
        }
        return quotient;
    }
    public static void main(String[] args) throws Exception {
        double result = divide(100,0);
        System.out.println(result);
        try{
        int a = 9;
        if(a<10){
            throw new Exception("Dont give number less than 10");
        }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
