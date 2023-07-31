package org.example.lordOfTheRing.Unit.MiddleEarthUnit;

import java.util.Random;

public class Elf implements MiddleEarthUnit {


    @Override
    public int getPower() {
        return 4 + new Random().nextInt(4);
    }

    @Override
    public boolean isAlive() {
        return MiddleEarthUnit.super.isAlive();
    }
}
