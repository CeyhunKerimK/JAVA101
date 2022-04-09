package basamak_sayılarının_toplamını_hesaplayan_program;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi,a,number_count = 0,total=0;
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        sayi = input.nextInt();
        int tempNUmber = sayi;
        int basValue;
        while (tempNUmber != 0){
            tempNUmber = tempNUmber/10;
            number_count +=1;
        }
        tempNUmber = sayi;
        while (tempNUmber != 0){
            basValue = tempNUmber % 10;
            total += basValue;
            tempNUmber /= 10;
        }
        System.out.println(total);
    }
}
