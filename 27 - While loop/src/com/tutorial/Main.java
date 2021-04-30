package com.tutorial;

public class Main {

    public static void main(String[] args) {

//        while (kondisi) {
//
//            aksi;
//        }
        int a = 0;
        boolean kondisi = true;
        System.out.println("Awal program");

        while (kondisi){

            System.out.println("While loop ke-" + a);
            // a++; jika ini diletakkan disini maka hasilnya adala 0 - 9
            // jika disini ditambahkan satu terlebih dahulu
            // lalu dicek kondisi a-nya.

            if (a == 10){
                kondisi = false;
            }

            a++;
            // jika a++ diletakkan setelah if maka hasil
            // adalah 0-10 karna dieksekusi sebanyak 11 kali
            // jadi kondisi a dicek terlebih dahulu lalu ditambahkan
        }

        System.out.println("Akhir program");
    }
}
