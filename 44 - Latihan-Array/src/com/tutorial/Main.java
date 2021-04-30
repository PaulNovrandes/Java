package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arrayAngka1 = {2,3,5,1,12,7,60,6,8,9};
        int[] arrayAngka2 = {0,4,3,2,1,5,9,8,7,4};

        // Penjumlahan dua buah array

        int[] arrayHasil1 = tambahArray(arrayAngka1, arrayAngka2);
        printArray(arrayAngka1, "angka 1");
        printArray(arrayAngka2, "angka 2");
        printArray(arrayHasil1,"hasil 1");

        // Menggabungkan dua buah array
        int[] arrayHasil2 = new int[arrayAngka1.length + arrayAngka2.length];

        for (int i = 0; i < arrayAngka1.length; i++){
            arrayHasil2[i] = arrayAngka1[i];
        }

        for (int i = 0; i < arrayAngka2.length; i++){
            arrayHasil2[i + arrayAngka1.length] = arrayAngka2[i];
        }

        printArray(arrayAngka1, "angka 1");
        printArray(arrayAngka2, "angka 2");
        printArray(arrayHasil2,"hasil 2");

        // Sorting Reverse, mengurutkan tapi terbalik
        printArray(arrayAngka1, "angka 1");
        reverse(arrayAngka1);
        printArray(arrayAngka1, "reverse 1");

        printArray(arrayAngka2, "angka 2");
        reverse2(arrayAngka2);
        printArray(arrayAngka2, "reverse 2");

    }
    private static void reverse2(int[] dataArray){
        Arrays.sort(dataArray);
        int buffer;

        for (int i = 0; i < dataArray.length/2; i ++) {
            buffer = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length - i) - 1];
            dataArray[(dataArray.length - i) - 1] = buffer;
        }

    }

    private static void reverse(int[] dataArray){
        Arrays.sort(dataArray);

        int[] arrayBuffer = Arrays.copyOf(dataArray, dataArray.length);

        for (int i = 0; i < dataArray.length; i ++){
            dataArray[i] = arrayBuffer[(dataArray.length - i) - 1];
        }
    }

    private static int[] tambahArray(int[] arrayInt1, int[] arrayInt2){
        int[] arrayHasil = new int[arrayInt1.length];
        for (int i = 0; i < arrayInt1.length; i++){
            arrayHasil[i] = arrayInt1[i] + arrayInt2[i];
        }
        return arrayHasil;
    }
    private static void printArray(int[] dataArray, String Message){
        System.out.println(Message + " = " + Arrays.toString(dataArray));
    }
}
