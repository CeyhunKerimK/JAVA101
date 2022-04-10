package Ters_üçgen_yazdıran_program;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("üçgenin taban uzunluğunu giriniz: ");
        int taban = input.nextInt();
        int temp = 1;
        for (int i = taban-1 ; i>0;i--){
            for (int j = 0;j<temp;j++)
                System.out.print(" ");
            temp+=1;
            for (int k = 0 ;k < (i*2)-1;k++)
                System.out.print("*");
                System.out.println();
        }
    }
}
