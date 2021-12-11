package com.vladarsenjtev.vehicles;

import com.vladarsenjtev.details.Engine;
import com.vladarsenjtev.professions.Driver;


public class SportCar extends Car {
    private double speed;

    public SportCar(String brand, String classAvto, double weight, Driver driver, Engine engine) {
        super(brand, classAvto, weight, driver, engine);
    }

    public SportCar(String brand, String classAvto, double weight, Driver driver, Engine engine, double speed) {
        super(brand, classAvto, weight, driver, engine);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "brand='" + brand + '\'' +
                ", classAvto='" + classAvto + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                ", speed=" + speed +
                '}';
    }
}