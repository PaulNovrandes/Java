package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        int[] arrayAngka = {11,12,13,14,15,16,17,18,19,20};

        // looping stadard
        System.out.println("looping standard");
        for (int i = 0; i < 10;i++){
            System.out.println("Index ke- "+ i + " adalah = " + arrayAngka[i]);
        }
        // looping dengan properti array
        System.out.println("looping dengan properti lenght");
        // System.out.println(arrayAngka.length); ---> jika ingin melihat jumlah komponen arrayAngka.lenght
        for(int i = 0; i < arrayAngka.length; i++){
            System.out.println("Index ke- "+ i + " adalah = " + arrayAngka[i]);
        }

        // looping khususon untuk collection
        System.out.println("looping for each");
        for(int angka : arrayAngka){ // ini digunakan untuk menampilkan nilai komponen tanpa menampilkan nilai index
            System.out.println( "angka pada looping ini = "+ angka);
        }
    }
}
