package com.tutorial;

public class Main {

    public static void main(String[] args){

        int hasilInteger;
        hasilInteger = tambah(4,5);
        printAngka(hasilInteger);

        float hasilFloat;
        hasilFloat = tambah(4.5f,5);
        printAngka(hasilFloat);

        hasilFloat = tambah(4.4f,5.5f);
        printAngka(hasilFloat);

        hasilInteger = tambah(4,5,6);
        printAngka(hasilInteger);

        printAngka(10);
        printAngka(10.5f);
        printAngka(16.4d);
        printAngka(18);

   }

    private static int tambah(int angkaInt1, int angkaInt2, int angkaInt3){
        return angkaInt1 + angkaInt2 + angkaInt3;
    }

    private static float tambah(float angkaFloat1, float angkaFloat2){
        return angkaFloat1 + angkaFloat2;
    }

    private static float tambah(float angkaFloat1, int angkaInt1){
        return angkaFloat1 + angkaInt1;
    }

    private static int tambah(int angkaInt1, int angkaInt2){
        return angkaInt1 + angkaInt2;
    }

    private static void printAngka(double angkaDouble){
        System.out.println("ini adalah angka double dengan nilai = " + angkaDouble);
    }

    private static void printAngka(float angkaFloat){
        System.out.println("ini adalah angka float dengan nilai = " + angkaFloat);
    }

    private static void printAngka(int angkaInteger){
        System.out.println("ini adalah angka integer dengan nilai = " + angkaInteger);
    }
}
