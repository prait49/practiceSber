package org.example;

class Viewer {
    String nickname;
    int age;
    int watchedMoviesCount;

    public Viewer(String nickname, int age, int watchedMoviesCount) {
        this.nickname = nickname;
        this.age = age;
        this.watchedMoviesCount = watchedMoviesCount;
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

    public int getWatchedMoviesCount() {
        return watchedMoviesCount;
    }

    public void setWatchedMoviesCount(int watchedMoviesCount) {
        this.watchedMoviesCount = watchedMoviesCount;
    }
}
