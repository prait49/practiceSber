package org.example;

import java.util.List;

class ViewerStatistics {

    public static double averageAge(List<Viewer> viewers) {
        int totalAge = 0;
        for (Viewer viewer : viewers) {
            totalAge += viewer.age;
        }
        return (double) totalAge / viewers.size();
    }
}
