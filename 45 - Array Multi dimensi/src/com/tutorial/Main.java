package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Belajar Array Multi-dimensi");

        // Cara membuat Array 2 Dimensi dengan assignmen
        int[][] array_2D = {
                {1,2,3},
                {4,5,6}
        };

        printArray2D(array_2D);

        // Cara membuat Array 2 Dimensi dengan Deklarasi
        // Int[Baris][kolom]
        int[][] arrayAngka2 = new int[5][4];

        printArray2D(arrayAngka2);

//         looping lengkap secara manual
//        for (int i = 0; i < arrayAngka2.length; i ++){
//            System.out.print("[");
//            for (int j = 0; j < arrayAngka2[i].length; j ++){
//                System.out.print(arrayAngka2[i][j] + ", ");
//            }
//            System.out.print("]\n");
//        }

        // looping dengan foreach
//        for (int[] baris : arrayAngka2) {
//            System.out.print("[");
//            for (int angka : baris) {
//                System.out.print(angka + ", ");
//            }
//            System.out.print("]\n");
//        }
        // array secara manual, untuk pembuktian

        int [][] array_2D_2 = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };

        printArray2D(array_2D_2);

        int [][] array_ragged = {
                {1,2,3},
                {4,5,6,7,},
                {8},
        };

        printArray2D(array_ragged);

    }
    private static void printArray2D(int[][] dataArray){
        System.out.print("{\n");
        for (int[] baris : dataArray) {
            System.out.print("[");
            for (int angka : baris) {
                System.out.print(angka + ", ");
            }
            System.out.print("]\n");
            }
        System.out.print("}\n");
        }

    }
