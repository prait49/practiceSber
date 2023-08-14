package org.example;

import java.util.Arrays;
import java.util.List;

public class CinemaApplicationRun {

    public static void main(String[] args) {
        List<Viewer> viewers = Arrays.asList(
                new Viewer("john", 25, 10),
                new Viewer("mary", 30, 5),
                new Viewer("bob", 20, 12),
                new Viewer("alice", 27, 7),
                new Viewer("joe", 40, 20)
        );

        double averageAge = ViewerStatistics.averageAge(viewers);
        System.out.println("Средний возраст: " + averageAge);
    }
}
