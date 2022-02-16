package ders11;
import java.util.Scanner;
public class DikKenarBulma {
    public static void main(String[] args) {
        int kenar1,kenar2;
        double kenar3;
        Scanner input= new Scanner(System.in);
        System.out.print("1.kenarı giriniz : ");
        kenar1=input.nextInt();
        System.out.print("2.kenarı giriniz : ");
        kenar2=input.nextInt();
        kenar3=Math.sqrt((kenar1*kenar1) + (kenar2*kenar2));
        System.out.print("Hipotenüs uzunluğu: " + kenar3);



    }
}
