package Fibonacci_Serisi;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int end_num,num_1 = 0,num_2 = 1,total;
        Scanner input = new Scanner(System.in);
        System.out.print("son sayıyı giriniz: ");
        end_num = input.nextInt();
        for (int i = 0 ; i < end_num ; i++) {
            total = num_1 + num_2;

            System.out.println(total);

            num_1 = num_2;
            num_2 = total;
        }



    }
}
