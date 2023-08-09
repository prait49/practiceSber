package org.example.linkedLists;

public interface Subsystem {

    String getName();
    int getVersion();
    void install();
    Subsystem[] getPrerequisites();


}
