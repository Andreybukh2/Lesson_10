package org.example;

import org.example.Animal.*;
import org.example.Auto.Car;
import org.example.Auto.Diesel;
import org.example.Auto.Electric;
import org.example.Auto.Hybrid;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main(String[] args ) {
        /**
         AudioDisk audioDisk1 = new AudioDisk();
         AudioDisk audioDisk2 = new AudioDisk();
         AudioDisk audioDisk3 = new AudioDisk();
         VideoDisk videoDisk1 = new VideoDisk();
         VideoDisk videoDisk2 = new VideoDisk();
         VideoDisk videoDisk3 = new VideoDisk();

         audioDisk1.setName("Album-Singer1");
         audioDisk1.setYear(1979);
         audioDisk1.setSinger("Some-Singer1");
         audioDisk1.setCountTracks(10);

         audioDisk2.setName("Album-Singer2");
         audioDisk2.setYear(2001);
         audioDisk2.setSinger("Some-Singer2");
         audioDisk2.setCountTracks(12);

         audioDisk3.setName("Album-Singer3");
         audioDisk3.setYear(1993);
         audioDisk3.setSinger("Some-Singer3");
         audioDisk3.setCountTracks(15);

         videoDisk1.setName("Album-Film1");
         videoDisk1.setYear(2002);
         videoDisk1.setDirector("Director1");
         videoDisk1.setProducer("Producer1");
         videoDisk1.setCountOfMinutes(120);

         videoDisk2.setName("Album-Film2");
         videoDisk2.setYear(2012);
         videoDisk2.setDirector("Director2");
         videoDisk2.setProducer("Producer2");
         videoDisk2.setCountOfMinutes(110);

         videoDisk3.setName("Album-Film3");
         videoDisk3.setYear(2020);
         videoDisk3.setProducer("Producer3");
         videoDisk3.setDirector("Director3");
         videoDisk3.setCountOfMinutes(90);

         Disk [] arrDisk = new Disk[6];
         arrDisk [0] = audioDisk1;
         arrDisk [1] = audioDisk2;
         arrDisk [2] = audioDisk3;
         arrDisk [3] = videoDisk1;
         arrDisk [4] = videoDisk2;
         arrDisk [5] = videoDisk3;

         int min = Integer.MAX_VALUE;
         for (Disk disk: arrDisk) {
         System.out.println(disk.toString());
         if (disk.getYear() < min) min = disk.getYear();
         }
         System.out.println("Самый старый диск " + min + " года");

         Cat cat1 = new Cat();
         cat1.name = "Somecat1";
         cat1.setAge(-2);
         cat1.color = "Рыжий";
         cat1.Say();
         System.out.println(cat1);

         Dog dog1 = new Dog();
         dog1.name = "SomeDog1";
         dog1.setAge(5);
         dog1.length = "15 см";
         List<Animal> animalList = new ArrayList<>();
         animalList.add(cat1);
         animalList.add(dog1);
         for (Animal animal : animalList) {
         animal.Say();
         }
         Animal someAnimal = new Dog();
         Animal animalB = new Bird();
         animalB.name = "Какая-то птичка";
         Flyable flyable = (Flyable) animalB;*/

        Electric electricCar1 = new Electric();
        Diesel dieselCar1 = new Diesel();
        Hybrid hybridCar1 = new Hybrid();

        electricCar1.nameCategory();
        electricCar1.fullUp();
        electricCar1.repairing();
        electricCar1.setYear(2022);

        dieselCar1.nameCategory();
        dieselCar1.fullUp();
        dieselCar1.repairing();
        dieselCar1.setYear(2010);

        hybridCar1.nameCategory();
        hybridCar1.fullUp();
        hybridCar1.repairing();
        hybridCar1.setYear(2015);

        List<Car> carList = new ArrayList<>();
        carList.add(dieselCar1);
        carList.add(electricCar1);
        carList.add(hybridCar1);

        int min = Integer.MAX_VALUE;
        for (Car cars : carList) {
            System.out.println(cars.getYear());
            System.out.println(cars.toString());
            if (cars.getYear() < min) min = cars.getYear();
        }
        System.out.println("Самое старое авто " + min + " года");
    }
}
