package com.tutorial;

import java.util.Locale;

public class Main {

    public static void main(String[] args){

        // Operator Bitwise --> operator untuk melakukanoperasi pada nilai bit
        byte a = 3;
        byte b,c;
        String a_bits,b_bits,c_bits;


        // SHIFT LEFT / geser ke kiri (<<)
        System.out.println("====SHIFT LEFT (<<)");
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = (byte) (a << 1);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);

        // SHIFT RIGHT / geser ke kanan (>>)
        System.out.println("====SHIFT RIGHT (>>)");
        b = 24;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);
        b = (byte) (b >> 1);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);

        // Operator Bitwise OR / atau (|)
        System.out.println("====BITWISE OR (|)");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);
        c = (byte) (a|b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
        System.out.println("--------------OR");
        System.out.printf("%s = %d \n", c_bits,c);

        // Operator Bitwise AND / dan (&)
        System.out.println("====BITWISE AND (&)");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);
        c = (byte) (a&b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
        System.out.println("--------------AND");
        System.out.printf("%s = %d \n", c_bits,c);

        // Operator Bitwise XOR / exlusive OR (^)
        System.out.println("====BITWISE XOR (^)");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);
        c = (byte) (a^b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
        System.out.println("--------------XOR");
        System.out.printf("%s = %d \n", c_bits,c);

        // Operator Negasi / Not (~)
        System.out.println("====BITWISE NEGASI (~)");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = (byte) (~a);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).substring(24);
        System.out.println("--------------NOT");
        System.out.printf("%s = %d \n", b_bits,b);

    }
}
