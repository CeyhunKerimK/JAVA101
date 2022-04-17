package sayı_bulma_oyunu;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd_num = new Random();
        int number = rnd_num.nextInt(10);
        int right = 5;
        for (int i = 0  ; i < 5 ; i++){
            System.out.print("0-100 aralığında bir sayı giriniz : ");
            int sayi = input.nextInt();
            if ((sayi < 0) && (sayi > 99)){
                System.out.print("Girilen sayı 0-100 aralığında olmalıdır.");
            }
            else{
                if (sayi == number){
                    System.out.print("kazandınız!!\nSayı : "+number);
                    break;
                }
                else{
                    right -= 1;
                    System.out.println("hakkınız 1 azaldı kalan hakkınız : "+right+" daha dikkatli düşünün");
                    if (right == 0){
                        System.out.println("hakkınız kalmadı\nSayı :"+number+" idi");

                    }
                }
            }
        }

    }
}
