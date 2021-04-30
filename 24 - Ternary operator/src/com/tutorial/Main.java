package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args){

        int input, x;
        Scanner userInput = new Scanner(System.in);

        System.out.print("masukkan nilai = ");
        input = userInput.nextInt();

        // Ternary Operator (?  :)
        // variabel x = ekspresi ? statement_true : Statement_false;

        x = (input == 10) ? input*input : input/2; // ini adalah ternary operator

//        if (input == 10){
//            x = input*input;
//        } else {
//            x = input/2;
//        }

        System.out.println("hasilnya = " + x);
    }
}
