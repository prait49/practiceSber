package org.example.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    private List<Customer> shopCustomers;

    public Shop() {
        this.shopCustomers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        shopCustomers.add(customer);
    }

    public void printShopSummary() {
        for (Customer customer : shopCustomers) {
            customer.customerInfo();
        }
    }

    public static Shop createShopInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shop data:");
        // Создаем объект класса шоп
        Shop shop = new Shop();

        //Создаем бесконечный цикл, выход из которого будет означать закрытие приложения
        while (true) {
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }
            String[] result = input.split(",");
            if (result.length < 3) {
                System.out.println(".");
                continue;
            }
            String name = result[1].trim();
            int purchaseCount = Integer.parseInt(result[2].trim());

            if (result[0].equals("1") && result.length>3) {
                String documentNumber = result[3].trim();
                shop.addCustomer(new CashCustomer(name, documentNumber, purchaseCount));
            } else if (result[0].equals("2")&& result.length>3) {
                String cardNumber = result[3].trim();
                shop.addCustomer(new CardCustomer(purchaseCount, name, cardNumber));
            } else {
                shop.addCustomer(new Customer(purchaseCount, name));
            }
            shop.printShopSummary();
        }
        return shop;
    }
}
    
