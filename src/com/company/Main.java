package com.company;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Pet dog = new Pet("Canis familiaris", "Szarik", 18.0);

        Pet cat = new Pet("Felis catus", "Sierściuch", 2.0);

        FarmAnimal cow = new FarmAnimal("cow??", "just a cow", 150.0);

        System.out.println(dog.name);
        System.out.println(dog.species);

        Human me = new Human();
        me.firstName = "Jonasz";
        me.lastName = "Rohde";
        me.pet = cat;

        System.out.println(me.firstName);
        System.out.println(me.pet.name);

        cat.feed();
        dog.feed();
        dog.walk();
        dog.feed(5.0);
        dog.walk();

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

        Phone oneplus5 = new Phone("Oneplus", "5");
        oneplus5.yearOfProduction = 2016;
        oneplus5.screenSize = 5.5;
        oneplus5.operatingSystem = "Android 10";
        oneplus5.turnOn();
        me.mobilePhone = oneplus5;

        Phone oneplus8pro = new Phone("Oneplus", "8 pro");
        oneplus8pro.yearOfProduction = 2021;
        oneplus8pro.screenSize = 5.8;
        oneplus8pro.operatingSystem = "Android 11";
        oneplus8pro.turnOn();

        Human mate = new Human();
        mate.firstName = "Dawid";
        mate.lastName = "Krefft";
        mate.cash = 20000.0;

        me.cash = 10000.0;
        System.out.println("///////////////////////");

        //Selling a phone
        System.out.println("My funds: " + me.cash);
        System.out.println("Buyer's funds: " + mate.cash);
        oneplus5.sell(me, mate, 1500.0);
        System.out.println("My 'new' phone: " + me.mobilePhone);
        System.out.println("Buyer's new phone: " + mate.mobilePhone);

        System.out.println("///////////////////////");
        me.car = passat;
        //Selling a car
        System.out.println("My funds: " + me.cash);
        System.out.println("Buyer's funds: " + mate.cash);
        passat.sell(me, mate, 25000.0);
        System.out.println("My 'new' car: " + me.car);
        System.out.println("Buyer's new car: " + mate.car);

        System.out.println("///////////////////////");
        //Selling a pet
        System.out.println("My funds: " + me.cash);
        System.out.println("Buyer's funds: " + mate.cash);
        cat.sell(me, mate, 500.0);
        System.out.println("My 'new' pet: " + me.pet);
        System.out.println("Buyer's new pet: " + mate.pet);

        Human slave = new Human();
        slave.firstName = "046";
        slave.lastName = "Miner";

        System.out.println("///////////////////////");
        //Selling a human?
        System.out.println("My funds: " + me.cash);
        System.out.println("Buyer's funds: " + mate.cash);
        slave.sell(me, mate, 20000.0);
    }
}
