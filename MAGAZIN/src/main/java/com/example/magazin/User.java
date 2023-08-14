package com.example.magazin;

public class User {
    private String name;
    private int age;
    private String password;

    public User(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public boolean checkAge() {
        return age >= 18 && age <= 100;
    }

    public boolean checkPassword() {
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[!@#$%^&*()].*");
    }}