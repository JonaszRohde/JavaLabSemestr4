package com.company.devices;

import com.company.Human;
import com.company.sellable;

public class Car extends Device implements sellable {
    public int weight;
    public String color;
    public Double millage;
    public Double engineVolume;
    public Double price = 25000.0;
    public int yearOfProduction;

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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller == buyer) {
            System.out.println("You can't trade with yourself");
        } else if (seller.car != this) {
            System.out.println("Seller is not in possession of this car");
        } else if (buyer.cash < price) {
            System.out.println("Buyer doesn't have enough funds");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.car = seller.car;
            seller.car = null;
            System.out.println("Transaction has completed successfully. The car has been bought for " + price);
        }
    }

}
