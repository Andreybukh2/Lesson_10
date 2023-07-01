package org.example.Auto;

public class Electric extends Car {
    public void nameCategory() {
        System.out.println(getNameCategory()); // Пример наследования поля из родительского класса;
    }
    public void fullUp () {
        System.out.println("[Автомобиль заправляется] а далее указан " +
                "тип заправки - [электричество]");
    }
    public void repairing () {
        System.out.println(" - в элетромастерской"); // Пример наследования поля из родительского класса;
    }
    public void moving(){
        System.out.println(" бесшумно" + "\n");
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getNameCategory() {
        return super.getNameCategory();
    }

    @Override
    public void setNameCategory(String nameCategory) {
        super.setNameCategory(nameCategory);
    }
}
// rechargeBattery