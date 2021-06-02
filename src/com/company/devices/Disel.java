package com.company.devices;

public class Disel extends Car {
    public Disel(String producer, String model, int yearOfProduction, double price) {
        super(producer, model, yearOfProduction, price);
    }

    @Override
    public void refuel() {
        System.out.println("The" + model + "car has been refueled");
    }
}
