package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // kesimpulannya operasi aritmatika kali dan bagi dieksekusi lebih dahulu
        // karena lebih tinggi dari pada + dan -
        // untuk kali dan bagi setara jadi dieksekusi dari kiri ke kanan

        int hasil = 5 + 10 * 2;
        System.out.println("hasil = " + hasil);
        hasil = 10 + 10 / 2;
        System.out.println("hasil = " + hasil);
        hasil = 10 * 10 / 5;
        System.out.println("hasil = " + hasil);

        // jika kita ingin mengeksekusi + atau - lebih dulu maka,
        // kita harus melakukan pengelompokan dengan ()
        hasil = (10 + 2) / 2;
        System.out.println("hasil = " + hasil);

        Scanner userInput = new Scanner(System.in); // new Scanner merupakan objek yang berformat scanner
        // Program menghitun persamaan kuadrat
        System.out.println("MENGHITUN PERSAMAAN KUADRAT");
        int m, x, c, y;

        System.out.print("gradien m = ");
        m = userInput.nextInt(); // .nextInt() merupakan methode untuk input objek
        System.out.print("nilai x = ");
        x = userInput.nextInt();
        System.out.print("bias c = ");
        c = userInput.nextInt();

        y = (m * x * x) + c;
        System.out.println("nilai y = " + y);

    }
}
