package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner UserInput = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;

//        int Input = UserInput.nextInt();
//        System.out.println("Input = " + Input);
//
//        int Input2 = UserInput.nextInt();
//        System.out.println("Input2 = " + Input2);

        // Latihan menghitung luas persegi panjang
        // luas = panjang * lebar
        System.out.println("MENGHITUNG LUAS");
        System.out.print("Panjang = ");
        panjang = UserInput.nextInt();
        System.out.print("Lebar = ");
        lebar = UserInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        System.out.println("MENGHITUNG VOLUME");
        System.out.print("tinggi = ");
        tinggi = UserInput.nextInt();

        volume = luas * tinggi;
        System.out.println("Volume = " + volume);

    }
}
