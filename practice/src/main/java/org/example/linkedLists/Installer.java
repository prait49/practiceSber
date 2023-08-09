package org.example.linkedLists;

import java.util.*;

public class Installer {
    String name;
    int version;
    Subsystem[] prerequisites;

    public LinkedList<Subsystem> setUpPlan() {
        LinkedList<Subsystem> installQueue = new LinkedList<>();

        boolean[] added = new boolean[prerequisites.length];

        for (int i = 0; i < prerequisites.length; i++) {
            if (prerequisites[i] == null) {
                System.out.println("SetUp plan calculation failed. Wrong prerequisite description at " + name + " " + version + ".");
                return new LinkedList<>();
            }
            addPrerequisite(prerequisites[i], installQueue, added);
        }
        return installQueue;
    }

    private void addPrerequisite(Subsystem subsystem, LinkedList<Subsystem> installQueue, boolean[] added) {
        if (added[subsystem.getVersion()]) {
            return;
        }

        Subsystem[] prerequisites = subsystem.getPrerequisites();
        for (Subsystem preReq : prerequisites) {
            addPrerequisite(preReq, installQueue, added);
        }

        added[subsystem.getVersion()] = true;
        installQueue.add(subsystem);
    }

    public void setUp(LinkedList<Subsystem> installQueue) {
        for (Subsystem subsystem : installQueue) {
            subsystem.install();
            System.out.println(subsystem.getName() + " version " + subsystem.getVersion() + " installed successfully");
        }
    }
}