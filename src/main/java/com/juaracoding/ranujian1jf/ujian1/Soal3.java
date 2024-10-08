package com.juaracoding.ranujian1jf.ujian1;

import java.util.Scanner;
//Percabangan
public class Soal3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jumlah tiket: ");
        int jumlahTiket = scanner.nextInt();

        System.out.print("Masukkan jenis hari (weekday/weekend): ");
        String jenisHari = scanner.next().toLowerCase();

        //Ticket price
        int hargaTiket;
        if (jenisHari.equals("weekday")) {
            hargaTiket = 35000; //If weekday
        } else if (jenisHari.equals("weekend")) {
            hargaTiket = 45000; //If weekend
        } else {
            System.out.println("Jenis hari tidak valid.");
            scanner.close();
            return;
        }

        //Count total price
        int totalHarga = hargaTiket * jumlahTiket;
        if (jumlahTiket > 5) {
            totalHarga -= totalHarga * 0.1; // Diskon 10%
        }

        System.out.println("Total harga (dengan diskon) = " + totalHarga);
        scanner.close();
    }
}
