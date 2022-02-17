import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ay,gun;
        System.out.print("Kaçıncı ayda doğdunuz giriniz : ");
        ay=(input.nextInt());
        if (ay==1) {
            System.out.print("Lütfen kaçıncı günde doğdunuz giriniz: ");
            gun=(input.nextInt());
            if (gun<=20) {
                System.out.println("Oğlak burcusunuz...");
            }
            else {
                System.out.println("Kova burcusunuz...");
            }
        }
        else if (ay==2) {
            System.out.print("Lütfen kaçıncı günde doğdunuz giriniz: ");
            gun=(input.nextInt());
            if (gun<=18) {
                System.out.println("Kova burcusunuz...");
            }
            else {
                System.out.println("Balık burcusunuz...");
            }
        }
        else if (ay==3) {
            System.out.print("Lütfen kaçıncı günde doğdunuz giriniz: ");
            gun=(input.nextInt());
            if (gun<=20) {
                System.out.println("Balık burcusunuz...");
            }
            else {
                System.out.println("Koç burcusunuz...");
            }
        }
        else if (ay==4) {
            System.out.print("Lütfen kaçıncı günde doğdunuz giriniz: ");
            gun=(input.nextInt());
            if (gun<=20) {
                System.out.println("Koç burcusunuz...");
            }
            else {
                System.out.println("Boğa burcusunuz...");
            }
        }
        else if (ay==5) {
            System.out.print("Lütfen kaçıncı günde doğdunuz giriniz: ");
            gun=(input.nextInt());
            if (gun<=20) {
                System.out.println("Boğa burcusunuz...");
            }
            else {
                System.out.println("İkizler burcusunuz...");
            }
        }
        else if (ay==6) {
            System.out.print("Lütfen kaçıncı günde doğdunuz giriniz: ");
            gun=(input.nextInt());
            if (gun<=21) {
                System.out.println("İkizler burcusunuz...");
            }
            else {
                System.out.println("Yengeç burcusunuz...");
            }
        }
        else if (ay==7) {
            System.out.print("Lütfen kaçıncı günde doğdunuz giriniz: ");
            gun=(input.nextInt());
            if (gun<=22) {
                System.out.println("Yengeç burcusunuz...");
            }
            else {
                System.out.println("Aslan burcusunuz...");
            }
        }
        else if (ay==8) {
            System.out.print("Lütfen kaçıncı günde doğdunuz giriniz: ");
            gun=(input.nextInt());
            if (gun<=22) {
                System.out.println("Aslan burcusunuz...");
            }
            else {
                System.out.println("Başak burcusunuz...");
            }
        }
        else if (ay==9) {
            System.out.print("Lütfen kaçıncı günde doğdunuz giriniz: ");
            gun=(input.nextInt());
            if (gun<=22) {
                System.out.println("Başak burcusunuz...");
            }
            else {
                System.out.println("Terazi burcusunuz...");
            }
        }
        else if (ay==10) {
            System.out.print("Lütfen kaçıncı günde doğdunuz giriniz: ");
            gun=(input.nextInt());
            if (gun<=23) {
                System.out.println("Terazi burcusunuz...");
            }
            else {
                System.out.println("Akrep burcusunuz...");
            }
        }
        else if (ay==11) {
            System.out.print("Lütfen kaçıncı günde doğdunuz giriniz: ");
            gun=(input.nextInt());
            if (gun<=22) {
                System.out.println("Akrep burcusunuz...");
            }
            else {
                System.out.println("Yay burcusunuz...");
            }
        }
        else if (ay==12) {
            System.out.print("Lütfen kaçıncı günde doğdunuz giriniz: ");
            gun=(input.nextInt());
            if (gun<=21) {
                System.out.println("Yay burcusunuz...");
            }
            else {
                System.out.println("Oğlak burcusunuz...");
            }
        }
    }
}
