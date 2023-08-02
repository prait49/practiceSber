package org.example.lordOfTheRing.Unit.MordorUnit;

import org.example.lordOfTheRing.Unit.Cavalry.Warg;
import org.example.lordOfTheRing.Unit.Infantry.Infantry;

import java.util.Random;

public class Orc<T1 extends Warg, T2 extends Infantry> implements MordorUnit {

    private Warg warg;

    @Override
    public int getPower() {
        return 8;
    }

    public int getPower(T1 warg){
        return 8+ new Random().nextInt(3)+warg.getPower();
    }

    @Override
    public boolean isAlive() {
        return MordorUnit.super.isAlive();
    }
}
