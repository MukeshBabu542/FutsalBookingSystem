package Inheritance.Task_Inheritance;
// Question 1: 
// Write a Java program to create a class called Vehicle with a method called drive().
// Create a subclass called Car with a method display() to print details of the Car.


// Base class named Vehicle
class Vehicle {

    // Method to simulate driving
    void drive() {
        System.out.println("The vehicle is driving...");
    }
}

// Subclass named Car that extends Vehicle
class Car extends Vehicle {

    // Attributes specific to Car
    String brand;
    String model;
    int year;

    // Constructor to initialize Car details
    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    void display() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Main class to run the program
public class t1 {
    public static void main(String[] args) {

        // Create a Car object with specific details
        Car myCar = new Car("Toyota", "Corolla", 2022);

        // Call the inherited drive() method from Vehicle
        myCar.drive();

        // Call the display() method to show car details
        myCar.display();
    }
}
