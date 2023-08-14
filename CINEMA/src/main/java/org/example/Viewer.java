package org.example;

import java.util.List;

class Viewer {
    private String nickname;
    private int age;
    private List<Cinema> watchedMovies;

    public Viewer(String nickname, int age, List<Cinema> watchedMovies) {
        this.nickname = nickname;
        this.age = age;
        this.watchedMovies = watchedMovies;
    }

    public int getMoviesWatched() {
        return watchedMovies.size();
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Cinema> getWatchedMovies() {
        return watchedMovies;
    }

    public void setWatchedMovies(List<Cinema> watchedMovies) {
        this.watchedMovies = watchedMovies;
    }
}
