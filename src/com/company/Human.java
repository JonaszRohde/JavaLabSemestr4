package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human implements sellable {
    public Car car;
    String firstName;
    String lastName;
    Animal pet;
    public Phone mobilePhone;
    public double cash;

    public String toString() {
        return firstName + " " + lastName;
    }

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    Date date = new Date(System.currentTimeMillis());
    private Double salary = 1200.0;

    public Double getSalary() {
        System.out.println("Data pobrania wartości: " + formatter.format(date));
        System.out.println("Wartość przed zmianą: ");
        return this.salary;
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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (salary > car.price) {
            System.out.println("Udało sie kupić za gotówkę");
            this.car = car;
        } else if (salary > car.price / 12) {
            System.out.println("Udało się kupić na kredyt");
            this.car = car;
        } else {
            System.out.println("zapisz się na studia i znajdź nową robotę albo idź po\n" +
                    "podwyżkę");
        }
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Human trafficking is illegal");
    }
}
