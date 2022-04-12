package recursive_asal_sayı_bulan_program;
import java.util.Scanner;
public class Main {
    static boolean f(int num , int a) {
        if (num <= 2)
            return (num == 2) ? true : false;
        if (num % a == 0)
            return false;
        if (a * a > num)
            return true;
        return f(num,a+1);
    }
    public static void main(String[] args) {
        int num,a;
        Scanner input = new Scanner(System.in);
        System.out.print("sayıyı giriniz: ");
        num = input.nextInt();
        if (f(num,2))
            System.out.println(num+" sayısı ASALDIR !");
        else
            System.out.println(num+" sayısı ASAL değildir !");
    }
}
