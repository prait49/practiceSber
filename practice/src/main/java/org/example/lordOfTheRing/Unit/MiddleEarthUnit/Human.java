package org.example.lordOfTheRing.Unit.MiddleEarthUnit;

import org.example.lordOfTheRing.Unit.Cavalry.Horse;
import org.example.lordOfTheRing.Unit.Infantry.Infantry;

import java.util.Random;

public interface Human  <T1 extends Horse, T2 extends Infantry>  extends MiddleEarthUnit {



    @Override
    public default int getPower() {
        return 4 + new Random().nextInt(4);
    }

    @Override
    public default boolean isAlive() {
        return MiddleEarthUnit.super.isAlive();
    }
}
