package Abstraction;

abstract class Shape {
    String color;
 
    // these are abstract methods
    // and dont need to be implemented or return
    // anything because they can will be 
    // overriden anyways.
    abstract double area();
    public abstract String toString();
 
    // abstract class can have the constructor
    public Shape(String color)
    {
        System.out.println("Shape constructor called");
        this.color = color;
    }
 
    // this is a concrete method
    public String getColor() { return color; }
}


class Circle extends Shape {
    // you can add fields to satisfy the needs
    // of the object that extends the abstract
    // parent class.
    double radius;
 
    public Circle(String color, double radius)
    {
        // The default constructor must be
        // present at all times.

        // calling Shape constructor
        // the "super" token asks for the 
        // default constructor of the abstract class.

        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }
 
    @Override double area()
    // We define the particular area method 
    // by annotating with for overriding.
    {
        return Math.PI * Math.pow(radius, 2);
    }
 
    @Override public String toString()
    {
        return "Circle color is " + super.getColor()
            + " and area is : " + area();
    }
}
class Rectangle extends Shape {
    // Same as for the circle object
    // we will define particular fields 
    // to satisfy the needs of our object.
    double length;
    double width;
 
    public Rectangle(String color, double length,
                     double width)
    {
        // calling Shape constructor
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }
 
    @Override double area() { return length * width; }
    // We override the area method to satify the 
    // rectangle area formula.
    
    @Override public String toString()
    {
        return "Rectangle color is " + super.getColor()
            + "and area is : " + area();
    }
}
