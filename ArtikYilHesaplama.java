import java.util.Scanner;
public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
        System.out.print("Lütfen bir yıl giriniz: ");
        yil=input.nextInt();
        boolean sonuc = ((yil%4==0) && (yil%100!=0 || yil%400==0));
        if (sonuc) {
            System.out.println(yil + " artık yıldır");
        }
        else {
            System.out.println(yil + " artık yıl değildir");
        }
    }
}
