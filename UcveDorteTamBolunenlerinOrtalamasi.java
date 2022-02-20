import java.util.Scanner;
public class UcveDorteTamBolunenlerinOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.print("Lütfen bir sayı giriniz : ");
        int sayi = input.nextInt();
        int sayac = 0;
        int toplam = 0 ;
        for (int i =1; i<=sayi ; i++) {
            if(i%3==0) {
                if(i%4==0) {
                    sayac= sayac + 1;
                    toplam = toplam +i;

                }
            }
        }
            System.out.println(toplam / sayac);
    }
}
