package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        int f_n, f_n_1, f_n_2, n, i;

        Scanner userInput = new Scanner(System.in);
        System.out.print("mengambil nilai fibonacci ke - : ");
        n = userInput.nextInt();

        i = 0;

        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        do {
            i++;
            System.out.println("nilai ke - " + i + " menjadi " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;

        } while (i < n);

    }
}
