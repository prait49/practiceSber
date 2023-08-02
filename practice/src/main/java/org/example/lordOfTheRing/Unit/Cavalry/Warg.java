package org.example.lordOfTheRing.Unit.Cavalry;

import org.example.lordOfTheRing.Unit.Unit;

import java.util.Random;

public class Warg implements Cavalry{

    @Override
    public int getPower() {
        return 4 + new Random().nextInt(4);
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public void strike(Unit target) {

    }


}
