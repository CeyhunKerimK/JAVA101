package recursive_desen_oluşturma;
import java.util.Scanner;
public class Main {
    static void draw(int n) {
        if (n <= 0) {
            System.out.print(" " + n);
            return;
        }
        System.out.print(" "+n);
        draw(n-5);
        System.out.print(" "+n);

    }
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("--------------------------------");
            System.out.println("bir sayı giriniz: ");
            n = input.nextInt();
            System.out.print("sonuc: ");
            draw(n);
            System.out.print("\n");
        }
    }
}
