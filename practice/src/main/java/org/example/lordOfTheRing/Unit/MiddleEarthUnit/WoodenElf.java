package org.example.lordOfTheRing.Unit.MiddleEarthUnit;


public class WoodenElf implements MiddleEarthUnit {

    @Override
    public int getPower() {
        return 6;
    }

    @Override
    public boolean isAlive() {
        return MiddleEarthUnit.super.isAlive();
    }
}
