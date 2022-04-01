package Manav_kasa_programı;
import java.util.Scanner;

/*Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL*/

public class Main {
    public static void main(String[] args) {
        double  armut_kilo,elma_kilo,domates_kilo,muz_kilo,patlıcan_kilo;
        double armut_fiyat = 2.14,elma_fiyat = 3.67,muz_fiyat = 0.95,domates_fiyat = 1.11,patlıcan_fiyat = 5.00;
        // double ifadelerde nokta sonrasını sayı fazlalığı olmaması için toplam fiyatı float olarak atadık.
        float toplam_fiyat;
        Scanner myInput = new Scanner(System.in);
        System.out.print("Kaç kilogram armut aldınız: ");
        armut_kilo = myInput.nextDouble();
        System.out.print("Kaç kilogram elma aldınız: ");
        elma_kilo = myInput.nextDouble();
        System.out.print("Kaç kilogram domates aldınız: ");
        domates_kilo = myInput.nextDouble();
        System.out.print("Kaç kilogram muz aldınız: ");
        muz_kilo = myInput.nextDouble();
        System.out.print("Kaç kilogram patlıcan aldınız: ");
        patlıcan_kilo = myInput.nextDouble();
        // gelen double ifadeleri float tipine döntirmek için işlemi float olarak belirttik.
        toplam_fiyat = (float) ((armut_kilo*armut_fiyat)+(elma_kilo*elma_fiyat)+(domates_kilo*domates_fiyat)+(muz_kilo*muz_fiyat)+(patlıcan_kilo*patlıcan_fiyat));
        System.out.print("Ödeyeceğiniz toplam tutar: "+toplam_fiyat);

    }
}
