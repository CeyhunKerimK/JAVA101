package Max_min_bulan_program;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int adet,sayi,max=0,min=0;
        Scanner input = new Scanner(System.in);
        System.out.println("kaç adet sayi gireceksiniz: ");
        adet = input.nextInt();
        for (int i = 0;i<adet;i++) {
            System.out.print("sayı giriniz: ");
            sayi = input.nextInt();
            if (sayi < min){
                min = sayi;
            }
            else if (sayi > max) {
                max = sayi;
            }
        }
        System.out.println("Maksimum sayı: "+max+"\nMinimum sayı: "+min);

    }
}
