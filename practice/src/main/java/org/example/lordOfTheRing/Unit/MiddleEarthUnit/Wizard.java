package org.example.lordOfTheRing.Unit.MiddleEarthUnit;

import org.example.lordOfTheRing.Unit.Cavalry.Horse;

public class Wizard <T extends Horse> implements MiddleEarthUnit{

    private Horse horse;


    public int getPower(T horse) {
        return 20+horse.getPower();
    }

    @Override
    public int getPower() {
        return 20+horse.getPower();
    }

    @Override
    public boolean isAlive() {
        return getPower()>0;
    }
}
