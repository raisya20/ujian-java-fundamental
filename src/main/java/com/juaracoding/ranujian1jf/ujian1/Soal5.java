package com.juaracoding.ranujian1jf.ujian1;
//Array
public class Soal5 {
    public static void main(String[] args) {
        // Array multidimensi untuk menyimpan harga tiket dari 5 film
        // Dimensi 1: film, Dimensi 2: harga
        int[][] hargaTiket = {
                {1, 50000},
                {2, 60000},
                {3, 70000},
                {4, 80000},
                {5, 90000}
        };

        int totalHarga = 0;

        for (int i = 0; i < hargaTiket.length; i++) {
            System.out.println("Harga tiket film " + hargaTiket[i][0] + ": " + hargaTiket[i][1]);
            totalHarga += hargaTiket[i][1];
        }

        //Total ticket price
        System.out.println("Total harga tiket: " + totalHarga);
    }
}
