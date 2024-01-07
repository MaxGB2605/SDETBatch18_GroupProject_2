package org.example;

public interface A_11_ShapeInterface {
    double calculateArea();
    double calculatePerimeter();
}
class Circle implements A_11_ShapeInterface{
    static double pi = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return pi*(radius*radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2*pi*radius;
    }
}
class Square implements A_11_ShapeInterface{
    private double length;
    private double width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(length+width);
    }
}
class ShapeTester{
    public static void main(String[] args) {
        Circle c=new Circle(7);
        double a = c.calculateArea();
        double p = c.calculatePerimeter();
        System.out.println("Circle area: "+a+". Perimeter is: "+p);

        Square s = new Square(5,5);
        double a1=s.calculateArea();
        double p2= s.calculatePerimeter();
        System.out.println("Square area is: "+a1+". Perimeter is: "+p2);
    }
}
