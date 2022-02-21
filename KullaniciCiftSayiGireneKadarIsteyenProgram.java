import java.util.Scanner;

public class KullaniciCiftSayiGireneKadarIsteyenProgram {
    //Kullanıcı tek sayı girene kadar sayı isteyen ve
    //Girilen sayılardan 4'ün katı olanları toplayan program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 0;
        int sayi;

        do {
            System.out.print("Lütfen bir sayı giriniz: ");
            sayi = input.nextInt();
            if (sayi%4==0) {
                toplam = toplam + sayi;
            }
        }while(sayi%2==0);
        System.out.print("Girilen sayılardan 4 ün katlarının toplamı : " + toplam);



    }
}
