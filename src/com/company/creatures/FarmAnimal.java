package com.company.creatures;

public class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String species, String name, double weight) {
        super(species, name, weight);
    }

    @Override
    public void feed() {
        this.weight += 1;
        System.out.println("Your " + name + " has been fed and now weighs: " + this.weight + "kg");
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
    public void beEaten() {
        System.out.println("muuu..");
    }

    @Override
    public void feed(double foodWeight) {
        this.weight += foodWeight;
        System.out.println("Your " + name + " has been fed and now weighs: " + this.weight + "kg");

    }
}
