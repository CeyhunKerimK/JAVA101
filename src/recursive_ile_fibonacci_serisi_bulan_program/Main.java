package recursive_ile_fibonacci_serisi_bulan_program;
import java.util.Scanner;
public class Main {
    static int f(int n){
        if ((n==1)||(n==2))
            return 1;
        return f(n-1) + f(n-2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("son sayıyı giriniz: ");
        int n = input.nextInt();
        System.out.print("Bulunan sonuc: "+f(n));
    }
}
