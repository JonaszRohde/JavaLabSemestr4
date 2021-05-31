package com.company.devices;

public class Car extends Device {
    public int weight;
    public String color;
    public Double millage;
    public Double engineVolume;
    public Double price = 25000.0;

    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }

    public String toString() {
        return producer + " " + model + " " + color + "\nMillage: " + millage + "\nEngine Volume: " + engineVolume + "\nYear of production: " + yearOfProduction;
    }

    public void turnOn() {
        System.out.println("Starting the car..");
    }

}
