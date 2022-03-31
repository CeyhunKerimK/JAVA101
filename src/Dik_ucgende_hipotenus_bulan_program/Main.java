package Dik_ucgende_hipotenus_bulan_program;
import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        double kenar_a,kenar_b,kenar_c,hipotenus,ucgen_alan,ucgenin_cevresi;
        Scanner input = new Scanner(System.in);
        System.out.print("birinci kenar uzunluğunu giriniz :");
        kenar_a = input.nextFloat();
        System.out.print("ikinci kenar uzunluğunu giriniz :");
        kenar_b = input.nextFloat();
        hipotenus = (Math.pow(kenar_a,2)) + (Math.pow(kenar_b,2));
        kenar_c = Math.sqrt(hipotenus);
        ucgen_alan = (kenar_a+kenar_b+kenar_c)/2;
        ucgenin_cevresi = (kenar_a+kenar_b+kenar_c);
        System.out.print("ucgenin alanı :"+ucgen_alan+"\nucgenin çevresi :"+ucgenin_cevresi);

    }

}
