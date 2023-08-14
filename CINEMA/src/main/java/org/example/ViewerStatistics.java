package org.example;

import java.util.List;

class ViewerStatistics {
    public static double averageAge(List<Viewer> viewers) {
        if (viewers == null || viewers.isEmpty()) {
            return 0;
        }

        int totalAge = 0;
        for (Viewer viewer : viewers) {
            totalAge += viewer.getAge();
        }

        return (double) totalAge / viewers.size();
    }
}
