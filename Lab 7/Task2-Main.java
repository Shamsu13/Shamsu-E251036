class Shape {

    double area(double length, double width) {
        return length * width;
    }

    double area(double radius) {
        return 3.1416 * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {

        Shape s = new Shape();

        double rectangleArea = s.area(10, 5);  
        double circleArea = s.area(7);   
            
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Circle: " + circleArea);
    }
}
