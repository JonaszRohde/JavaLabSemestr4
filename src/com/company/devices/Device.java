package com.company.devices;

public abstract class Device {
    String model;
    String producer;
    int yearOfProduction;
    public double price;

    public Device(String model, String producer, int yearOfProduction, double price) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
    }

    public abstract void turnOn();

}
