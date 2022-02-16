package ders11;
import java.util.Scanner;

public class KdvHesaplayanProgram {
    public static void main(String[] args) {
        int girilenTutar;
        double kdvTutari;
        double kdvliFiyat;
        String kdvorani="%18";
        Scanner giris= new Scanner(System.in);
        System.out.print("Lütfen ürün tutarını giriniz : ");
        girilenTutar=giris.nextInt();
        kdvliFiyat = girilenTutar * 1.18 ;
        kdvTutari=(girilenTutar*1.18) - girilenTutar;
        System.out.println("Kdv Oranı : " + kdvorani);
        System.out.println("Kdvsiz tutar : " + girilenTutar);
        System.out.println("Kdv tutarı: " + kdvTutari);
        System.out.println("Kdvli tutar: " + kdvliFiyat);
    }
}
