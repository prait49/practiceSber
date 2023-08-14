package com.example.project.JPA;

import com.example.project.Table.Sale;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpaExample {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("your-persistence-unit-name");
        EntityManager em = emf.createEntityManager();

        // Вывод количества записей в таблице
        Query countQuery = em.createQuery("SELECT COUNT(s) FROM Sale s");
        Long rowCount = (Long) countQuery.getSingleResult();
        System.out.println("Total records in sales table: " + rowCount);

        // Вывод полной информации о продаже по идентификатору
        int saleId = 1; // Замените на нужный идентификатор
        Sale sale = em.find(Sale.class, saleId);
        if (sale != null) {
            System.out.println("Sale ID: " + sale.getId());
            System.out.println("Amount: " + sale.getAmount());
            System.out.println("Purchase Date: " + sale.getPurchaseDate());
            System.out.println("Sale Date: " + sale.getSaleDate());
            System.out.println("Product ID: " + sale.getProductId());
        } else {
            System.out.println("Sale with ID " + saleId + " not found.");
        }

        em.close();
        emf.close();
    }
}
