package org.example.lordOfTheRing.Unit;

abstract class AbstractUnit<T1 extends Unit> implements Unit {

    private int power;

    public AbstractUnit(int power) {
        this.power = power;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public boolean isAlive() {
        return Unit.super.isAlive();
    }


}
