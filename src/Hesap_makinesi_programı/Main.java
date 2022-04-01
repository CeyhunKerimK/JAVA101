package Hesap_makinesi_programı;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float sayi1 , sayi2 , toplam , carpim , cıkarma , bolme ;
        int secim;
        Scanner myInput = new Scanner(System.in);
        System.out.print("yapılacak işlemin sayısını giriniz:\nToplama -> 1\nÇıkarma -> 2\nÇarpma -> 3\nBölme -> 4\nsayıyı giriniz: ");
        secim = myInput.nextInt();
        switch (secim){
            case 1:
                System.out.print("birinci sayıyı giriniz: ");
                sayi1 = myInput.nextFloat();
                System.out.print("ikinci sayıyı giriniz: ");
                sayi2 = myInput.nextFloat();
                toplam = sayi1 + sayi2;
                System.out.print("Bulunan sonuç: "+toplam);
                break;
            case 2:
                System.out.print("birinci sayıyı giriniz: ");
                sayi1 = myInput.nextFloat();
                System.out.print("ikinci sayıyı giriniz: ");
                sayi2 = myInput.nextFloat();
                cıkarma = sayi1 - sayi2;
                System.out.print("bulunan sonuç: "+cıkarma);
                break;
            case 3:
                System.out.print("birinci sayıyı giriniz: ");
                sayi1 = myInput.nextFloat();
                System.out.print("ikinci sayıyı giriniz: ");
                sayi2 = myInput.nextFloat();
                carpim = sayi1 * sayi2;
                System.out.print("bulunan sonuç: "+carpim);
                break;
            case 4:
                System.out.print("birinci sayıyı giriniz: ");
                sayi1 = myInput.nextFloat();
                System.out.print("ikinci sayıyı giriniz: ");
                sayi2 = myInput.nextFloat();
                bolme = sayi1 / sayi2;
                System.out.print("bulunan sonuç: "+bolme);
                break;
        }
    }
}
