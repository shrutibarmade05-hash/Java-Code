package com.in;

public class Electronics extends Product {
    int warranty = 12;

    void show_warranty() {   // ✅ class ke andar
        System.out.println("Warranty: " + warranty + " months");
    }
}