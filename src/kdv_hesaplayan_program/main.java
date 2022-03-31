package kdv_hesaplayan_program;

import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        double para_miktari,KDV_eklenen_fiyat,KDV_tutari;
        Scanner para = new Scanner(System.in);
        System.out.print("hesaplanacak para miktarını giriniz :");
        para_miktari = para.nextDouble();
        if (para_miktari <= 1000){
            KDV_tutari = (para_miktari*18)/100;
            KDV_eklenen_fiyat = para_miktari + KDV_tutari;
            System.out.print("girilen para miktarı :"+para_miktari+"\nKdv tutarı :"+KDV_tutari+"\nSon para :"+KDV_eklenen_fiyat);
        }
        else if (para_miktari > 1000){
            KDV_tutari = (para_miktari*8)/100;
            KDV_eklenen_fiyat = para_miktari + KDV_tutari;
            System.out.print("girilen para miktarı :"+para_miktari+"\nKdv tutarı :"+KDV_tutari+"\nSon para :"+KDV_eklenen_fiyat);
        }
    }
}
