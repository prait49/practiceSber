package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner;
        File file = new File("C:/Users/potap/Desktop/studies/SberPractice/practice/src/main/resources/ВСJava.csv");
        scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] fields = line.split(";");
            if (fields.length == 6) {
                String name = fields[1];
                String region = fields[2];
                String district = fields[3];
                String population = fields[4];
                String foundation = fields[5];
                City city = new City(name, region, district, population, foundation);

                System.out.println(city.toString());


            }
        }
    }}