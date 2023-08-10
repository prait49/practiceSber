package org.example.ObjectStreamsSerialisation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ImportClients {

    public static List<Clients> cardsToClients(String folderPath) {
        List<Clients> clientsList = new ArrayList<>();

        try {
            File folder = new File(folderPath);
            File[] files = folder.listFiles((dir, name) -> name.endsWith(".out"));

            if (files != null) {
                for (File file : files) {
                    try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
                        Clients client = (Clients) inputStream.readObject();
                        clientsList.add(client);
                    } catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return clientsList;
    }


    public static void checkImport(List<Clients> clientsList) {
        if (clientsList.isEmpty()) {
            System.out.println("import failed");
        } else {
            Clients shortestNameClient = clientsList.get(0);
            for (Clients client : clientsList) {
                if (client.getName().length() < shortestNameClient.getName().length()) {
                    shortestNameClient = client;
                }
            }

            System.out.println(shortestNameClient.toString());
        }
    }

}

