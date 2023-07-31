package org.example.lordOfTheRing.Unit.MordorUnit;

import java.util.Random;

public class UrukHai extends Orc{

    @Override
    public int getPower() {
        return 10 + new Random().nextInt(3);
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }
}
