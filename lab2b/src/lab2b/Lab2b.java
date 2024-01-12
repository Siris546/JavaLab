package lab2b;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char op;
        double num1, num2;

        try {
            System.out.println("Enter the 1st operand");
            num1 = sc.nextDouble();

            System.out.println("Enter the 2nd operand");
            num2 = sc.nextDouble();

            System.out.println("Enter the operator");
            op = sc.next().charAt(0);

            calculateAndDisplayResult(num1, num2, op);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    private static void calculateAndDisplayResult(double num1, double num2, char op) {
        double result;

        switch (op) {
            case '+':
                result = num1 + num2;
                displayResult(num1, num2, op, result);
                break;
            case '-':
                result = num1 - num2;
                displayResult(num1, num2, op, result);
                break;
            case '*':
                result = num1 * num2;
                displayResult(num1, num2, op, result);
                break;
            case '/':
                try {
                    if (num2 != 0) {
                        result = num1 / num2;
                        displayResult(num1, num2, op, result);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                } catch (ArithmeticException e) {
                    System.out.println("An arithmetic error occurred: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid input operator");
                break;
        }
    }

    private static void displayResult(double num1, double num2, char op, double result) {
        System.out.println(num1 + " " + op + " " + num2 + " = " + result);
    }
} 


//import java.util.Scanner;
//public class Lab2b {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        char op;
//        double num1, num2;
//        try{
//        System.out.println("Enter the 1st operand");
//        num1 = sc.nextDouble();
//        System.out.println("Enter the 2nd operand");
//        num2 = sc.nextDouble();
//        System.out.println("Enter the operator");
//        op = sc.next().charAt(0) ;
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//        
//        double result;
//        switch(op){
//            case '+':
//                result = num1 + num2;
//                System.out.println(num1 + " + " + num2 + " = " + result);
//                break;
//            case '-':
//                result = num1 - num2;
//                System.out.println(num1 + " - " + num2 + " = " + result);
//                break;
//            case '*':
//                result = num1 * num2;
//                System.out.println(num1 + " * " + num2 + " = " + result);
//                break;
//            case '/':
//                try{
//                result = num1 / num2;
//                System.out.println(num1 + " / " + num2 + " = " + result);
//                }
//                catch(Exception e){
//                    System.out.println(e);
//                }
//                break;
//            default:
//                System.out.println("Invalid Input operator");
//                break;
//        }
//        sc.close();
//        
//    }
//}
