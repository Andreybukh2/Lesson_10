package org.example.Auto;

public class Hybrid extends Car {
    public void nameCategory() {
    System.out.println(getNameCategory()); // Пример наследования поля из родительского класса;
}
    public void fullUp () {
        System.out.println("[Автомобиль заправляется] и далее указан " +
                "тип заправки - [водородным топливом]" + "\n");
    }

    public void repairing () {
        System.out.println(" - в мастерской для гибридных авто"); // Пример наследования поля из родительского класса;
    }
    public void moving(){
        System.out.println(" - экологично" + "\n");
    }
}
// hydrogenFuel