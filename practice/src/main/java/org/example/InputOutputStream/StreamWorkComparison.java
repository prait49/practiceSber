package org.example.InputOutputStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StreamWorkComparison {


    public static long checkFileReaderWork(String file) {

        try (FileReader fileReader = new FileReader(file)) {
            long startTime = System.currentTimeMillis();

            while (fileReader.ready()) {
                fileReader.read();
            }
            fileReader.close();
            long endTime = System.currentTimeMillis();
            return endTime - startTime;
        } catch (Exception e) {
            return -1;
        }

    }

    public static long checkBufferedReaderWork(String file) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            long startTime = System.currentTimeMillis();

            while (bufferedReader.ready()) {
                bufferedReader.readLine();
            }
            bufferedReader.close();
            long endTime = System.currentTimeMillis();
            return endTime - startTime;
        } catch (Exception e) {
            return -1;
        }
    }

    public static long checkScannerWork(String file) {
        try (Scanner scanner = new Scanner(new File(file))) {
            long startTime = System.currentTimeMillis();
            while (scanner.hasNextLine()) {
                scanner.nextLine();
            }
            scanner.close();
            long endTime = System.currentTimeMillis();
            return endTime - startTime;
        } catch (Exception e) {
            return -1;
        }
    }

    public static List<String[]> compareReading(String file) {

        List<String[]> result= new ArrayList<>();

        long fileReaderTime = checkFileReaderWork(file);
        if (fileReaderTime!=-1){
            result.add(new String[]{"FileReader ",String.valueOf(fileReaderTime)});
        }
        long bufferedReaderTime = checkBufferedReaderWork(file);

        if (bufferedReaderTime != -1) {
            result.add(new String[]{"BufferedReader ", String.valueOf(bufferedReaderTime)});
        }
        long scannerTime = checkScannerWork(file);
        if (scannerTime != -1) {
            result.add(new String[]{"Scanner ", String.valueOf(scannerTime)});
        }
        result.sort(Comparator.comparingLong(arr -> Long.parseLong(arr[1])));

        return result;

    }


}
