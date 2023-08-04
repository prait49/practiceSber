package org.example.lordOfTheRing.Unit.Cavalry;

import java.util.Random;

public abstract class Mount implements Cavalry{
    public static Mount.Horse Horse;
    public static Mount.Warg Warg ;
    protected int power;

        protected Mount( int minPower, int maxPower) {
            this.power=new Random().nextInt(maxPower - minPower + 1) + minPower;
        }

    public int getPower() {
        return power;
    }

    public boolean isAlive() {
        return power > 0;
    }

    public void damage(int damage) {
        this.power -= damage;
        if (this.power < 0) {
            this.power = 0;
        }
    }

    public static class Horse extends Mount
        {
            public Horse() {
                super(4, 5);

            }
        }

    public static class Warg extends Mount {
            public Warg() {
                super(4, 7);

            }
        }
    }

