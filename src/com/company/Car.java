package com.company;

public class Car {
    public final String producer;
    public final String model;
    public int weight;
    public String color;
    public Double millage;
    public Double engineVolume;
    public Double price = 25000.0;

    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }

}
