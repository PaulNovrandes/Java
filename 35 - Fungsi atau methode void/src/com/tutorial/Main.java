package com.tutorial;

public class Main {

    public static void main (String[] args){

        // void itu artinya hampa
        System.out.println(simple());

        fungsiVoid("Apa pun");
        selamatPagi("Emak");
        selamatPagi("Abah");
    }
    private static void selamatPagi (String nama){
        System.out.println("Selamat pagi " + nama);
    }
    // Fungsi atau method tanpa kembalian

    private static void fungsiVoid (String input){
        System.out.println(input);
    }
    // Fungsi atau methode dengan kembalian
    // sehingga menggunakan return
    // untuk mengembalikan nilainya
    // dalam hal ini merupakan 10.5f
    private static float simple (){
        return 10.5F;
    }
}
