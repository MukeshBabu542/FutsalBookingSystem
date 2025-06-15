package taskabstraction;

// 2. Create an abstract class called Shape with an abstract method called calculateArea().
// Implement two subclasses called Rectangle and Circle that inherit from Shape.
// Override the calculateArea() method in both subclasses to calculate and return the area.
// Write the Java code to implement this scenario with Scanner Input.

import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and width of rectangle: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        Shape rect = new Rectangle(l, w);
        System.out.println("Area of Rectangle: " + rect.calculateArea());

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        Shape circle = new Circle(r);
        System.out.println("Area of Circle: " + circle.calculateArea());

        sc.close();
    }
}