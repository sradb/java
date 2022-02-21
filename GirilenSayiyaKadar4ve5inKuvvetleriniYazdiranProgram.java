import java.util.Scanner;
import java.math.*;
public class GirilenSayiyaKadar4ve5inKuvvetleriniYazdiranProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Başladı");
        int sinir;
        System.out.print("Lütfen bir sınır sayısı belirleyin : ");
        sinir = input.nextInt();
        double sonuc4,sonuc5;
        for (int i=1;i<=sinir;i++) {
            sonuc4=Math.pow(4,i);
            sonuc5=Math.pow(5,i);
            System.out.println("4'ün " + i + " .kuvveti : " + sonuc4);
            System.out.println("5'in " + i + " .kuvveti : " + sonuc5);
        }
System.out.println("Program Bitti");
    }
}
