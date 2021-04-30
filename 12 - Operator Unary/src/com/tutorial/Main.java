package com.tutorial;

public class Main {

    public static void main(String[] args) {

        // Operator Unary = Operasi yang dilakukan pada satu variabel saja

        // Unary + dan -
        int angka = 5;
        System.out.printf("unary '+', %d menjadi %d \n",angka, +angka);// tanda + tidak akan ditampilkan
        System.out.printf("unary '-', %d menjadi %d \n",angka, -angka);// tanda - akan ditampilkan

        // Unary Increment dan Decrement

        // Unary Increment (menambah 1 (++))
        int angka2 = 6;
        angka2++;
        System.out.println("nilai dengan '++' menjadi " + angka2);

        // Unary Decrement (mengurangi 1 (--))
        int angka3 = 7;
        angka3--;
        System.out.println("nilai dengan '--' menjadi " + angka3);

        // pada Increment terdapat postfix dan prefix
        int a = 8;
        System.out.printf("nilai dengan '++' prefix menjadi %d \n", ++a); // ++ ada didepan variabel a
        int b = 8;
        System.out.printf("nilai dengan '++' postfix menjadi %d \n", b++); // ++ ada dibelakang variabel b
        System.out.printf("nilai hasil dari postfix menjadi %d \n", b);

        // unary boolean denga ! untuk negasi
        boolean ucup = true;
        System.out.println("nilai boolean = " + ucup);
        System.out.println("nilai boolean = " + !ucup);
    }
}
