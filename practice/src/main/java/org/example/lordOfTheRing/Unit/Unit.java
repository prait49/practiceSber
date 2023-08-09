package org.example.lordOfTheRing.Unit;

public interface Unit {

    public default int getPower() {
        return 0;
    }

    public default boolean isAlive() {
        return getPower() > 0;
    }


}




