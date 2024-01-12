
package lab1b;

public class Lab1b {

    public static void main(String[] args) {
        int length = 20;
        int breadth = 30;
        
        double base = 3.5;
        double height = 7.9;
        
        Shape Rect = new Shape(length, breadth);
        Shape Triangle = new Shape(base,height);
        
        int RectArea = Rect.Area(length, breadth);
        double TriArea = Triangle.Area(base, height);
        
        System.out.println("Area of Rectangle is: " + RectArea);
        System.out.println("Area of Triangle is: " + TriArea);
    }
}
