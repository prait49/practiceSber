package com.example.project.JDBC;

import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/databaseName";
        String username = "username";
        String password = "password";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Вывод количества записей в таблице
            Statement countStatement = connection.createStatement();
            ResultSet countResult = countStatement.executeQuery("SELECT COUNT(*) FROM sales");
            if (countResult.next()) {
                int rowCount = countResult.getInt(1);
                System.out.println("Total records in sales table: " + rowCount);
            }

            // Вывод полной информации о продаже по идентификатору
            int saleId = 1; // Замените на нужный идентификатор
            PreparedStatement saleInfoStatement = connection.prepareStatement("SELECT * FROM sales WHERE id = ?");
            saleInfoStatement.setInt(1, saleId);
            ResultSet saleInfoResult = saleInfoStatement.executeQuery();
            if (saleInfoResult.next()) {
                int id = saleInfoResult.getInt("id");
                double amount = saleInfoResult.getDouble("amount");
                Date purchaseDate = saleInfoResult.getDate("purchase_date");
                Date saleDate = saleInfoResult.getDate("sale_date");
                int productId = saleInfoResult.getInt("product_id");

                System.out.println("Sale ID: " + id);
                System.out.println("Amount: " + amount);
                System.out.println("Purchase Date: " + purchaseDate);
                System.out.println("Sale Date: " + saleDate);
                System.out.println("Product ID: " + productId);
            } else {
                System.out.println("Sale with ID " + saleId + " not found.");
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}