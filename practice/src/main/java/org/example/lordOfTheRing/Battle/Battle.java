package org.example.lordOfTheRing.Battle;

import org.example.lordOfTheRing.Army;
import org.example.lordOfTheRing.Unit.MiddleEarthUnit.Human.InfantryHuman;
import org.example.lordOfTheRing.Unit.MiddleEarthUnit.MiddleEarthUnit;
import org.example.lordOfTheRing.Unit.MiddleEarthUnit.Rohirim;
import org.example.lordOfTheRing.Unit.MiddleEarthUnit.Wizard;
import org.example.lordOfTheRing.Unit.MordorUnit.Goblin;
import org.example.lordOfTheRing.Unit.MordorUnit.MordorUnit;
import org.example.lordOfTheRing.Unit.MordorUnit.Orc;
import org.example.lordOfTheRing.Unit.Unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Battle {


    public static void fight() {
        Army<MordorUnit> mordorArmy = new Army<>();
        Army<MiddleEarthUnit> middleEarthArmy = new Army<>();

        // Формирование армий
        formArmy(mordorArmy, middleEarthArmy);

        // Вывод состава армий
        printArmy(mordorArmy, "Mordor");
        printArmy(middleEarthArmy, "Middle Earth");

        // Фаза 1: сражение кавалерии
        fightPhase(mordorArmy.getCavalry(), middleEarthArmy.getCavalry(), 1);

        // Фаза 2: сражение пехоты
        fightPhase(mordorArmy.getInfantry(), middleEarthArmy.getInfantry(), 2);

        // Фаза 3: сражение выживших
        List<Unit> mordorSurvivors = new ArrayList<>(mordorArmy.getCavalry());
        mordorSurvivors.addAll(mordorArmy.getInfantry());

        List<Unit> middleEarthSurvivors = new ArrayList<>(middleEarthArmy.getCavalry());
        middleEarthSurvivors.addAll(middleEarthArmy.getInfantry());

        if (!mordorSurvivors.isEmpty() && !middleEarthSurvivors.isEmpty()) {
            System.out.println("Phase 3:");
            fightPhase(mordorSurvivors, middleEarthSurvivors, 3);
        }

        // Определение победителя
        Army<? extends Unit> winner = determineWinner(mordorSurvivors, middleEarthSurvivors);
        printWinningArmy(winner);
    }

    public static void fight(Army<MordorUnit> mordorArmy, Army<MiddleEarthUnit> middleEarthArmy) {
        // Вывод состава армий
        printArmy(mordorArmy, "Mordor");
        printArmy(middleEarthArmy, "Middle Earth");

        // Фаза 1: сражение кавалерии
        fightPhase(mordorArmy.getCavalry(), middleEarthArmy.getCavalry(), 1);

        // Фаза 2: сражение пехоты
        fightPhase(mordorArmy.getInfantry(), middleEarthArmy.getInfantry(), 2);

        // Фаза 3: сражение выживших
        List<Unit> mordorSurvivors = new ArrayList<>(mordorArmy.getCavalry());
        mordorSurvivors.addAll(mordorArmy.getInfantry());

        List<Unit> middleEarthSurvivors = new ArrayList<>(middleEarthArmy.getCavalry());
        middleEarthSurvivors.addAll(middleEarthArmy.getInfantry());

        if (!mordorSurvivors.isEmpty() && !middleEarthSurvivors.isEmpty()) {
            System.out.println("Phase 3:");
            fightPhase(mordorSurvivors, middleEarthSurvivors, 3);
        }

        // Определение победителя
        Army<? extends Unit> winner = determineWinner(mordorSurvivors, middleEarthSurvivors);
        printWinningArmy(winner);
    }

    private static void formArmy(Army<MordorUnit> mordorArmy, Army<MiddleEarthUnit> middleEarthArmy) {

        Random random = new Random();
        int MIN_ARMY_SIZE = 10;
        int MAX_ARMY_SIZE = 20;
        int MAX_DIFF = 5;
        // 1. Определяем размер армий случайно, но с ограничением по разнице
        int mordorSize = random.nextInt(MAX_ARMY_SIZE) + MIN_ARMY_SIZE;
        int middleEarthSize = mordorSize + random.nextInt(MAX_DIFF) - random.nextInt(MAX_DIFF);

        // 2. Заполняем армию Мордора случайным образом
        for(int i = 0; i < mordorSize; i++) {
            if(random.nextBoolean()) {
                mordorArmy.recruit(new Orc("Orc " + i));
            } else {
                mordorArmy.recruit(new Goblin("Goblin " + i));
            }
        }

        // 3. Заполняем армию Средиземья случайным образом
        //    и случайно определяем наличие волшебника
        boolean hasWizard = random.nextBoolean();
        for(int i = 0; i < middleEarthSize; i++) {
            if(random.nextBoolean()) {
                middleEarthArmy.recruit(new Rohirim("Rohirim " + i,1,10));
            } else {
                middleEarthArmy.recruit(new InfantryHuman("Human " + i));
            }
            if(hasWizard && i == 0) {
                middleEarthArmy.recruit((MiddleEarthUnit) new Wizard("Gandalf"));
            }
        }
    }

    private static void printArmy(Army<? extends Unit> army, String type) {
        System.out.println("Army of " + type + " consists of:");
        for (Unit unit : army.getArmy()) {
            System.out.println(unit);
        }
        System.out.println();
    }

    private static void fightPhase(List<? extends Unit> army1, List<? extends Unit> army2, int phase) {


    }

    private static Army<? extends Unit> determineWinner(List<? extends Unit> army1, List<? extends Unit> army2) {
        if (army1.isEmpty()) {
            return new Army<>();
        }
        if (army2.isEmpty()) {
            return new Army<>();
        }
        return army1.size() > army2.size() ? new Army<>() : new Army<>();
    }

    private static void printWinningArmy(Army<? extends Unit> winner) {
        System.out.println("Army of " + winner.getClass().getSimpleName() + " has won the battle. The winners list:");
        for (Unit unit : winner.getArmy()) {
            System.out.println(unit);
        }
    }
}
