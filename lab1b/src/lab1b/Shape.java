
package lab1b;
public class Shape {
   int length, breadth;
   double base, height;
    public Shape(int a,int b){
        this.length = a;
        this.breadth = b;
    }
    public Shape(double a,double b){
        this.base = a;
        this.height = b;
    }
    public int Area(int length, int breadth){
        return length * breadth;
    }
    
    public double Area(double base, double height){
        return (base * height)/2;
    }
}
