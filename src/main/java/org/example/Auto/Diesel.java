package org.example.Auto;

public class Diesel extends Car {

    public void nameCategory() {
    System.out.println(getNameCategory()); // Пример наследования поля из родительского класса;
}
    public void fullUp() {
        System.out.println("[Автомобиль заправляется] и далее переопределенный метод уточняет " +
                "тип заправки - [дизельным топливом]" + "\n");
    }
    public void repairing () {
        System.out.println(" - в автосервисе для дизельных авто"); // Пример наследования поля из родительского класса;
    }
    public void moving(){
        System.out.println(" - более шумно чем иные" + "\n");
    }
}