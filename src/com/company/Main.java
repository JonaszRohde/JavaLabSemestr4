package com.company;

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

        me.car = passat;

        System.out.println(me.getSalary());
        System.out.println(me.setSalary(1230.0));
    }
}
