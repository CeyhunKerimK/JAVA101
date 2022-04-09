package Harmonik_sayıları_bulan_program;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        double total = 0;
        System.out.print("N sayısını giriniz: ");
        sayi = input.nextInt();
        for (int i = 1 ; i <= sayi ; i++) {
            total += (double) 1/i;
        }
        System.out.println(total);
    }
}
