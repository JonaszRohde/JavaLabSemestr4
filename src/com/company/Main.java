package com.company;

import com.company.devices.Car;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Animal dog = new Animal();
        dog.species = "Canis familiaris";
        dog.name = "Szarik";
        dog.weight = 18.0;

        Animal cat = new Animal();
        cat.species = "Felis catus";
        cat.name = "Sierściuch";
        cat.weight = 2.0;

        System.out.println(dog.name);
        System.out.println(dog.species);

        Human me = new Human();
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = cat;

        System.out.println(me.firstName);
        System.out.println(me.pet.name);

        cat.Feed();
        dog.Feed();
        dog.Walk();

        Car passat = new Car("Passat", "VW");
        passat.color = "gray";
        passat.millage = 80000.0;
        passat.engineVolume = 1.9;

        System.out.println(me.getSalary());
        System.out.println(me.setSalary(1230.0));

        me.setCar(passat);

        Car fakePassat = new Car("Passat", "VW");
        fakePassat.color = "gray";
        fakePassat.millage = 80000.0;
        fakePassat.engineVolume = 1.9;

        System.out.println(passat.equals(fakePassat));
        System.out.println(passat);
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(me);
        passat.turnOn();
    }
}
