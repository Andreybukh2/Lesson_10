package org.example.Animal;

public class Bird extends Animal implements Flyable {

    @Override
    public void fly() {
        System.out.println("Птица летит ");
    }
}
