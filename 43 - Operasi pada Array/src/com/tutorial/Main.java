package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] angkaArray1 = {1,2,3,4,5};

        //Mengubah Array
        System.out.println("\nMengubah Array\n=========");
        printArray(angkaArray1);

        int[] angkaArray2 = new int[5];
        System.out.println("\nMengkopi Array\n=========");
        printArray(angkaArray1);
        printArray(angkaArray2);
        System.out.println("\nMengkopi dengan loop");
        System.out.println("====================");
        for(int i = 0; i < angkaArray1.length; i++){
            angkaArray2[i] = angkaArray1[i];
        }
        printArray(angkaArray1);
        System.out.println(angkaArray1);
        printArray(angkaArray2);
        System.out.println(angkaArray2);

        System.out.println("\nMengkopi dengan Copyof\n======== ");
        int[] angkaArray3 = Arrays.copyOf(angkaArray1,5);
        printArray(angkaArray1);
        System.out.println(angkaArray1);
        printArray(angkaArray3);
        System.out.println(angkaArray3);

        System.out.println("\nMengkopi dengan Copyof range\n========");
        int[] angkaArray4 = Arrays.copyOfRange(angkaArray1,0,5);
        // pada penggunaan copyofRange ini yang ditampilkan adalah sesuai dengan indexingnya
        // akan tetapi index terakhir tidak akan ditampilkan
        // atau dengan kata lain index teakhir merupakan batasannya.
        printArray(angkaArray1);
        System.out.println(angkaArray1);
        printArray(angkaArray4);
        System.out.println(angkaArray4);

        //Fill Array
        System.out.println("\nFill Array\n=========");
        int[] angkaArray5 = new int[10];
        printArray(angkaArray5);
        Arrays.fill(angkaArray5,5);
        printArray(angkaArray5);

        //Mengkomparasi Array
        System.out.println("\nMengkomparasi Array\n=========");
        int[] angkaArray6 = {1,2,3,4,5};
        int[] angkaArray7 = {1,2,3,4,5};

        System.out.println("\nmembandingakan dua buah array\n=============");
        System.out.println(Arrays.equals(angkaArray6,angkaArray7));
        if(Arrays.equals(angkaArray6,angkaArray7)){
            System.out.println("Array ini sama");
        }else {
            System.out.println("Array ini beda");
        }

        System.out.println("\nngecek mana array yang lebih besar");
        System.out.println(Arrays.compare(angkaArray6,angkaArray7));

        System.out.println("\nngecek mana index yang berbeda");
        System.out.println(Arrays.mismatch(angkaArray6,angkaArray7));

        //sort Array atau mengurutkan Array
        System.out.println("\nsorting Array\n=========");
        int[] angkaArray8 = {1,6,5,5,3,4,2,6};
        printArray(angkaArray8);
        Arrays.sort(angkaArray8);
        printArray(angkaArray8);

        //search Array / mencari posisi Array
        // dengan binarySearch
        // kelamahan dari binarySearch adalah harus di urutkan terlebih dahulu
        System.out.println("\nsearch Array\n==========");
        int angka = 3;
        int posisi = Arrays.binarySearch(angkaArray8,angka);
        System.out.println("array = " + angka + " berada pada posisi" + posisi);

        // Tugas buat sort terbalik (dengan loop)
        // buat penjumlahan antara dua buah array (buat fungsi dengan copyof)
        // meggabungkan dua buah array (fungsi dengan copy) -> menjadi total dari jumlah kedua buah array tersebut
    }

    private static void printArray(int[] dataArray){
        System.out.println("Angka Array = " + Arrays.toString(dataArray));
    }

}
