package Vücut_kitle_endeksi_bulan_program;
import java.util.Scanner;

/*Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)*/

public class Main {
    public static void main(String[] args) {
        double kilo,boy,endeks;
        Scanner input = new Scanner(System.in);
        System.out.print("boyunuzu giriniz: ");
        boy = input.nextDouble();
        System.out.print("kilonuzu giriniz: ");
        kilo = input.nextDouble();
        endeks = (kilo/boy)*boy;
        System.out.print("Vücut kitle endeksiniz: "+endeks);
    }
}
