package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(" Pusing-pusing, mahasiswa galau nan merana ");
        System.out.println(" dari pada pusing, mari kita belajar sama-sama");
        System.out.println(" Ups... Eaa... Eaa...");
        System.out.print('\n');

        while(true) {
            Scanner userInput = new Scanner(System.in);

            System.out.print("panjang = ");
            int inputPanjang = userInput.nextInt();
            System.out.print("lebar = ");
            int inputLebar = userInput.nextInt();

            gambar(inputPanjang, inputLebar);

            System.out.println("luas = " + luas(inputPanjang, inputLebar));
            System.out.println("keliling = " + keliling(inputPanjang, inputLebar));

            tampilkanLuasDanKeliling(inputPanjang, inputLebar);
        }
    }
    private static void tampilkanLuasDanKeliling(int panjang, int lebar){
        System.out.println("luas = " + luas(panjang,lebar));
        System.out.println("keliling = " + keliling(panjang,lebar));
    }

    private static int keliling (int panjang, int lebar){
        int hasil = (panjang + lebar) * 2;
        System.out.println("menghitung keliling dengan panajang " + panjang + ", lebar " +lebar);
        return hasil;
    }

    private static int luas (int panjang, int lebar){
        int hasil = panjang * lebar;
            return hasil;
    }

    private static void gambar (int panjang, int lebar){
        for(int i = 0; i < lebar; i++){
            for(int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}













