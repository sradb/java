import java.util.Scanner;
public class GirilenSayiNegatifMi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1;
        System.out.print("Lütfen bir sayı giriniz: ");
        sayi1=input.nextInt();
        if (sayi1<0) {
            System.out.print(sayi1 + " sayısı negatiftir");
        }
        else if (sayi1==0) {
            System.out.print("Sayı 0 'dır");
        }
        else {
            System.out.print(sayi1+" sayısı pozitiftir");
        }


    }
}
