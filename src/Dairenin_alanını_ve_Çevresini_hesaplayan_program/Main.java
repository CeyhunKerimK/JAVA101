package Dairenin_alanını_ve_Çevresini_hesaplayan_program;
import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        double yaricap,pi = 3.14,merkez_aci,daire_alan,daire_cevre,daire_diliminin_alan;
        Scanner input = new Scanner(System.in);
        System.out.print("yarıçap değerini giriniz : ");
        yaricap = input.nextDouble();
        System.out.print("merkez açıyı giriniz :");
        merkez_aci = input.nextDouble();
        daire_alan = pi * Math.pow(yaricap,2);
        daire_cevre = 2 * yaricap * pi;
        daire_diliminin_alan = (pi * (Math.pow(yaricap,2))*merkez_aci)/360;
        System.out.print("Dairenin cevresi :"+daire_cevre+"\nDairenin alanı :"+daire_alan+"\nDaire diliminin alanı :"+daire_diliminin_alan);


    }
}
