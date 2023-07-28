package org.example;

import org.example.arrayList.CardCustomer;
import org.example.arrayList.CashCustomer;
import org.example.arrayList.Customer;
import org.example.arrayList.Shop;
import org.example.lordOfTheRing.Unit.Unit;
import org.example.lordOfTheRing.Unit.Unit;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        A objA = new A();
//        B objB = new B();
//
//            System.out.println(objB instanceof A);
//            System.out.println(objA instanceof B);








    }
}

class ABC <T extends Unit>{
    private List<T> Cavalry;

    public ABC(List<T> cavalry) {
        Cavalry = cavalry;
    }

}


class A {
    int a;
}
class B extends A {
    int b;
}