package Üs_hesabı_yapan_program;
import java.util.Scanner;
public class Main {
    static int f(int num , int pow) {
        if (pow < 1)
            return 1;
        else
            return num*f(num,pow-1);

    }
    public static void main(String[] args) {
        int pow,num;
        Scanner input = new Scanner(System.in);
        System.out.println("taban sayıyı girin: ");
        num = input.nextInt();
        System.out.println("üssü girin: ");
        pow = input.nextInt();
        System.out.print("Sonuc: "+f(num,pow));
    }
}
