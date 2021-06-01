package com.company;

public class Animal implements sellable {
    String species;
    Double weight;
    String name;

    void Feed() {
        System.out.println("thx");
        this.weight += 1;
    }

    void Walk() {
        System.out.println("szybcieej");
        this.weight -= 1;
    }

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