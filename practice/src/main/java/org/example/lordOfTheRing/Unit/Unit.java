package org.example.lordOfTheRing.Unit;

public interface Unit {
     int getPower();
     default boolean isAlive(){
        return getPower()>0;
    };
}




