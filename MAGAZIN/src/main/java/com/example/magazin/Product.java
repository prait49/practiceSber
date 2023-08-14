package com.example.magazin;

public class Product {
    private String productName;
    private double productPrice;
    private int productCount;

    public Product(String productName, double productPrice, int productCount) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCount = productCount;
    }

    public boolean productAvailable() {
        return productCount > 0;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        if (productPrice >= 0) {
            this.productPrice = productPrice;
        }
    }
}
