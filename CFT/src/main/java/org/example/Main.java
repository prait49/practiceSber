package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Введите наименование файла который хотите отправить на сортировку");
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current default path: " + currentDir);
//        String file = scanner.nextLine();
        String file = "in1.txt";
        String filePath = "File\\"+file;

        File inputFile = new File(filePath);

        try {
            Scanner scannerFile =new Scanner(inputFile);
            List<Integer> numbers = new ArrayList<>();

            while (scannerFile.hasNextInt()) {
                int number = scannerFile.nextInt();
                System.out.println(number);
                numbers.add(number);
            }
            scannerFile.close();

            // Преобразование списка в массив
            int[] numbersArray = new int[numbers.size()];
            for (int i = 0; i < numbers.size(); i++) {
                numbersArray[i] = numbers.get(i);


            }

            // Далее вы можете использовать массив numbersArray

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void Sorting() {
    }




}



