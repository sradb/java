import java.util.Scanner;
public class GirilenSayininRakamlariniToplama {
    public static void main(String[] args) {
        System.out.println("Programımız sadece 1-999 arasındaki sayılar için çalışır...");
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int sayi1=input.nextInt();
        int toplam1,toplam2,toplam3;
        if (sayi1 < 100 && sayi1>0) {
            toplam1=sayi1%10;
            toplam2=((sayi1%100) - toplam1) / 10;
            System.out.print(toplam1+toplam2);

        }
        else if(sayi1>=100 && sayi1<1000) {
            toplam1=sayi1%10;
            toplam2=((sayi1%100) - toplam1) / 10;
            toplam3=((sayi1%1000) - toplam1 - toplam2) / 100;
            System.out.print(toplam1+toplam2+toplam3);
        }
        else {
            System.out.print("Lütfen 1-999 arasında bir sayı giriniz");
        }

    }
}
