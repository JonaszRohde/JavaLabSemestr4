package com.company.devices;

public class Phone {
    String producer;
    String model;
    Double screenSize;
    String operatingSystem;

    public String toString() {
        return producer + " " + model + " " + screenSize + " " + operatingSystem;
    }
}
