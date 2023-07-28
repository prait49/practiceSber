package org.example.lordOfTheRing;

import org.example.lordOfTheRing.Unit.Cavalry;
import org.example.lordOfTheRing.Unit.Infantry;
import org.example.lordOfTheRing.Unit.Unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Army<T extends Unit> {

    private List<Unit> army;
    private List<Cavalry> cavalry;
    private List<Infantry> infantry;

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
            return true;
        } else if (unit instanceof Infantry) {
            infantry.add((Infantry) unit);
            return true;
        } else {
            return false;
        }

    }

    public void print() {
        for (Unit army : getArmy()) {
            System.out.println(army.toString());
        }


    }

    //Скорее всего неправильный метод

    public boolean release(T unit) {
        for (Unit army1:  army) {
            if (army1.equals(unit)){
                army.remove(unit);
                return true;
            }
        }
        return false;
    }

    public void getRandomUnit(){

    }

//    public void getRandomUnit(T Unit){
//        if( Unit instanceof )
//    }






}















