package org.example.lordOfTheRing.Unit.Cavalry;

import org.example.lordOfTheRing.Unit.AbstractUnit;


public abstract class AbstractCavalryUnit<T extends Mount> extends AbstractUnit  {
    protected T mount;

    public AbstractCavalryUnit(String name, int minPower, int maxPower, T mount) {
        super(name, minPower, maxPower);
        this.mount = mount;
    }
    @Override
    public int getPower() {
        return super.getPower() + mount.getPower();
    }


    @Override
    public void strike(AbstractUnit unit) {
        if (mount.getPower() > 0) {
            mount.damage(unit.getPower());
        } else {
            super.damage(unit.getPower());
        }
    }
}


