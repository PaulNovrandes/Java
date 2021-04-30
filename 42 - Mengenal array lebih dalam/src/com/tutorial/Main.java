package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        int[] arrayAngka1 = {11,12,13,14,15};
        int[] arrayAngka2 = new int[5];

        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        System.out.print('\n');

        arrayAngka2 = arrayAngka1;

        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        System.out.print('\n');

        System.out.println("array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("array 2 -> " + Arrays.toString(arrayAngka2));

        System.out.print('\n');

        arrayAngka1[0] = 100;
        arrayAngka2[4] = 500;
        System.out.println("Pass by Reference");
        System.out.println("array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("array 2 -> " + Arrays.toString(arrayAngka2));

        ubahArray(arrayAngka1);
        System.out.println("array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("array 2 -> " + Arrays.toString(arrayAngka2));

    }
    // methode yang argumennya adalah reference, pass by reference
    // bukan pass by value

    private static void ubahArray(int[] dataArray){
        for(int array : dataArray){
            System.out.println(array);
        }
        dataArray[0] = 125;
        for(int array : dataArray){
            System.out.println(array);
        }
    }

}
