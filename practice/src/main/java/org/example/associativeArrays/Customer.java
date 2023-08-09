package org.example.associativeArrays;


import java.util.HashMap;
import java.util.Map;

public class Customer {

    private int id;
    private String name;
    private String phone;
    private float purchaseCount;

    public Customer(int id, String name, String phone, float purchaseCount) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.purchaseCount = purchaseCount;
    }
    private static Map<Integer, Customer> customers = new HashMap<>();

    public static void load(Customer[] customerArray) {
        for (Customer c : customerArray) {
            customers.put(c.id, c);
        }
    }

    public static Customer getById(int id) {
        return customers.get(id);
    }


}
