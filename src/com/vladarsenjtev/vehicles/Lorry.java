package com.vladarsenjtev.vehicles;

import com.vladarsenjtev.details.Engine;
import com.vladarsenjtev.professions.Driver;

public class Lorry extends Car {
    private double liftingCapacity;

    public Lorry(String brand, String classAvto, double weight, Driver driver, Engine engine) {
        super(brand, classAvto, weight, driver, engine);
    }

    public Lorry(String brand, String classAvto, double weight, Driver driver, Engine engine, double liftingCapacity) {
        super(brand, classAvto, weight, driver, engine);
        this.liftingCapacity = liftingCapacity;
    }

    public double getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(double liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "brand='" + brand + '\'' +
                ", classAvto='" + classAvto + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                ", liftingCapacity=" + liftingCapacity +
                '}';
    }
}