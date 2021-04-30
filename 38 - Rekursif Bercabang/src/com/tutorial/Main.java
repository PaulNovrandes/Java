package com.tutorial;

import java.util.*;

public class Main {

    public static void main (String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.print("masukkan nilai n = ");
        int nilai = userInput.nextInt();
        int nilai_fibonaci = fibonacci(nilai,"atas");
        System.out.println("nilai fibonacci ke- " + nilai + "  adalah " + nilai_fibonaci);
    }
    private static int fibonacci (int n, String daun){
        System.out.println("daun " + daun);
        System.out.println("Fibonacci ke - " + n);
        if (n == 1 || n == 0){
            return n;
        } else {
            return fibonacci(n - 1, "kiri") + fibonacci(n - 2, "kana");
        }

    }
}
