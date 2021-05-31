package com.company.devices;

public class Phone extends Device {
    Double screenSize;
    String operatingSystem;

    public void turnOn() {
        System.out.println("Turning phone on..");
    }

    public String toString() {
        return producer + " " + model + " " + screenSize + " " + operatingSystem;
    }
}
