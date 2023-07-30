package com.intellekta.generics.middleearth.lordOfTheRing;

import com.intellekta.generics.middleearth.lordOfTheRing.Unit.Cavalry;
import com.intellekta.generics.middleearth.lordOfTheRing.Unit.Infantry;
import com.intellekta.generics.middleearth.lordOfTheRing.Unit.Unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Army<T extends Unit> {

    private List<Unit> army;
    private final List<Cavalry> cavalry;
    private final List<Infantry> infantry;

    public Army() {
        army = new ArrayList<>();
        cavalry = new ArrayList<>();
        infantry = new ArrayList<>();
    }

    public List<Cavalry> getCavalry() {
        return cavalry;
    }

    public List<Infantry> getInfantry() {
        return infantry;
    }


    public void setArmy(List<Unit> army) {
        this.army = army;
    }

    public List<Unit> getArmy() {
        army = new ArrayList<>();
        army.addAll(getCavalry());
        army.addAll(getInfantry());
        return army;
    }

    public boolean recruit(T unit) {
        if (unit instanceof Cavalry) {
            cavalry.add((Cavalry) unit);
            getArmy();
            return true;
        } else if (unit instanceof Infantry) {
            infantry.add((Infantry) unit);
            getArmy();
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        getArmy();
        for (Unit arms : army) {
            System.out.println(arms.toString());
        }
    }


    public boolean release(T unit) {
        for (Unit army1 : army) {
            if (army1.equals(unit)) {
                if (unit instanceof Cavalry) {
                    cavalry.remove(unit);
                    return true;
                }
                else if (unit instanceof Infantry) {
                    infantry.remove(unit);
                    return true;
                }
            }
        }
        return false;
    }

    public Unit getRandomUnit() {
        try {
            Random random = new Random();
            int randomIndex = random.nextInt(army.size());
            return army.get(randomIndex);
        } catch (Exception e) {
            return null;
        }
    }

    public Unit getRandomUnit(T Unit) {
        Random random = new Random();
        if (Unit instanceof Cavalry) {
            int randomIndex = random.nextInt(cavalry.size());
            return cavalry.get(randomIndex);
        } else if (Unit instanceof Infantry) {
            int randomIndex = random.nextInt(infantry.size());
            return infantry.get(randomIndex);
        } else {
            return null;
        }
    }
}















