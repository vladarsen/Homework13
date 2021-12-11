package com.vladarsenjtev.professions;


public class Driver extends Person {
    private int experience;


    public Driver(String fullName, String dateBirth) {
        super(fullName, dateBirth);
    }

    public Driver(String fullName, String dateBirth, int experience) {
        super(fullName, dateBirth);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                ", fullName='" + fullName + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                '}';
    }
}
