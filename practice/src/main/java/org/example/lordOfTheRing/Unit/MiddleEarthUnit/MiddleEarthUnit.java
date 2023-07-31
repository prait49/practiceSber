package org.example.lordOfTheRing.Unit.MiddleEarthUnit;

import org.example.lordOfTheRing.Unit.Unit;

public interface MiddleEarthUnit extends Unit {
    @Override
    int getPower();

    @Override
    default boolean isAlive() {
        return Unit.super.isAlive();
    }
}
