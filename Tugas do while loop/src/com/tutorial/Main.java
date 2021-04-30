package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        // Program penjumlahan angka dengan rentang do while loop
        int nilaiAwal, nilaiAkhir, total;

        Scanner userInput = new Scanner(System.in);
        System.out.print("masukkan nilai awal = ");
        nilaiAwal = userInput.nextInt();
        System.out.print("masukkan nilai akhir = ");
        nilaiAkhir = userInput.nextInt();

        total = 0;

//        do {
//            aksi;
//        } while (kondisi);

        do {
            total = total + nilaiAwal;
            System.out.println("nilai awal " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;


        } while (nilaiAwal <= nilaiAkhir);

    }
}
