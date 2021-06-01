package com.company.creatures;

public class Pet extends Animal {
    public Pet(String species, String name, double weight) {
        super(species, name, weight);
    }

    @Override
    public void feed() {
        this.weight += 1;
        System.out.println("Your " + name + " has been fed and now weighs: " + this.weight + "kg");
    }

    @Override
    public void walk() {
        this.weight -= 1;
        System.out.println("Your " + name + " has lost " + this.weight + "kg");
    }

    @Override
    public void feed(double foodWeight) {
        this.weight += foodWeight;
        System.out.println("Your " + name + " has been fed and now weighs: " + this.weight + "kg");
    }
}
