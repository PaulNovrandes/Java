package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [][] array_2D = {
                {1,2,3},
                {4,5,6},
        };

        System.out.println(array_2D);
        System.out.println(Arrays.toString(array_2D));
        System.out.println(array_2D[0]);
        System.out.println(array_2D[1]);
        System.out.println(Arrays.toString(array_2D[0]));
        System.out.println(Arrays.toString(array_2D[1]));
        System.out.println(Arrays.deepToString(array_2D));
        System.out.print("\n");

        char[][] arrayChar_2D = {
                {'a','b','c'},
                {'d','e','e'},
        };

        System.out.println(arrayChar_2D);
        System.out.println(Arrays.toString(arrayChar_2D));
        System.out.println(Integer.toString(System.identityHashCode(arrayChar_2D[0])));
        System.out.println(Integer.toString(System.identityHashCode(arrayChar_2D[1])));
        System.out.println(Arrays.toString(arrayChar_2D[0]));
        System.out.println(Arrays.toString(arrayChar_2D[1]));
        System.out.println(arrayChar_2D[0]);
        System.out.println(arrayChar_2D[1]);
        System.out.println(Arrays.deepToString(arrayChar_2D));
    }
}
