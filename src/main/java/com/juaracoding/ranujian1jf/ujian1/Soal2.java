package com.juaracoding.ranujian1jf.ujian1;

import java.util.Scanner;
//String method
public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama film: ");
        String movie = scanner.nextLine();
        //Using method to convert nama film to Upper Case
        String upperCaseMovie = movie.toUpperCase();
        System.out.println("Nama film dalam huruf besar: " + upperCaseMovie);

        scanner.close();
    }
}
