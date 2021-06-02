package com.company.devices;

import com.company.Human;
import com.company.sellable;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class Phone extends Device implements sellable {
    public Double screenSize;
    public String operatingSystem;
    public int yearOfProduction;
    static final String DEFAULT_SERVER_ADRESS = "5";
    static final String DEFAULT_SERVER_PROTOCOL = "http";
    static final String DEFAULT_VERSION_NAME = "latest";

    public Phone(String producer, String model, int yearOfProduction, double price) {
        super(producer, model, yearOfProduction, price);
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

    public void installAnApp(String appName) {
        this.installAnApp(appName, DEFAULT_VERSION_NAME);
    }

    public void installAnApp(String appName, String version) {
        this.installAnApp(appName, version, DEFAULT_SERVER_ADRESS);
    }

    public void installAnApp(String appName, String version, String server) {
        URL url = null;
        try {
            url = new URL(DEFAULT_SERVER_PROTOCOL, server, appName + version);
            this.installAnApp(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void installAnApp(URL appURL) {
        System.out.println("Downloading app.. " + appURL.getFile() + " from " + appURL.getHost());
        System.out.println("Installing.. " + appURL.getFile());
    }

    public void installAnApp(List<String> appNames) {
        String[] queue = new String[appNames.size()];
        this.installAnApp(Arrays.asList(queue));
    }

    public void installAnApp(String[] appNames) {
        for (String appName : appNames) {
            this.installAnApp(appName);
        }
    }


}
