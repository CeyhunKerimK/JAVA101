package Üs_hesabı_yapan_program;
import java.util.Scanner;
public class Main {
    static int f(int a  , int b) {
        int sonuc = 1;
        for (int i = 1 ; i <= b ; i++) {
            sonuc *= a;
        }
        return sonuc;

    }
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("tabanı girin: ");
        a = input.nextInt();
        System.out.println("üs sayıyı girin: ");
        b = input.nextInt();
        System.out.print("Sonuc: "+f(a,b));
    }
}
