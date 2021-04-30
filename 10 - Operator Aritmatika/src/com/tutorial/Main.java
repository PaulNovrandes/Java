package com.tutorial;

public class Main {

    public static void main(String[] args) {

        //Operator Aritmatika

        int variable1 = 12;
        int variable2 = 5;

        int hasil;

        // Penjumlahan (+)
        hasil = variable1 + variable2;
        System.out.println(variable1 + " + " + variable2 + " = " + hasil);

        // Pengurangan (-)
        hasil = variable1 - variable2;
        System.out.printf("%d - %d = %d \n", variable1, variable2, hasil);

        // Perkalian (*)
        hasil = variable1 * variable2;
        System.out.printf("%d x %d = %d \n", variable1, variable2, hasil);

        // Pembagian (/)
        hasil = variable1 / variable2;
        System.out.printf("%d / %d = %d \n", variable1, variable2, hasil);

        float a = 6;
        float b = 5;

        float hasilfloat = a / b;
        System.out.println(a + "/" + b + " = " + hasilfloat);
        System.out.printf("%f / %f = %f \n", a, b, hasilfloat);

        // Modulus (sisa pembagian) = (%)
        hasil = variable1 % variable2;
        //untuk modulus jika menggunakan printf harus pakai %% (double %) agar tidak error
        System.out.printf("%d %% %d = %d \n",variable1,variable2,hasil);
        System.out.println(variable1 + " % " + variable2 + " = " + hasil);

    }
}
