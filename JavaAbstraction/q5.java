package taskabstraction;

// 5. Design an abstract class named "Draw" with abstract methods:
// calculateVolume(), calculateArea(), calculatePerimeter()
// Create subclasses: Cube, Cuboid, Cylinder and implement them.

abstract class Draw {
    abstract double calculateVolume();
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Cube extends Draw {
    double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    double calculateVolume() {
        return Math.pow(side, 3);
    }

    @Override
    double calculateArea() {
        return 6 * side * side;
    }

    @Override
    double calculatePerimeter() {
        return 12 * side;
    }
}

class Cuboid extends Draw {
    double length, width, height;

    Cuboid(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    @Override
    double calculateVolume() {
        return length * width * height;
    }

    @Override
    double calculateArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    double calculatePerimeter() {
        return 4 * (length + width + height);
    }
}

class Cylinder extends Draw {
    double radius, height;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    @Override
    double calculateVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius * 2; // Circumference of top + bottom
    }
}

public class q5 {
    public static void main(String[] args) {
        Draw cube = new Cube(4);
        Draw cuboid = new Cuboid(3, 4, 5);
        Draw cylinder = new Cylinder(3, 7);

        System.out.println("Cube -> Volume: " + cube.calculateVolume() + ", Area: " + cube.calculateArea() + ", Perimeter: " + cube.calculatePerimeter());
        System.out.println("Cuboid -> Volume: " + cuboid.calculateVolume() + ", Area: " + cuboid.calculateArea() + ", Perimeter: " + cuboid.calculatePerimeter());
        System.out.println("Cylinder -> Volume: " + cylinder.calculateVolume() + ", Area: " + cylinder.calculateArea() + ", Perimeter: " + cylinder.calculatePerimeter());
    }
}