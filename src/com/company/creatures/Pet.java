package com.company.creatures;

public class Pet extends Animal {
    public Pet(String species, String name, double weight) {
        super(species, name, weight);
    }

    @Override
    public void feed() {
        if (this.weight <= 0) {
            System.out.println("You can't feed a dead animal");
        } else {
            this.weight += 1;
            System.out.println("Your " + name + " has been fed and now weighs: " + this.weight + "kg");
        }

    }

    @Override
    public void takeForAWalk() {
        if (this.weight <= 1) {
            this.weight -= 1;
            System.out.println("Your" + name + "has died from exhaustion ;(");
        } else {
            this.weight -= 1;
            System.out.println("Your " + name + " has lost " + this.weight + "kg");
        }
    }

    @Override
    public void feed(double foodWeight) {
        this.weight += foodWeight;
        System.out.println("Your " + name + " has been fed and now weighs: " + this.weight + "kg");
    }
}
