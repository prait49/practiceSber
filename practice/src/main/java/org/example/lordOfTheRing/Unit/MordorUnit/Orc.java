package org.example.lordOfTheRing.Unit.MordorUnit;

import java.util.Random;

public class Orc implements MordorUnit {

    @Override
    public int getPower() {
        return 8 + new Random().nextInt(3);
    }

    @Override
    public boolean isAlive() {
        return MordorUnit.super.isAlive();
    }
}
