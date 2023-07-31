package org.example.lordOfTheRing.Unit.MordorUnit;

import java.util.Random;

public class Troll implements MordorUnit {

    @Override
    public int getPower() {
        return 11 + new Random().nextInt(5);
    }

    @Override
    public boolean isAlive() {
        return MordorUnit.super.isAlive();
    }
}
