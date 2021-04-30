package com.tutorial;

import java.util.*;

public class Main {

    public static void main (String[] args) {

        // menghitung deret fibonacci ke-n

        int f_n, f_n_1, f_n_2, n;

        Scanner userInput = new Scanner(System.in);
        System.out.print("mengambil nilai fibonacci ke - : ");
        n = userInput.nextInt();

        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        for (int i = 1; i <= n; i++){
            System.out.println("nilai ke - " + i + " menjadi " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;

            // Tugas menggunakan while loop dan do while loop
        }
    }
}
