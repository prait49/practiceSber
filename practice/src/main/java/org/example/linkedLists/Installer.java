package org.example.linkedLists;

import java.util.*;

public class Installer implements Subsystem {
    String name;
    int version;
    Subsystem[] prerequisites;

    public Installer(String name, int version, Subsystem[] prerequisites) {
        this.name = name;
        this.version = version;
        this.prerequisites = prerequisites;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getVersion() {
        return version;
    }

    @Override
    public void install() {
        System.out.println(getName() + " version " + getVersion() + " installed successfully");
    }
    @Override
    public Subsystem[] getPrerequisites() {
        return prerequisites;
    }



    public Queue<Subsystem> setUpPlan() {
        Queue<Subsystem> installQueue = new LinkedList<>();
        Set<Subsystem> added = new HashSet<>();

        addPrerequisite(this, installQueue, added);

        return installQueue;
    }

    private void addPrerequisite(Subsystem subsystem, Queue<Subsystem> installQueue, Set<Subsystem> added) {
        if (subsystem == null || added.contains(subsystem)) {
            return;
        }

        for (Subsystem preReq : subsystem.getPrerequisites()) {
            addPrerequisite(preReq, installQueue, added);
        }

        added.add(subsystem);
        installQueue.add(subsystem);
    }

    public void setUp(Queue<Subsystem> installQueue) {
        if (installQueue == null) {
            System.out.println("Install queue is null.");
            return;
        }

        for (Subsystem subsystem : installQueue) {
            subsystem.install();
        }
    }
}