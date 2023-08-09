package org.example.lordOfTheRing.Unit;

import java.util.Random;

 public abstract class AbstractUnit implements Unit {

    protected String name;
    public int power;

    public AbstractUnit(String name, int minPower, int maxPower) {
        setName(name);
        this.power = new Random().nextInt(maxPower - minPower + 1) + minPower;
    }



    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = (name == null||name.trim().isEmpty()) ? super.toString()
                : name;
    }

    public boolean isAlive() {
        return power > 0;
    }


     public <T extends AbstractUnit> void strike(T unit) {
         unit.damage(this.power);
     }
     public void damage(int damage) {
         this.power -= damage;
         if (this.power < 0) {
             this.power = 0;
         }
     }
    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + name + " has power " + power;
    }


}
