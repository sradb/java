package ders11;


import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int mesafe;
        double tutar;
        System.out.print("Lütfen mesafeyi km cinsinden giriniz : ");
        mesafe = input.nextInt();
        tutar = 10 + (mesafe * 2.2);
        tutar = (tutar<20) ? 20 : tutar;
        System.out.print("Ödenecek ücret : " + tutar + " TL lütfen");

    }
}
