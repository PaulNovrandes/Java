package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        // Program penjumlahan dengan rentang nilai

        int nilaiAwal, nilaiAkhir, total;

        Scanner userInput = new Scanner(System.in);
        System.out.print("masukkan nilai awal = ");
        nilaiAwal = userInput.nextInt();
        System.out.print("masukkan nilai akhir = ");
        nilaiAkhir = userInput.nextInt();

        total = 0;

        for ( ;nilaiAwal <= nilaiAkhir ; nilaiAwal++){

            total = total + nilaiAwal;
            System.out.println("niali " + nilaiAwal + " menjadi " + total);

        }


    }
}
