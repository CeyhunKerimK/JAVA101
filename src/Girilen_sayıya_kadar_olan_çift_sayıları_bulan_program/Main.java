package Girilen_sayıya_kadar_olan_çift_sayıları_bulan_program;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi,toplam=0,adet=0;
        Scanner myInput = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        sayi = myInput.nextInt();
        for (int i=0;i<sayi;i++){
            if ((i%3==0)&&(i%4==0)){
                toplam+=i;
                adet+=1;
            }
        }
        int ortalama=toplam/adet;
        System.out.println("Bulunan ortalama: "+ortalama);
    }
}
