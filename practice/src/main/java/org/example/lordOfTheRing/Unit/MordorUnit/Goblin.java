package org.example.lordOfTheRing.Unit.MordorUnit;

import java.util.Random;

public class Goblin implements MordorUnit{

    @Override
    public int getPower() {
        return 2 + new Random().nextInt(4);
    }

    @Override
    public boolean isAlive() {
        return MordorUnit.super.isAlive();
    }
}
