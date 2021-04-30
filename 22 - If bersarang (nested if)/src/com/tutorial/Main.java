package com.tutorial;

public class Main {

    public static void main(String[] args){

        // Nested if atau if bersarang

        int a = 2;
        int b = 10;

        System.out.println("Ini adalah awal program");

        if (a == 2){

            if (b == 10) {

                System.out.println("Ini adalah dimana a dan b benar");

            } else {

                System.out.println("Ini adalah dimana a benar dan b salah");

            }

            } else {

            System.out.println("Ini adalah dimana a salah");

        }
        System.out.println("Ini adalah akhir program");
    }
}
