package com.company.devices;

import com.company.Human;
import com.company.sellable;

public class Phone extends Device implements sellable {
    public Double screenSize;
    public String operatingSystem;
    public int yearOfProduction;

    public Phone(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public void turnOn() {
        System.out.println("Turning " + producer + " " + model + " phone on..");
    }

    public String toString() {
        return producer + " " + model + "  Screen size: " + screenSize + "  Operating system: " + operatingSystem + "  Year of production: " + yearOfProduction;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller == buyer) {
            System.out.println("You can't trade with yourself");
        } else if (seller.mobilePhone != this) {
            System.out.println("Seller is not in possession of this phone");
        } else if (buyer.cash < price) {
            System.out.println("Buyer doesn't have enough funds");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.mobilePhone = seller.mobilePhone;
            seller.mobilePhone = null;
            System.out.println("Transaction has completed successfully. The phone has been bought for " + price);
        }
    }
}
