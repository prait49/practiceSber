package org.example;

class Cinema {
    private String title;
    private String genre;
    private double duration; // in hours

    public Cinema(String title, String genre, double duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }
}
