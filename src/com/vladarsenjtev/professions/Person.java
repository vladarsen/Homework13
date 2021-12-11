package com.vladarsenjtev.professions;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    protected String fullName;
    protected String dateBirth;

    public Person(String fullName, String dateBirth) {
        this.fullName = fullName;
        this.dateBirth = dateBirth;
    }


    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void age() throws ParseException {
        DateFormat date = new SimpleDateFormat("dd.MM.yyyy");
        Date nDate = date.parse(dateBirth);
        Date now = new Date();
        long timeBetween = now.getTime() - nDate.getTime();
        double yearsBetween = timeBetween / 3.15576e+10;
        int age = (int) Math.floor(yearsBetween);
        System.out.println("Водителю " + age + " лет");
    }


    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                '}';
    }
}