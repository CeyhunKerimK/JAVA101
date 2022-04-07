package Girilen_sayıya_kadar_olan_4ve5_katları;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi,sinir;
        double dorduncu_kat,besinci_kat;
        Scanner input = new Scanner(System.in);
        System.out.println("sayı: ");
        sinir = input.nextInt();
        for (int k = 1;k<=sinir;k*=4){
            System.out.println("4'ün katı:"+k);
        }
        for (int l = 1;l<=sinir;l*=5){
            System.out.println("5'in katı: "+l);
        }
    }
}


