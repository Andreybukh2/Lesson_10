package org.example.Auto;

public class Car {
    private String nameCategory = "Группа транспортных средств категории B";
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nameCategory='" + nameCategory + '\'' +
                ", year=" + year +
                '}';
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public void repairing(){
        System.out.println("Автомобиль ремонтируется");
    }
    public void fullUp(){
        System.out.println("Автомобиль заправляется");
    }
    public void moving(){
        System.out.println("Автомобиль двигается" + "\n");
    }
}