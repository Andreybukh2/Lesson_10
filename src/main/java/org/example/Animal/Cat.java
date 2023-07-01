package org.example.Animal;

public class Cat extends Animal {
    public String color;

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + getAge() +
                '}';
    }

    @Override
    public void Say() {
        System.out.println("мяу");
        System.out.println("Кличка = " + name);
    }
}
