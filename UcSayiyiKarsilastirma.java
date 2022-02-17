import java.util.Scanner;
public class UcSayiyiKarsilastirma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1,sayi2,sayi3;
        System.out.print("Sayı 1'i giriniz: ");
        sayi1=input.nextInt();
        System.out.print("Sayı 2'yi giriniz: ");
        sayi2=input.nextInt();
        System.out.print("Sayı 3'ü giriniz: ");
        sayi3=input.nextInt();

        if (sayi1<sayi2 && sayi1<sayi3) {
            if (sayi2<sayi3) {
                System.out.println("sayı1<sayı2<sayı3");
            }
            else {
                System.out.println("sayı1<sayı3<sayı2");
            }

        }
        else if(sayi2<sayi3 && sayi2 <sayi1) {
            if (sayi1<sayi3) {
                System.out.println("sayı2<sayı1<sayı3");
            }
            else {
                System.out.println("sayı2<sayı3<sayı1");
            }
        }
        else if (sayi3<sayi1 && sayi3<sayi2){
            if (sayi1<sayi2) {
                System.out.println("sayı3<sayı1<sayı2");
            }
            else {
                System.out.println("sayı3<sayı2<sayı1");
            }
        }
    }
}
