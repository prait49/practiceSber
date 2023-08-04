package org.example.lordOfTheRing.Unit.MiddleEarthUnit.Human;

import org.example.lordOfTheRing.Unit.Cavalry.AbstractCavalryUnit;
import org.example.lordOfTheRing.Unit.Cavalry.Mount;

public class CavalryHuman extends AbstractCavalryUnit<Mount.Horse> implements Human{

    public CavalryHuman(String name, int minPower, int maxPower) {
        super(name, minPower, maxPower, Mount.Horse);
    }
}
