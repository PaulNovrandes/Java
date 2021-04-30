package com.tutorial;

public class Main {

    public static void main(String[] args) {
        // Program untuk Transformasi/mengkonversi tipe data Numerik

        int nilaiInt = 14;
        System.out.println("nilai Int = " + nilaiInt);

        //Memperbesar Rentang Nilai ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("nilai long = " + nilaiLong);

        //Memperkecil rentang nilai ke tipe data yang lebih kecil
        byte nilaiByte = (byte) nilaiInt; // ini namanya castting/ menambahkan tipe data ke variabel yg kita akan ganti nilainya
        System.out.println("nilai Byte = " + nilaiByte);
        System.out.println("nilai Byte Max = " + Byte.MAX_VALUE);
        System.out.println("nilai Byte Min = " + Byte.MIN_VALUE);

        //casting pembagian
        int a = 10;
        int b = 4;

        float c = a / b;
        System.out.printf("%d / %d = %f \n", a,b,c);

        float d = 10; // salah satu diganti menjadi float
        int e = 4;

        float f = d / e;
        System.out.printf("%f / %d = %f \n", d,e,f);

        int g = 10;
        float h = 4; // salah satu diganti menjadi float

        float i = g / h;
        System.out.printf("%d / %f = %f \n", g,h,i);

        int j = 10;
        int k = 4;

        float l = (float) j / k; // ini namanya casting
        System.out.printf("%d / %d = %f \n", j,k,l);

        int x = 10;
        int y = 4;

        float z = x / (float)y; // ini namanya casting
        System.out.printf("%d / %d = %f \n", x,y,z);

    }
}
