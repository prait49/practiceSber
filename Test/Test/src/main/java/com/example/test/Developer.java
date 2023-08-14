package com.example.test;

public class Developer {
    private String name;
    private String specialization;
    private int experience;

    public Developer(String name, String specialization, int experience) {
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Developer:\n" +
                "  Name: " + name + "\n" +
                "  Specialization: " + specialization + "\n" +
                "  Experience: " + experience;
    }
}