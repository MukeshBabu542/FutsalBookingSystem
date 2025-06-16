package taskabstraction;

// 1. Create an abstract class called Bird with an abstract method called fly().
// Implement two subclasses called Eagle and Penguin that inherit from Bird.
// Override the fly() method in both subclasses, ensuring Eagle can fly while Penguin cannot.

abstract class Bird {
    abstract void fly();
}

class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle soars high in the sky!");
    }
}

class Penguin extends Bird {
    @Override
    void fly() {
        System.out.println("Penguins can't fly, but they swim really well.");
    }
}

public class q1 {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();

        eagle.fly();
        penguin.fly();
    }
}