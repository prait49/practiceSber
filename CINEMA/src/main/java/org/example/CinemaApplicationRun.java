package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        List<Viewer> viewers = new ArrayList<>();
        List<Cinema> user1Movies = new ArrayList<>();
        user1Movies.add(new Cinema("Movie1", "Drama", 2.5));
        user1Movies.add(new Cinema("Movie2", "Action", 2.0));
        viewers.add(new Viewer("User1", 25, user1Movies));

        List<Cinema> user2Movies = new ArrayList<>();
        user2Movies.add(new Cinema("Movie3", "Comedy", 1.5));
        viewers.add(new Viewer("User2", 30, user2Movies));


        double averageAge = ViewerStatistics.averageAge(viewers);
        System.out.println("Average age of viewers: " + averageAge);
    }
}
