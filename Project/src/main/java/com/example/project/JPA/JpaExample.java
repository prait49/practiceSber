package com.example.project.JPA;

import com.example.project.Table.Sale;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

public class JpaExample {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("your-persistence-unit-name");
        EntityManager em = emf.createEntityManager();

        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();

            // Добавление записи о продаже
            addSale(em, 150.0, new Date(), new Date(), 1);

            transaction.commit();

            // Получение продаж с суммой чека более 100
            List<Sale> sales = getSalesWithAmountGreaterThan100(em);

            for (Sale sale : sales) {
                System.out.println("Sale ID: " + sale.getId());
                System.out.println("Amount: " + sale.getAmount());
                System.out.println("Purchase Date: " + sale.getPurchaseDate());
                System.out.println("Sale Date: " + sale.getSaleDate());
                System.out.println("Product ID: " + sale.getProductId());
                System.out.println("====================");
            }
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }

    private static void addSale(EntityManager em, double amount, Date purchaseDate, Date saleDate, int productId) {
        Sale sale = new Sale();
        sale.setAmount(amount);
        sale.setPurchaseDate(purchaseDate);
        sale.setSaleDate(saleDate);
        sale.setProductId(productId);
        em.persist(sale);
    }

    private static List<Sale> getSalesWithAmountGreaterThan100(EntityManager em) {
        TypedQuery<Sale> query = em.createQuery("SELECT s FROM Sale s WHERE s.amount > 100", Sale.class);
        return query.getResultList();
    }
}
