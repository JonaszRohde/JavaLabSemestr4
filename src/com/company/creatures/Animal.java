package com.company.creatures;

import com.company.Human;
import com.company.sellable;

public abstract class Animal implements sellable, Feedable {
    public String species;
    public Double weight;
    public String name;

    public Animal(String species, String name, double weight) {
        this.species = species;
        this.name = name;
        this.weight = weight;
    }

    abstract public void feed();

    abstract public void walk();

    public String toString() {
        return species + " " + weight + " " + name + " ";
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller == buyer) {
            System.out.println("You can't trade with yourself");
        } else if (seller.pet != this) {
            System.out.println("Seller is not in possession of this animal");
        } else if (buyer.cash < price) {
            System.out.println("Buyer doesn't have enough funds");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println("Transaction has completed successfully. The animal has been bought for " + price);
        }
    }
}