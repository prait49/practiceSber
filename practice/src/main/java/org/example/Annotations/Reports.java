package org.example.Annotations;


public class Reports {


    @ToRelease(customerName = "Div_2", version = 0)
    @ToRelease(customerName = "Div_5", version = 4)
    public static void Report2() {
        System.out.println("Report 2");
    }


    @ToRelease(customerName = "Div_2", version = 0)
    @ToRelease(customerName = "Div_5", version = 4)
    public static void Report4() {
        System.out.println("Report 4");
    }

    @ToRelease(customerName = "Div_5", version = 4)
    public static void Report5() {
        System.out.println("Report 5");
    }

    @ToRelease(customerName = "Div_2", version = 0)
    @ToRelease(customerName = "Div_5", version = 4)
    public static void Report6() {
        System.out.println("Report 6");
    }


    @ToRelease(customerName = "Div_2", version = 0)
    public static void Report8() {
        System.out.println("Report 8");
    }

    @ToRelease(customerName = "Div_2", version = 0)
    @ToRelease(customerName = "Div_5", version = 4)
    public static void Report10() {
        System.out.println("Report 10");
    }
}
