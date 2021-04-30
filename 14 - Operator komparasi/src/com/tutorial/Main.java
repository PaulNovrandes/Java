package com.tutorial;

public class Main {

    public static void main(String[] args){

        // Operator Komparasi.. ini akan menghasilkan nilai dalam bentuk boolean

        int a, b;
        boolean hasilkomparasi;

        // Operator equal atau persamaan
        System.out.println("----PERSAMAAN");
        a = 10;
        b = 10;
        hasilkomparasi = (a==b);
        System.out.printf("%d == %d --> %s \n",a,b,hasilkomparasi);
        a = 11;
        b = 10;
        hasilkomparasi = (a==b);
        System.out.printf("%d == %d --> %s \n",a,b,hasilkomparasi);

        // Operator Not equal atau pertidaksamaan
        System.out.println("----PERTIDAKSAMAAN");
        a = 10;
        b = 10;
        hasilkomparasi = (a!=b);
        System.out.printf("%d != %d --> %s \n",a,b,hasilkomparasi);
        a = 11;
        b = 10;
        hasilkomparasi = (a!=b);
        System.out.printf("%d != %d --> %s \n",a,b,hasilkomparasi);

        // Operator Less Than atau kurang dari
        System.out.println("----KURANG DARI");
        a = 9;
        b = 10;
        hasilkomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b,hasilkomparasi);
        a = 11;
        b = 10;
        hasilkomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b,hasilkomparasi);

        // Operator Greater Than atau lebih besar dari
        System.out.println("----LEBIH BESAR DARI");
        a = 9;
        b = 10;
        hasilkomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b,hasilkomparasi);
        a = 11;
        b = 10;
        hasilkomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b,hasilkomparasi);

        // Operator less than equal atau kurang dari sama dengan
        System.out.println("----KURANG DARI SAMA DENGAN");
        a = 9;
        b = 10;
        hasilkomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b,hasilkomparasi);
        a = 10;
        b = 10;
        hasilkomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b,hasilkomparasi);
        a = 11;
        b = 10;
        hasilkomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b,hasilkomparasi);

        // Operator greater than equal atau lebih besar dari sama dengan
        System.out.println("----LEBIH BESAR DARI SAMA DENGAN");
        a = 9;
        b = 10;
        hasilkomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b,hasilkomparasi);
        a = 10;
        b = 10;
        hasilkomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b,hasilkomparasi);
        a = 11;
        b = 10;
        hasilkomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b,hasilkomparasi);

    }
}
