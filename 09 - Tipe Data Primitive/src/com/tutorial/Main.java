package com.tutorial;

public class Main {

    public static void main(String[] args){

        // Tipe data di java
        // Integer, Byte, Short, Long, Double, Float, Boolean

        //Integer (Satuan)
        int i = 10;
        System.out.println("=====INTEGER=====");
        System.out.println("nilai i = " + (i + 1));
        System.out.println("nilai i Max = " + Integer.MAX_VALUE); // Integer.MAX_VALUE namanya adalah Helper Class
        System.out.println("nilai i Min = " + Integer.MIN_VALUE);
        System.out.println("Besar Integer = " + Integer.BYTES + " Bytes");
        System.out.println("Besar Integer = " + Integer.SIZE + " Bits");

        //Byte (Satuan)
        byte b = 10;
        System.out.println("=====BYTE=====");
        System.out.println("nilai b = " + b);
        System.out.println("nilai b Max = " + Byte.MAX_VALUE); // Byte.MAX_VALUE namanya adalah Helper Class
        System.out.println("nilai b Min = " + Byte.MIN_VALUE);
        System.out.println("Besar Byte = " + Byte.BYTES + " Bytes");
        System.out.println("Besar Byte = " + Byte.SIZE + " Bits");

        //Short (Satuan)
        short s = 10;
        System.out.println("=====SHORT=====");
        System.out.println("nilai s = " + s);
        System.out.println("nilai s Max = " + Short.MAX_VALUE); // Short.MAX_VALUE namanya adalah Helper Class
        System.out.println("nilai s Min = " + Short.MIN_VALUE);
        System.out.println("Besar Short = " + Short.BYTES + " Bytes");
        System.out.println("Besar Short = " + Short.SIZE + " Bits");

        //Long (Satuan)
        long l = 10L;
        System.out.println("=====LONG=====");
        System.out.println("nilai l = " + l);
        System.out.println("nilai l Max = " + Long.MAX_VALUE); // Long.MAX_VALUE namanya adalah Helper Class
        System.out.println("nilai l Min = " + Long.MIN_VALUE);
        System.out.println("Besar Long = " + Long.BYTES + " Bytes");
        System.out.println("Besar Long = " + Long.SIZE + " Bits");

        //Double (bilangan dengan koma/ bilangan real)
        double d = -10.5d;
        System.out.println("=====DOUBLE=====");
        System.out.println("nilai d = " + d);
        System.out.println("nilai d Max = " + Double.MAX_VALUE); // double.MAX_VALUE namanya adalah Helper Class
        System.out.println("nilai d Min = " + Double.MIN_VALUE);
        System.out.println("Besar Double = " + Double.BYTES + " Bytes");
        System.out.println("Besar Double = " + Double.SIZE + " Bits");

        //Float (Bilangan dengan koma/ bilangan real)
        float f = -8.5f;
        System.out.println("=====FLOAT=====");
        System.out.println("nilai f = " + f);
        System.out.println("nilai f Max = " + Float.MAX_VALUE); // float.MAX_VALUE namanya adalah Helper Class
        System.out.println("nilai f Min = " + Float.MIN_VALUE);
        System.out.println("Besar Float = " + Float.BYTES + " Bytes");
        System.out.println("Besar Float = " + Float.SIZE + " Bits");

        //Char (karakter) nilainya berdasarkan pada ASCI
        char c = 'c';
        System.out.println("=====CHAR=====");
        System.out.println("nilai c = " + c);
        System.out.println("nilai c Max = " + Character.MAX_VALUE); // Character.MAX_VALUE namanya adalah Helper Class
        System.out.println("nilai c Min = " + Character.MIN_VALUE);
        System.out.println("Besar Char = " + Character.BYTES + " Bytes");
        System.out.println("Besar Char = " + Character.SIZE + " Bits");

        //Boolean (nilainya True atau False)
        boolean val = false;
        System.out.println("=====BOOLEAN=====");
        System.out.println("nilai val = " + val);
        System.out.println("nilai val Max = " + Boolean.TRUE); // Boolean.TRUE namanya adalah Helper Class
        System.out.println("nilai val Min = " + Boolean.FALSE);

    }
}
