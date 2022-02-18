import java.util.Scanner;
public class BolmeIslemindeBolumIleKalaniToplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kalan,toplam,bolme;
        System.out.print("Lütfen bölünecek sayıyı giriniz: ");
        int sayi1=input.nextInt();
        System.out.print("Lütfen bölen sayıyı giriniz: ");
        int bolen=input.nextInt();
        bolme = sayi1 / bolen;
        kalan= sayi1 %bolen;
        toplam = kalan + bolme;
        System.out.print("Kalan ve bölümün toplamı : " + toplam);


    }
}
