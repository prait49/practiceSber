package org.example.arrayList;

public class Customer {

    private int purchaseCount;
    private double discountSize;
    private String name;

    public Customer(int purchaseCount, String name) {
        setPurchaseCount(purchaseCount);
        setName(name);
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
//        this.purchaseCount = (purchaseCount >= 0) ? purchaseCount : 0;
        this.purchaseCount = Math.max(purchaseCount, 0);

    }

    public double getDiscountSize() {
        if (purchaseCount < 5) {
            discountSize = 0;
        } else if (purchaseCount < 10) {
            discountSize = 0.05;
        } else if (purchaseCount < 15) {
            discountSize = 0.1;
        } else if (purchaseCount > 20) {
            discountSize = 0.2;
        }
        return discountSize;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = (name == null || name.length()==0) ? "No-name" : name;

    }


    public void customerInfo() {}
}
