package org.example.lordOfTheRing.Unit.MiddleEarthUnit;

import org.example.lordOfTheRing.Unit.Cavalry.AbstractCavalryUnit;
import org.example.lordOfTheRing.Unit.Cavalry.Mount;

public class Wizard extends AbstractCavalryUnit<Mount.Horse> {

    public Wizard(String name) {
        super(name,20,20, Mount.Horse);
    }
}
