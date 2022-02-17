import java.util.Scanner;

public class sinifGecmeKalma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik;
        double ortalama;
        int toplam=0;
        int sayac=0;
        System.out.println("Hoşgeldiniz lütfen notlarınızı giriniz ; ");
        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();
        if ((mat<0) || (mat>100)) {
            System.out.println("Lütfen 0-100 arasında bir not giriniz");
            System.out.println("Bu not hesaplamaya dahil edilmeyecektir...");
            sayac+=0;
        }
        else {
        toplam = toplam + mat;
        sayac = sayac + 1;
        }
        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();
        if ((fizik<0) || (fizik>100)) {
            System.out.println("Lütfen 0-100 arasında bir not giriniz");
            System.out.println("Bu not hesaplamaya dahil edilmeyecektir...");
            sayac=sayac + 0;
        }
        else {
            toplam = toplam + fizik;
            sayac = sayac +1;
        }
        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();
        if ((turkce<0) || (turkce>100)) {
            System.out.println("Lütfen 0-100 arasında bir not giriniz");
            System.out.println("Bu not hesaplamaya dahil edilmeyecektir...");
            sayac = sayac + 0;
        }
        else {
            toplam = toplam + turkce;
            sayac = sayac + 1;
        }
        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();
        if ((kimya<0) || (kimya>100)) {
            System.out.println("Lütfen 0-100 arasında bir not giriniz");
            System.out.println("Bu not hesaplamaya dahil edilmeyecektir...");
            sayac = sayac + 0;
        }
        else {
            toplam = toplam + kimya;
            sayac = sayac +1;
        }
        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();
        if ((muzik<0) || (muzik>100)) {
            System.out.println("Lütfen 0-100 arasında bir not giriniz");
            System.out.println("Bu not hesaplamaya dahil edilmeyecektir...");
            sayac = sayac + 0;
        }
        else {
            toplam = toplam + muzik;
            sayac = sayac +1;
        }
        ortalama = toplam / sayac;
        System.out.println(ortalama);

    }
}
