package com.example.test;

import org.junit.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import static org.junit.Assert.assertThrows;

@SpringBootApplication
public class TestApplication {



    public static void main(String[] args) {

    }

    public static void importUsersToList(String path) throws IOException{
        LinkedList<String> users =new LinkedList<>();
        for(int i =0; i<4; i++){
            try {
                BufferedReader reader=new BufferedReader(new FileReader(path));
                String currentLine = reader.readLine();
                if(currentLine!="")
                        users.add(currentLine);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }

    }
    @Test
    public void testEmptyFileIOException() {
        assertThrows(IOException.class, () -> {
            importUsersToList("empty.txt");
        });
    }

    @Test
    public void testNonexistentFileFileNotFoundException() {
        assertThrows(FileNotFoundException.class, () -> {
            importUsersToList("nonexistent.txt");
        });
    }

    @Test
    public void testUnsupportedEncodingIOException() {
        assertThrows(IOException.class, () -> {
            importUsersToList("unsupported.txt");
        });
    }

    @Test
    public void testFileReadIOException() {
        assertThrows(IOException.class, () -> {
            importUsersToList("unreadable.txt");
        });
    }

    @Test
    public void testValidFileNoExceptions() {
        try {
            importUsersToList("valid.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
