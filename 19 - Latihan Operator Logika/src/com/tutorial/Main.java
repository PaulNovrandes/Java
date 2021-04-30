package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args){

        // membuat sebuah program untuk menangkap masukan dari user
        Scanner userInput = new Scanner(System.in);

        // membuat sebuah program sederhana untuk menebak angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("masukkan nilai tekanan anda = ");
        nilaiTebakan = userInput.nextInt();
        System.out.println("nilai tebakan anda adalah = " + nilaiTebakan);

        // operator logika equal / sama dengan (==)
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan anda = " + statusTebakan);

        // Operator aljabar boolean (and / or)
        System.out.println("===MENEBAK ANGKA ANTARA 4 - 9===");
        System.out.print("masukkan nilai antara 4 dan 9 = ");
        nilaiTebakan = userInput.nextInt();
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
        System.out.println("Tebakan anda = " + statusTebakan);

        /*  Tabel AND (&&)

          +-------------+
          |  a | b | c  |
          |----+---+----|
          |  0 | 0 | 0  |
          |  0 | 1 | 0  |
          |  1 | 0 | 0  |
          |  1 | 1 | 1  |
          +-------------+

         */
    }
}
