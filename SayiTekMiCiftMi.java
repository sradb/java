import java.util.Scanner;
public class SayiTekMiCiftMi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sayıyı giriniz: ");
        int sayi1=input.nextInt();
        if (sayi1%2==0) {
            System.out.print("Sayı çifttir");
        }
        else{
            System.out.print("Sayı tektir");
        }
    }
}
