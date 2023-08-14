package com.example.magazin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void testProductAvailableTrue() {
        Product product = new Product("Laptop", 999.99, 5);
        assertTrue(product.productAvailable());
    }

    @Test
    public void testProductAvailableFalse() {
        Product product = new Product("Phone", 499.99, 0);
        assertFalse(product.productAvailable());
    }

    @Test
    public void testSetProductPricePositive() {
        Product product = new Product("Tablet", 299.99, 10);
        product.setProductPrice(249.99);
        assertEquals(249.99, product.getProductPrice(), 0.001);
    }

    @Test
    public void testSetProductPriceNegative() {
        Product product = new Product("Speaker", 49.99, 20);
        product.setProductPrice(-10.0);
        assertEquals(49.99, product.getProductPrice(), 0.001);
    }
}