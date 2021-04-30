package com.tutorial;

public class Main {

    public static void main(String[] args){

        // Operator Logika --> Operator yang bisa dilakukan pada tipe data boolean
        // OR, AND, XOR, Negasi

        boolean a, b, c;

        // OR / atau (||)
        System.out.println("==== OR (||) ====");
        a = false;
        b = false;
        c = (a||b);
        System.out.println("false || false = " + c);
        a = false;
        b = true;
        c = (a||b);
        System.out.println("false || true = " + c);
        a = true;
        b = false;
        c = (a||b);
        System.out.println("true || false = " + c);
        a = true;
        b = true;
        c = (a||b);
        System.out.println("true || true = " + c);

        // AND / dan (&&)
        System.out.println("==== AND (&&) ====");
        a = false;
        b = false;
        c = (a&&b);
        System.out.println("false && false = " + c);
        a = false;
        b = true;
        c = (a&&b);
        System.out.println("false && true = " + c);
        a = true;
        b = false;
        c = (a&&b);
        System.out.println("true && false = " + c);
        a = true;
        b = true;
        c = (a&&b);
        System.out.println("true && true = " + c);

        // XOR / exlusive or (^)
        System.out.println("==== XOR (^) ====");
        a = false;
        b = false;
        c = (a^b);
        System.out.println("false ^ false = " + c);
        a = false;
        b = true;
        c = (a^b);
        System.out.println("false ^ true = " + c);
        a = true;
        b = false;
        c = (a^b);
        System.out.println("true ^ false = " + c);
        a = true;
        b = true;
        c = (a^b);
        System.out.println("true ^ true = " + c);

        // Negasi / not / tidak ----> flipping
        System.out.println("==== NEGASI (!) ====");
        a = true;
        c = !a;
        System.out.println("true ---> (!) = " + c);
        a = false;
        c = !a;
        System.out.println("false ---> (!) = " + c);

    }
}
