import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı girin : ");
        int usalinacak=input.nextInt();
        System.out.print("üs olacak sayıyı girin : ");
        int us= (input.nextInt());
        int sonuc = 1;
        for ( int k=1 ; k<=us; k++) {
            sonuc = sonuc * usalinacak;

        }
        System.out.print("Sonuç  :  " + sonuc);
    }
}
