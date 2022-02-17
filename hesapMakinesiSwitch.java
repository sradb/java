import java.util.Scanner;

public class hesapMakinesiSwitch {
    public static void main(String[] args) {
        // Switch Case ile Hesap Makinesi
        int sayi1,sayi2,secim;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı 1 giriniz: " );
        sayi1=input.nextInt();
        System.out.print("Sayı 2 giriniz: " );
        sayi2=input.nextInt();
        System.out.println("Yapmak istediğiniz işlem nedir ? : (1-Toplama,2-Çıkarma,3-Çarpma,4-Bölme)" );
        secim=input.nextInt();
        switch (secim){
            case 1:
                System.out.println(sayi1+sayi2);
                break;
            case 2:
                System.out.println(sayi1-sayi2);
                break;
            case 3:
                System.out.println(sayi1*sayi2);
                break;
            case 4:
                System.out.println(sayi1/sayi2);
                break;
        }
    }
}
