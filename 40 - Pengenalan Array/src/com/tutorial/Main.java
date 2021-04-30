package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        // Assaignment
        // tipedata [] nama = {komponen-komponennya}

        System.out.println("Assaignment Array");
        //          index = 0  1  2  3
        //                  |  |  |  |
        int[] arrayInteger = {1, 2, 3, 4};

        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);

        System.out.println("Declaration Array");
        float[] arrayFloat = new float[5];

        arrayFloat[3] = 10.5F;  // dengan mengubah seperti ini maka
                                // array yang ada pada index ke tiga akan berubah

        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);

        // untuk lebih mudah dalam menampilkan array kita dpat menggunakan
        // Arrays yang ada pada library java. contoh:
        // dengan mengubahnya ke bentuk string

        System.out.println(Arrays.toString(arrayInteger));
        System.out.println(Arrays.toString(arrayFloat));
    }
}
