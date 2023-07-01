package org.example.Animal;

public abstract class Animal {
    public String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Некорректный возраст значение по умолчанию ");
            age = 1;
        }
        this.age = age;
    }

    public void Say (){
        System.out.println("Животное говорит - ");
    }
}
