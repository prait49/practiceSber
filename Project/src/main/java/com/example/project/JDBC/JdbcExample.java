package com.example.project.JDBC;

import com.example.project.Table.Sale;

import java.sql.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcExample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/databaseName";
        String username = "username";
        String password = "password";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Добавление записи о продаже
            addSale(connection, 150.0, new Date(1), new Date(1), 1);

            // Получение продаж с суммой чека более 100
            List<Sale> sales = getSalesWithAmountGreaterThan100(connection);

            for (Sale sale : sales) {
                System.out.println("Sale ID: " + sale.getId());
                System.out.println("Amount: " + sale.getAmount());
                System.out.println("Purchase Date: " + sale.getPurchaseDate());
                System.out.println("Sale Date: " + sale.getSaleDate());
                System.out.println("Product ID: " + sale.getProductId());
                System.out.println("====================");
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void addSale(Connection connection, double amount, Date purchaseDate, Date saleDate, int productId) throws SQLException {
        String insertQuery = "INSERT INTO sales (amount, purchase_date, sale_date, product_id) VALUES (?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setDouble(1, amount);
            preparedStatement.setDate(2, new java.sql.Date(purchaseDate.getTime()));
            preparedStatement.setDate(3, new java.sql.Date(saleDate.getTime()));
            preparedStatement.setInt(4, productId);
            preparedStatement.executeUpdate();
        }
    }

    private static List<Sale> getSalesWithAmountGreaterThan100(Connection connection) throws SQLException {
        List<Sale> sales = new ArrayList<>();
        String selectQuery = "SELECT * FROM sales WHERE amount > 100";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectQuery)) {
            while (resultSet.next()) {
                Sale sale = new Sale();
                sale.setId(resultSet.getInt("id"));
                sale.setAmount(resultSet.getDouble("amount"));
                sale.setPurchaseDate(resultSet.getDate("purchase_date"));
                sale.setSaleDate(resultSet.getDate("sale_date"));
                sale.setProductId(resultSet.getInt("product_id"));
                sales.add(sale);
            }
        }
        return sales;
    }
}