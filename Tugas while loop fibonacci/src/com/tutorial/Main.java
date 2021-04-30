package com.tutorial;

import java.util.*;

public class Main {

    public static void main (String[] args) {

        int f_n_2, f_n_1, f_n, n, i;

        Scanner userInput = new Scanner(System.in);
        System.out.print("masukkan nilai ke - n : ");
        n = userInput.nextInt();


        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;
        i = 0;

        while (i < n){
            i++;
            System.out.println("nilai ke - " + i + " menjadi " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }


    }
}
