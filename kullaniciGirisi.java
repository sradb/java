import java.util.Scanner;
public class kullaniciGirisi {
    public static void main(String[] args) {
        String kullaniciadi,parola;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir kullanıcı adı giriniz: ");
        kullaniciadi=input.nextLine();
        System.out.print("Lütfen bir şifre giriniz: ");
        parola=input.nextLine();

        if((kullaniciadi.equals("Patika")) && (parola.equals("1234")))  {
            System.out.println(("Kullanıcı adı ve şifre doğru"));

        } else {
            System.out.println("Kullanıcı adı veya şifreyi yanlış girdiniz");

            System.out.println("Şifreyi sıfırlamak ister misiniz : 1-Evet , 2-Hayır");

            int secim;
            secim=input.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Lütfen yeni bir şifre giriniz: " + input.nextLine());

                    String yenisifre=input.nextLine();

                    if (yenisifre.equals("1234")) {
                        System.out.println("Yeni şifre eskisi ile aynı olamaz...");
                    } else {
                        System.out.println("Şifre başarıyla oluşturuldu...");
                    }
                    break;
                case 2:
                    System.out.println("Yeni şifre oluşturulmak istenmediği için iyi günler dileriz...");
                    break;
            }

        }
    }
}
