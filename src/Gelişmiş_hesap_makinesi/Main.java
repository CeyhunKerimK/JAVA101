package Gelişmiş_hesap_makinesi;
import java.util.Scanner;
public class Main {
    static int plus(int a , int b) {
        int total = a + b;
        return total;
    }
    static int minus(int a , int b) {
        int total = a + b;
        return total;
    }
    static int times(int a , int b) {
        int total = a * b;
        return total;
    }
    static int divided(int a , int b) {
        int total = a / b;
        return total;
    }
    static int power(int a , int b) {
        int total = 1;
        for (int i = 1 ; i <= b ; i++) {
            total *= a;
        }
        return total;
    }
    static int factoriel(int b) {
        int total = 1;
        for (int i = 1 ; i<=b ; i++) {
            total *= i;
        }
        return total;
    }
    static int mod(int a , int b) {
        int total;
        total = a % b;
        return total;
    }
    static int retangle(int a , int b) {
        int space = a*b;
        int env = 2*(a+b);
        System.out.print("Çevresi: "+env+"\nAlan: "+space+"\n");
        return 1;
    }
    public static void main(String[] args) {
        int select,a,b;
        Scanner input = new Scanner(System.in);
        String menu = "bir işlem seçiniz\n---------------------" +
                "\n1-)Toplama -> 1" +
                "\n2-)Çıkarma -> 2" +
                "\n3-)Çarpma -> 3" +
                "\n4-)Bölme -> 4" +
                "\n5-)Üslü Sayı Hesaplama -> 5" +
                "\n6-)Faktoriyel Hesaplama -> 6" +
                "\n7-)Mod alma -> 7" +
                "\n8-)Dikdörtgen alan ve çevre hesaplama -> 8" +
                "\n9-)Çıkış -> 9";
        do {
            System.out.println(menu);
            select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.println("birinci sayıyı giriniz: ");
                    a = input.nextInt();
                    System.out.println("ikinci sayıyı giriniz: ");
                    b = input.nextInt();
                    System.out.println("Sonuc: "+plus(a,b));
                    break;
                case 2:
                    System.out.println("birinci sayıyı giriniz: ");
                    a = input.nextInt();
                    System.out.println("ikinci sayıyı giriniz: ");
                    b = input.nextInt();
                    System.out.println("Sonuc: "+minus(a,b));
                    break;
                case 3:
                    System.out.println("birinci sayıyı giriniz: ");
                    a = input.nextInt();
                    System.out.println("ikinci sayıyı giriniz: ");
                    b = input.nextInt();
                    System.out.println("Sonuc: "+times(a,b));
                    break;
                case 4:
                    System.out.println("birinci sayıyı giriniz: ");
                    a = input.nextInt();
                    System.out.println("ikinci sayıyı giriniz: ");
                    b = input.nextInt();
                    System.out.println("Sonuc: "+divided(a,b));
                    break;
                case 5:
                    System.out.println("tabanı giriniz sayıyı giriniz: ");
                    a = input.nextInt();
                    System.out.println("üs sayıyı giriniz: ");
                    b = input.nextInt();
                    System.out.println("Sonuc: "+power(a,b));
                    break;
                case 6:
                    System.out.println("factoriyeli hesaplanacak sayıyı giriniz: ");
                    b = input.nextInt();
                    System.out.println("Sonuc: "+factoriel(b));
                    break;
                case 7:
                    System.out.println("modu alınacak sayıyı giriniz: ");
                    a = input.nextInt();
                    System.out.println("modu giriniz: ");
                    b = input.nextInt();
                    System.out.println("Sonuc: "+mod(a,b));
                    break;
                case 8:
                    System.out.println("birinci sayıyı giriniz: ");
                    a = input.nextInt();
                    System.out.println("ikinci sayıyı giriniz: ");
                    b = input.nextInt();
                    System.out.println(retangle(a,b));
                    break;
                case 9:
                    break;
            }
        }while (select != 9);
    }
}
