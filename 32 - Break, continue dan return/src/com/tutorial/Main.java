package com.tutorial;

public class Main {

    public static void main (String[] args) {

        // keyword Break, Continue, Return
        int a = 0;

        while (true){
            a++;

            if (a == 10){
                break;
                // keyword untuk memaksa keluar dari looping
            } else if (a == 5){
                continue;
                // keyword untuk mamaksa memmulai aksi dari awal
            } else if (a == 7){
                return;
                // untuk memaksa keluar dari proses/ program
            }
            System.out.println("looping ke - " + a);
        }
        System.out.println("akhir dari looping");
    }
}
