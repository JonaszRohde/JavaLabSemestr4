package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.Phone;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Human implements sellable {
    public Car[] garage;
    String firstName;
    String lastName;
    public Animal pet;
    public Phone mobilePhone;
    public double cash;

    public String toString() {
        return firstName + " " + lastName;
    }

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    Date date = new Date(System.currentTimeMillis());
    private Double salary = 1200.0;

    public Human(String firstName, String lastName, int garageSize) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.garage = new Car[garageSize];
    }

    public Double getSalary() {
        System.out.println("Data pobrania wartości: " + formatter.format(date));
        System.out.println("Wartość przed zmianą: ");
        return this.salary;
    }

    public List<Car> sortCars() {
        return Arrays.stream(garage).sorted(Comparator.comparing(car -> car.yearOfProduction)).collect(Collectors.toList());
    }

    public boolean isSpace() {
        for (Car car : garage) {
            if (car == null) return true;

        }
        return false;
    }

    public void removeCar(Car removedCar) {
        for (int i = 0; i < garage.length; i++) {
            if (this.garage[i] == removedCar) {
                this.garage[i] = null;
            }
        }
    }

    public void addCar(Car newCar) {
        for (int i = 0; i < garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = newCar;
            }
        }
    }

    public double setSalary(Double salary) throws Exception {
        if (salary <= 0) {
            throw new Exception("Nikt nie bedzie doplacal do swojej pracy");
        }
        System.out.println("Nowe dane zostały wysłane do systemu księgowego\n" +
                "Aneks możliwy do odebrania u pani Hani z kadr\n" +
                "ZUS i US zostało powiadomione o zmianie wypłaty\n");
        return this.salary = salary;
    }

    public Car getCar(int parkingPlaceNumber) {
        return this.garage[parkingPlaceNumber];
    }

    public boolean hasCar(Car newCar) {
        for (Car car : garage) {
            if (car == newCar) return true;
        }
        return false;
    }

    public Double getGaragePrice() {
        Double garagePrice = 0.0;
        for (Device car : this.garage) {
            garagePrice = garagePrice + car.price;
        }
        return garagePrice;
    }

    public void setCar(Car car, int parkingPlaceNumber) {
        this.garage[parkingPlaceNumber] = car;
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Human trafficking is illegal");
    }
}
