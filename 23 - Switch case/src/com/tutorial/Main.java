package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // tutorial untuk switch case

        String input;
        Scanner userInput = new Scanner(System.in);

        System.out.print("panggil nama : ");
        input = userInput.next();

        // ekspresinya berupa satuan (Int, long, byte, short), string dan enum
        switch (input){
            case "otong":
                System.out.println("saya otong dan hadir bos!!!");
                break;
            case "ucup":
                System.out.println("saya ucup dan hadir bos!!!");
                break;
            case "mario":
                System.out.println("saya mario dan hadir bos!!!");
                break;
            default:
                System.out.println(input + " tidak hadir bos");
        }

        System.out.println("Ini adalah akhir program");
    }
}
