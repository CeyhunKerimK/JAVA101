package Sınıf_geçme_durumu;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        int matematik,fizik,kimya,turkce,muzik,toplam,ortalama;
        Scanner myInput = new Scanner(System.in);

        out.print("matematik notunu giriniz: ");
        matematik = myInput.nextInt();
        matematik = ((0 > matematik) || (matematik > 100)) ? 0:matematik;

        out.print("fizik notunu giriniz: ");
        fizik = myInput.nextInt();
        fizik = ((0 > fizik) || (fizik > 100)) ? 0:fizik;

        out.print("kimya notunu giriniz: ");
        kimya = myInput.nextInt();
        kimya = ((0 > kimya) || (kimya > 100)) ? 0:kimya;

        out.print("türkçe notunu giriniz: ");
        turkce = myInput.nextInt();
        turkce = ((0 > turkce) || (turkce > 100)) ? 0:turkce;

        out.print("müzik notunu giriniz: ");
        muzik = myInput.nextInt();
        muzik = ((0 > muzik) || (muzik > 100)) ? 0:muzik;

        toplam = matematik + turkce + fizik + kimya + muzik;
        ortalama = toplam / 5;

        if (ortalama >= 55){
            out.print("Sınıfı geçtiniz.");
        }
        else{
            out.print("kaldınız.");
        }
    }
}

