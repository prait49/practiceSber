package org.example.lordOfTheRing.Unit.MordorUnit;

import org.example.lordOfTheRing.Unit.Cavalry.AbstractCavalryUnit;
import org.example.lordOfTheRing.Unit.Cavalry.Mount;


class Orc extends AbstractCavalryUnit<Mount.Warg> implements MordorUnit {
    public Orc(String name) {
        super(name, 8, 10, Mount.Warg);
    }
}
