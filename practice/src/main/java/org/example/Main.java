package org.example;

import org.example.lordOfTheRing.Army;
import org.example.lordOfTheRing.Unit.Cavalry.Cavalry;
import org.example.lordOfTheRing.Unit.Infantry.Infantry;
import org.example.lordOfTheRing.Unit.Unit;



public class Main {
    public static void main(String[] args) {




        Army<Unit> army = new Army<>();

        // Create some infantry units
        Infantry infantry1 = new Infantry();
        Infantry infantry2 = new Infantry();

        // Create some cavalry units
        Cavalry cavalry1 = new Cavalry("Cavalry Unit 1");
        Cavalry cavalry2 = new Cavalry("Cavalry Unit 2");

        // Recruit units into the army
        army.recruit(infantry1);
        army.recruit(infantry2);
        army.recruit(cavalry1);
        army.recruit(cavalry2);


        // Print the entire army
        army.print();

//         Get a random unit from the army
        Unit randomUnit = army.getRandomUnit();
        if (randomUnit != null) {
            System.out.println("\nRandom unit from the army: " + randomUnit.toString());
        }

        // Get a random infantry unit
        Unit randomInfantryUnit = army.getRandomUnit(new Infantry(""));
        if (randomInfantryUnit != null) {
            System.out.println("Random infantry unit: " + randomInfantryUnit.toString());
        }

        // Get a random cavalry unit
        Unit randomCavalryUnit = army.getRandomUnit(new Cavalry(""));
        if (randomCavalryUnit != null) {
            System.out.println("Random cavalry unit: " + randomCavalryUnit.toString());
        }

        // Release a unit
        boolean released = army.release(infantry1);
        if (released) {
            System.out.println("\nInfantry Unit 1 released successfully.");
        } else {
            System.out.println("\nFailed to release Infantry Unit 1.");
        }

        // Print the army after the release
        System.out.println("\nUpdated army:");
        army.print();
    }


    }


