package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    public Car car1;
    String firstName;
    String lastName;
    Animal pet;
    Phone mobilePhone;
    Car car;

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


}
