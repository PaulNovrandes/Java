package com.tutorial;

public class Main {

    public static void main (String[] args){

        // tutorial if else if statement
        int a = 5;

        System.out.println("Ini adalah awal program");

        // if else if statement
        if (a == 5){

            System.out.println("Ini adalah aksi 1");

        } else if (a == 10) { // jika ingin menggunakan percabangan yang lebih banyak
            // maka tinggal menambahkan saja kondisi else if - nya

            System.out.println("Ini adalah aksi 2");

        } else {
            System.out.println("Ini adalah aksi default");
        }

        System.out.println("Ini adalah akhir program");

    }
}
