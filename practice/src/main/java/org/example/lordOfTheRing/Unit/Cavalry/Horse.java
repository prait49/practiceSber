package org.example.lordOfTheRing.Unit.Cavalry;

import org.example.lordOfTheRing.Unit.Unit;

import java.util.Random;

public class Horse implements Cavalry{

    @Override
    public int getPower() {
        return 10 + new Random().nextInt(3);
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public void strike(Unit target) {

    }


}
