package org.example.nestedClasses;

public class Transaction {

    private double price;

    private final double tax = 1.2;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public Transaction() {
    }

    double dealPrice() {
        return getPrice() * tax;
    }

    private void printCheck(double price) {
        System.out.println("price USD " + String.format("%.2f", price));
    }

    public void printChek() {
        printCheck(price);
        System.out.println("Order price: USD " + String.format("%.2f", getPrice()));
        System.out.println("Total price: USD " + String.format("%.2f", dealPrice()));
    }

    public class TransactionItem {

        private double price;
        private String name;

        public TransactionItem(double price, String name) {
            this.name = (name == null || name.trim().isEmpty())
                    ? "Default"
                    : name;
            this.price = (price <= 0)
                    ? 0
                    : price;
            Transaction.this.setPrice(getTransaction().price += price);
        }

        public Transaction getTransaction() {
            return Transaction.this;
        }

        void printInfo() {
            System.out.printf("Item: %s, price: USD %.2f%n", name, price);
            Transaction.this.printCheck(getPrice());
        }
    }

}
