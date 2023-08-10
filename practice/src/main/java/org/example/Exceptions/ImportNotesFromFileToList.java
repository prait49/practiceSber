package org.example.Exceptions;

import java.io.*;
import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImportNotesFromFileToList {


    public static List<String> realNotesToList(String file) {
        List<String> notes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    notes.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Process finished");
        }
        return notes;
    }

    public static void writeCommentToNotes(String file) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку");
            String comment = scanner.nextLine();
            writer.write("#" + comment);
            writer.newLine();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            if (e instanceof AccessDeniedException) {
                System.out.println("Access denied");
            } else {
                e.printStackTrace();
            }
        } finally {
            System.out.println("Process finished");
        }


    }
}
