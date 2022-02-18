import java.util.Scanner;
public class AtmUygulamasiSwitchCase {
    public static void main(String[] args) {
        System.out.println("ParaBank'a hoşgeldiniz...");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçer misiniz; ");
        System.out.println("1-Para Yatırma");
        System.out.println("2-Para Çekme");
        System.out.println("3-Bakiye Sorgulama");
        System.out.println("4-Çıkış");
        int bakiye=5000;
        int toplam=0;
        Scanner input = new Scanner(System.in);
        int secim = input.nextInt();
        switch (secim) {
            case 1:
                System.out.print("Lütfen yatırmak istediğiniz tutarı giriniz : ");
                int yatirilacak= (input.nextInt());
                toplam = bakiye + yatirilacak;
                System.out.println("Para yatırma işleminiz başarıyla gerçekleştirildi...");
                System.out.println("Yeni bakiyeniz : " + toplam + " TL");
                break;
            case 2:
                System.out.print("Lütfen çekmek istediğiniz tutarı giriniz: ");
                int cekilecek=input.nextInt();
                if (cekilecek>bakiye) {
                    System.out.println("Çekilecek tutar, toplam bakiyeden büyük olamaz!");
                }
                else if(cekilecek<=bakiye) {
                    toplam=bakiye-cekilecek;
                    System.out.println("Para çekme işleminiz başarıyla gerçekleştirildi...");
                    System.out.println("Yeni bakiyeniz : " + toplam + " TL");
                }

                break;
            case 3:
                System.out.println("Toplam bakiyeniz: " + bakiye + " TL");
                break;
            case 4:
                System.out.println("ParaBank mutlu günler diler. Hoşçakalın...");
                break;
            default:
                System.out.println("Lütfen 1-4 arasında bir seçim yapınız");
                break;
        }


    }
}
