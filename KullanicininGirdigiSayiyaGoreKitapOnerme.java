import java.util.Scanner;
public class KullanicininGirdigiSayiyaGoreKitapOnerme {
    public static void main(String[] args) {
        //Kullanıcının girdiği sayıya göre zaten veritabanında tutulan kitabı
        //Kullanıcıya öneren program
        // IF Else ve Switch ile...

        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.print("Hoşgeldiniz. Adınız nedir ? :");
        String isim = input.nextLine();
        System.out.println("Hoşgeldin " + isim);
        System.out.print("Lütfen 1-5 arasında bir sayı giriniz : ");
        sayi=input.nextInt();
        //If-Else ile

        /*if (sayi==1) {
            System.out.println("Monte Kristo Kontu");
        }
        else if (sayi==2) {
            System.out.println("Oblomov");
        }
        else if (sayi ==3) {
            System.out.println("Karamozov Kardeşler");
        }
        else if (sayi==4) {
            System.out.println("Üç Silahşörler");
        }
        else if (sayi>5) {
            System.out.println("1-5 arasında bir sayı giriniz");
        }
        else {
            System.out.println("Buz ve Ateşin Şarkısı");
        }

         */
        switch (sayi) {
            case 1:
                System.out.println("Monte Kristo Kontu");
                break;
            case 2:
                System.out.println("Oblomov");
                break;
            case 3:
                System.out.println("Karamozov Kardeşler");
                break;
            case 4:
                System.out.println("Üç Silahşörler");
                break;
            case 5:
                System.out.println("Buz ve Ateşin Şarkısı");
                break;
            default:
                System.out.println("1-5 arasında bir sayı giriniz");
                break;
        }
    }
}
