package com.tutorial;

public class Main {

    public static void main(String[] args){

//     for (Inisialisasi; kondisi; stepnilai;){
//         aksi;
//     }
        System.out.println("Ini adalah awal program");

        System.out.println("For loop pertama");
        for (int nilai = 0; nilai <= 10; nilai++){

            System.out.println("for loop ke-" + nilai);
        }
        System.out.println("For loop kedua");
        for (int nilai = 0; nilai < 10; nilai++){

            System.out.println("for loop ke-" + nilai);
        }
        System.out.println("For loop ketiga");
        for (int nilai = 10; nilai >= 5; nilai--){

            System.out.println("for loop ke-" + nilai);
        }
        System.out.println("For loop keempat");
        int nilai = 0;

        for (;nilai <= 10;){ // dapat ditulis dengan format seperti ini (;kondisi;)
                             // karena syarat minimalnya adalah adanya konsisi
            nilai++;
            System.out.println("for loop ke-" + nilai);
        }
//        System.out.println("Ini adalah akhir program");

    }
}
