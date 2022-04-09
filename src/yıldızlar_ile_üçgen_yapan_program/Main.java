package yıldızlar_ile_üçgen_yapan_program;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();
        for (int i = 0;i<sayi;i++) {
            for (int j = sayi;j>(i+1);j--) {
                System.out.print(" ");
            }
            for (int k = 1;k<=(2*i+1);k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int temp = 1;
        for(int i = (sayi-1); i > 0; i--){
            for(int j = 0; j < temp; j++)
                System.out.print(" ");
            temp += 1;
            for(int k=0; k < (i*2)-1; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
