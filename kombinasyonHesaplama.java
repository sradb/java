import java.util.Scanner;

public class kombinasyonHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kombi=1;
        int kombinasyon=1;
        int kombi2=1;
        int sonuc=1;
        System.out.print("Lütfen eleman sayısı girin : ");
        int eleman = input.nextInt();
        System.out.print("Lütfen bir r sayısı girin : ");
        int r = (input.nextInt());

        for(int i =1; i<=eleman;i++) {
            kombi=kombi * i;
        }
        for (int k = 1; k<=r;k++) {
            kombinasyon=kombinasyon*k;

        }
        for (int j=1;j<=(eleman-r);j++){
            kombi2=kombi2*j;
        }
        sonuc = sonuc * (kombi/(kombinasyon*(kombi2)));
        System.out.print("Sonuç : " + sonuc);
    }
}
