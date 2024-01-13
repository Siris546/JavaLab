
package lab1;

public class Lab1 {
    public static void main(String[] args) {
        int tBase = 10;
        int tHeight = 5;
        
        int tLength = 9;
        int tBreadth = 8;
        
        Triangle T1 = new Triangle();
        float triangleAreaResult = T1.Area(tBase,tHeight);
        System.out.println("Area of the triangle is: " + triangleAreaResult);
        
        Rectangle R1 = new Rectangle();
        float rectAreaResult = R1.Area(tLength,tBreadth);
        System.out.println("Area of the Rechtangle is: " + rectAreaResult);
    }
}