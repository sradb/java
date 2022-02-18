import java.util.Scanner;
public class GirilenSayi3unKatiMi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : " );

        int sayi1= (input.nextInt());
        int kalan=sayi1%3;
        if (sayi1%3==0) {
            System.out.print(sayi1+ " sayısı 3'ün katıdır.");
        }
        else {
            System.out.print(sayi1+ " sayısı 3'ün katı değildir. Kalan : " + kalan + " 'dir.");
        }
    }
}
