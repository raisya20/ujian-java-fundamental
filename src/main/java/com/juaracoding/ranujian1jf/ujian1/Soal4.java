package com.juaracoding.ranujian1jf.ujian1;

import java.util.Scanner;
//Perulangan

public class Soal4 {
    public static void main(String[] args) {
        //Added Array
        String[] daftarFilm = new String[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Daftar film bioskop\n");
        // Input film name
        for (int i = 0; i < daftarFilm.length; i++) {
            System.out.print("Masukkan nama film " + (i + 1) + ": ");
            daftarFilm[i] = scanner.nextLine(); // save film name to Array
        }
        // Print list film
        System.out.println("\nFilm yang ingin ditonton:");
        for (int i = 0; i < daftarFilm.length; i++) {
            System.out.println((i + 1) + ". " + daftarFilm[i]);
        }
        scanner.close();
    }
}
