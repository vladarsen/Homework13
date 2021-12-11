package com.vladarsenjtev.vehicles;

import com.vladarsenjtev.details.Engine;
import com.vladarsenjtev.professions.Driver;


import java.text.ParseException;

public class Main {


    public static void main(String[] args) throws ParseException {

        Driver driverCar = new Driver("Vlad A.", "26.02.1995", 10);
        Engine EngineCar = new Engine("1.6", "Mersedes");
        Car car = new Car("Mersedes", "A", 5000, driverCar, EngineCar);

        Driver driverSportCar = new Driver("Anton T.", "10.05.1985", 15);
        Engine EngineSportCar = new Engine("3.0", "BMW");
        SportCar sportCar = new SportCar("BMW", "S", 4000, driverSportCar, EngineSportCar, 350);

        Driver lorryCarDriver = new Driver("Oleg V.", "17.06.1965", 30);
        Engine EngineLorry = new Engine("4.0", "Ford");
        Car lorryCar = new Lorry("Ford", "D", 10000, lorryCarDriver, EngineLorry, 5000);


        System.out.println(car);
        System.out.println(sportCar);
        System.out.println(lorryCar);

        driverCar.age();
        driverSportCar.age();
        lorryCarDriver.age();

    }
}

