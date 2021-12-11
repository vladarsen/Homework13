package com.vladarsenjtev.vehicles;

import com.vladarsenjtev.details.Engine;
import com.vladarsenjtev.professions.Driver;

public class Car {
    protected String brand;
    protected String classAvto;
    protected double weight;
    protected Driver driver;
    protected Engine engine;

    public Car(String brand, String classAvto, double weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.classAvto = classAvto;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getClassAvto() {
        return classAvto;
    }

    public void setClassAvto(String classAvto) {
        this.classAvto = classAvto;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {

        System.out.println("Поехали");
    }

    public void stop() {

        System.out.println("Останавливаемся");
    }

    public void turnRight() {

        System.out.println("Поворот направо");
    }

    public void turnLeft() {

        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", classAvto='" + classAvto + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}