package ders11;
import java.util.Scanner;
public class DaireninAlaniCevresi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double yaricap;
        System.out.print("Lütfen bir yarıçap giriniz: ");
        yaricap=input.nextInt();
        double alan;
        alan= yaricap*yaricap*3.14;
        double cevre;
        cevre=yaricap*3.14*2;
        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi : " + cevre);

    }
}
