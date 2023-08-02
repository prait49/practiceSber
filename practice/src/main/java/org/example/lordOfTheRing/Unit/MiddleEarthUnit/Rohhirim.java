package org.example.lordOfTheRing.Unit.MiddleEarthUnit;

import org.example.lordOfTheRing.Unit.Cavalry.Horse;

import java.util.Random;

public class Rohhirim <T extends Horse>  implements Human {

    private Horse horse;


    @Override
    public int getPower() {
        return Human.super.getPower();
    }

    public int getPower(T horse){
        return 8+ new Random().nextInt(3) + horse.getPower();
    }

    @Override
    public boolean isAlive() {
        return Human.super.isAlive();
    }
}
