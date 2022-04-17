package mayın_tarlası_oyunu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("mayın tarlasına hoşgeldiniz");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz");
        int row,column;
        System.out.println("Lütfen mayın tarlasının enini giriniz : ");
        row = input.nextInt();
        System.out.println("Lütfen mayın tarlasının uzunluğunu giriniz : ");
        column = input.nextInt();

        MineSweeper msn = new MineSweeper(row,column);
        msn.run();

    }
}
