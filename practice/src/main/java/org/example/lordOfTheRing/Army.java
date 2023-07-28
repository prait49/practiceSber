package org.example.lordOfTheRing;

import org.example.lordOfTheRing.Unit.Cavalry;
import org.example.lordOfTheRing.Unit.Infantry;
import org.example.lordOfTheRing.Unit.Unit;

import java.util.ArrayList;
import java.util.List;

public class Army<T extends Unit> {

        private List<Cavalry> cavalry;
        private List<Infantry> infantry;

    public Army() {
        cavalry = new ArrayList<>();
        infantry = new ArrayList<>();
    }

    public List<Cavalry> getCavalry() {
        return cavalry;
    }

    public List<Infantry> getInfantry() {
        return infantry;
    }

    public List<Unit> getArmy(){
        List<Unit> army =new ArrayList<>();
        army.addAll(getCavalry());
        army.addAll(getInfantry());
        return army;
    }

    public boolean recruit(List<T> unit) {
        if (unit instanceof Cavalry) {
            cavalry.add((Cavalry) unit);
            return true;
        } else if (unit instanceof Infantry) {
            infantry.add((Infantry) unit);
            return true;
        } else {
            return false;
        }
    }

    public void print(){

        for (Cavalry cavalry1:cavalry) {
            System.out.println(cavalry1.toString());
        }
        for (Infantry infantry1:infantry) {
            System.out.println(infantry1.toString());
        }

    }





    }











