package com.company;

import java.io.File;

public class Animal {
    String species;
    Double weight;
    String name;
    File pic;

    void Feed(){
        System.out.println("thx");
        this.weight += 1;
    }

    void Walk(){
        System.out.println("szybcieej");
        this.weight -= 1;
    }
}