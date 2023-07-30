package com.intellekta.generics.middleearth.lordOfTheRing.Unit;

public abstract class Unit {

    private String name;

    public Unit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                '}';
    }
}

