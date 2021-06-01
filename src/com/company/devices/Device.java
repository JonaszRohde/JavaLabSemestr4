package com.company.devices;

public abstract class Device {
    String model;
    String producer;
    int yearOfProduction;

    public Device(String model, String producer, int yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void turnOn();

}
