package ders11;
import java.util.Scanner;
public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double kilo,boy,vke ;
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();
        vke = kilo / (boy*boy);
        System.out.println("Vücut kitle İndeksiniz : " + vke);
    }
}
